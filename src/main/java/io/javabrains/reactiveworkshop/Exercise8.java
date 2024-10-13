package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        // Rea 

        // Print values from intNumbersFluxWithException and continue on errors
        // ReactiveSources.intNumbersFluxWithException()
        // .onErrorContinue((e,item)-> System.out.println(e.getMessage()+item))
        // .subscribe(e -> System.out.println(e));

        // Print values from intNumbersFluxWithException and when errors
        ReactiveSources.intNumbersFluxWithException()
        .onErrorResume(err -> Flux.just(-1,-2))
        .subscribe(e -> System.out.println(e));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
