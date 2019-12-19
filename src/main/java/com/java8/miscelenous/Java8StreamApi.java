package com.java8.miscelenous;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamApi {
    public static void main(String[] args) {
        //1)
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
       // stream.forEach(pVal -> System.out.println(pVal));
        /*
         * 1 2 3 4 5 6 7 8 9
         */
        System.out.println("Stream.ofarrayOfElements");
        Stream<Integer> streamArray = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        //stream.forEach(streamArrayLV -> System.out.println(streamArrayLV));
        /*
         * 1 2 3 4 5 6 7 8 9
         */

        //List.stream()
        System.out.println("Stream.List");
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream1 = list.stream();
        stream1.forEach(p -> System.out.println(p));


    }

}
/**
 * Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
 * at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
 * at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:658)
 * at com.Nisum.Java8.Java8StreamApi.main(Java8StreamApi.java:17)
 */


        /*1
        2
        3
        4
        5
        6
        7
        8
        9
*/