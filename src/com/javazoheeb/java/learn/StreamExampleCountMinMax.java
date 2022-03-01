package com.javazoheeb.java.learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleCountMinMax {
    public static void main(String[] args) {
        // count(), min(), and max() methods

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println(stream.count());

        Integer integerMin = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min =>"+integerMin);

        Integer integerMax = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min =>"+integerMax);


    }
}
