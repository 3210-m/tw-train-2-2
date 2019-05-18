package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        try {
            return array.stream().filter(x->x%2==0).collect(Collectors.toList());
        }catch (Exception e) {
            throw new NotImplementedException();
        }
    }

    public List<Integer> filterMultipleOfThree() {
        try {
            return array.stream().filter(x->x%3==0).collect(Collectors.toList());
        }catch (Exception e) {
            throw new NotImplementedException();
        }
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        try {
            return firstList.stream().filter(x->secondList.contains(x)).collect(Collectors.toList());
        }catch (Exception e) {
            throw new NotImplementedException();
        }
    }

    public List<Integer> getDifferentElements() {
        try {
            return array.stream().distinct().collect(Collectors.toList());
        }catch (Exception e) {
            throw new NotImplementedException();
        }
    }
}