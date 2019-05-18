package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        try {
            return array.stream().map(x->x*3).collect(Collectors.toList());
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public List<String> mapLetter() {
        try {
            return array.stream()
                    .map(x -> (char) (x + 96))
                    .map(x->x.toString())
                    .collect(Collectors.toList());
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public List<String> mapLetters() {
        try {
            return array.stream().map(x->intToChatToString(x)).collect(Collectors.toList());
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public List<Integer> sortFromBig() {
        try {
            return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public List<Integer> sortFromSmall() {
        try {
            return array.stream().sorted().collect(Collectors.toList());
        }catch (Exception e){
            throw new NotImplementedException();
        }
    }

    public String intToChatToString(int i){
        String s = "";
        switch (i<26?i/26+1:i%26==0?i/26:(i/26)+1){
            case 1: s = Character.toString((char)(i+96));break;
            case 2: s = "a"+(char)(i+167-97);break;
            case 3: s = "b"+(char)(i+142-98);break;
        }
        return s;
    }
}
