package com.thoughtworks.collection;

import org.mockito.stubbing.OngoingStubbing;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> list = new ArrayList<>();
        int c ;
        when(c=random.nextInt(3)).thenReturn(c=2);
        try {
            for (int i = number; i-c > 0; i = i-c) {
                list.add(i-c);
            }
            return list;
        }catch (Exception e) {
            throw new NotImplementedException();
        }
    }
}
