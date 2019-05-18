package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        try {
            return Arrays.stream(array)
                    .flatMap(Arrays::stream)    //扁平化
                    .collect(Collectors.toList());
        }catch (Exception e) {
            throw new NotImplementedException();
        }
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        try {
            return Arrays.stream(array)
                    .flatMap(Arrays::stream)    //扁平化
                    .distinct().collect(Collectors.toList());
        }catch (Exception e) {
            throw new NotImplementedException();
        }
    }
}
