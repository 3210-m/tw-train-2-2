package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int count = 0;
        try {
            //t是最大的，leftBorder是最小的
            int t = leftBorder>rightBorder?leftBorder:rightBorder;
            leftBorder=leftBorder<rightBorder?leftBorder:rightBorder;
            //从偶数开始
            leftBorder = leftBorder % 2 == 0 ? leftBorder : leftBorder + 1;

            for (int i = leftBorder; i <= t; i = i + 2) {
                count += i;
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return count;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int count = 0;
        try {
            //t是最大的，leftBorder是最小的
            int t = leftBorder>rightBorder?leftBorder:rightBorder;
            leftBorder=leftBorder<rightBorder?leftBorder:rightBorder;
            //从奇数开始
            leftBorder = leftBorder % 2 != 0 ? leftBorder : leftBorder + 1;

            for (int i = leftBorder; i <= t; i = i + 2) {
                count += i;
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return count;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int count = 0;
        try {
            for (int i = 0; i <arrayList.size(); i++) {
                count += (arrayList.get(i)*3)+2;
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return count;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        try {
            int c ;
            for (int i = 0; i <arrayList.size(); i++) {
                c = arrayList.get(i);
                list.add(c%2==0?c:(c*3+2));
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int count = 0;
        try {
            int c;
            for (int i = 0; i <arrayList.size(); i++) {
                c = arrayList.get(i);
                count += c%2==0?0:(c*3)+5;
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return count;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        try {
            int c;
            for (int i = 0; i <arrayList.size(); i++) {
                c = arrayList.get(i);
                if(c%2==0) {
                    list.add(c);
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return list.size()%2==0?((double)(list.get((list.size()/2)-1)+list.get(list.size()/2)))/2:list.get(list.size()/2);
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double count = 0;
        double n = 0;  //个数
        try {
            int c;
            for (int i = 0; i <arrayList.size(); i++) {
                c = arrayList.get(i);
                if(c%2==0){
                    count+=c;
                    n++;
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return count/n;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        try {
            if(specialElment%2==0){
                for (Integer integer : arrayList) {
                    if(integer%2==0&&integer==specialElment){
                        return true;
                    }
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        try{
            for (Integer integer : arrayList) {
                if(integer%2==0&&!list.contains(integer)){
                    list.add(integer);
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return list;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        Integer a[] = new Integer[arrayList.size()];
        try{
            int p = 0,q=a.length-1;//数组角标
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i)%2==0){
                    a[p] = arrayList.get(i);
                    p++;
                }else {
                    a[q]=arrayList.get(i);
                    q--;
                }
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        List<Integer> list = Arrays.asList(a);
        return list;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        try {
            int i = 0;
            int j = i+1;
            while(i<j&&j<arrayList.size()){
                list.add((arrayList.get(i)+arrayList.get(j))*3);
                i++;
                j++;
            }
        }catch (Exception e){
            throw new NotImplementedException();
        }
        return list;
    }
}
