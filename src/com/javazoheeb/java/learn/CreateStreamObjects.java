package com.javazoheeb.java.learn;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {

//        create stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        // create a stream from sources
        Collection<String> collection = Arrays.asList("JAVA","J2EE","Spring","Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<String> list = Arrays.asList("JAVA","J2EE","Spring","Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        String[] strArray =  { "a", "b", "c" };
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);

    }
}
