package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;

public class Test {
    public static void main(String[] args) throws IOException {
        Flux.just(1,2,3).subscribe(System.out::println);
        System.out.println("hello");
        System.in.read();
    }
}
