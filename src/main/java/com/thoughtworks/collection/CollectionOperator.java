package com.thoughtworks.collection;

import com.sun.deploy.util.ArrayUtil;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        try {
            for (int i = left; i != right; i = left < right ? i + 1 : i - 1) {
                list.add(i);
            }
            list.add(right);
        } catch (Exception e) {
            throw new NotImplementedException();
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>();
        try {

            for (int i = left; i != right; i = left < right ? i + 1 : i - 1) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
            if (right % 2 == 0) {
                list.add(right);
            }
        } catch (Exception e) {
            throw new NotImplementedException();
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<>();
        try {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    list.add(array[i]);
                }
            }
        } catch (Exception e) {
            throw new NotImplementedException();
        }
        return list;
    }

    public int popLastElment(int[] array) {
        try {
            return array[array.length - 1];
        } catch (Exception e) {
            throw new NotImplementedException();
        }
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = new ArrayList<>();
        List<Integer> arrayList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        try {
            for (int i : secondArray) {
                if (arrayList.contains(i)) {
                    list.add(i);
                }

            }
        } catch (Exception e) {
            throw new NotImplementedException();
        }
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list = new ArrayList(Arrays.asList(firstArray));
        try{
            Arrays.stream(secondArray)
                    .filter(x->!list.contains(x))
                    .forEach(list::add);

//            for (Integer i:secondArray) {
//                if(!list.contains(i)){
//                    list.add(i);
//                }
//            }
        } catch (Exception e) {
            throw new NotImplementedException();
        }
        return list;
    }
}
