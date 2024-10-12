package io.javabrains.reactiveworkshop;

import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {


        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(it -> System.out.println(it));

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().filter(it -> it<5).forEach(it -> System.out.println(it) );

        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(it -> it>5).skip(1).limit(2).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        Integer integer = StreamSources.intNumbersStream().filter(it -> it>5).findFirst().orElse(-1); 
        System.out.println(integer);
        // Print first names of all users in userStream
        // StreamSources.userStream().forEach(it -> System.out.println(it.getFirstName()));

        // Print first names in userStream for users that have ImDs from number stream
        StreamSources.intNumbersStream().flatMap( id -> StreamSources.userStream().filter(user -> user.getId()==id)).forEach(System.out::println);

    }

}
