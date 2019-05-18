package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        try {
            return arrayList.stream().max(Integer::compareTo).get();
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public double getMinimum() {
        try {
            return arrayList.stream().min(Integer::compareTo).get();
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public double getAverage() {
        try {
             return arrayList.stream().collect(Collectors.averagingInt(Integer::intValue));
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public double getOrderedMedian() {
        try {
            int size = arrayList.size();
            return size%2==0?(double)(arrayList.get(size/2-1)+arrayList.get(size/2))/2:(double)arrayList.get(size/2-1);
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public int getFirstEven() {
        try {
             return arrayList.stream().filter(x->x%2==0).findFirst().get();
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public int getIndexOfFirstEven() {
        try {
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i)%2==0){
                    return i;
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        try {
            return this.arrayList.stream().sorted().collect(Collectors.toList())
                    .equals(arrayList.stream().sorted().collect(Collectors.toList()));
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        try {
            for (int i = arrayList.size()-1; i >=0 ; i--) {
                if(arrayList.get(i)%2!=0){
                    return arrayList.get(i);
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        try {
            for (int i = arrayList.size()-1; i >=0 ; i--) {
                if(arrayList.get(i)%2!=0){
                    return i;
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return 0;
    }
}
