package io.javabrains.reactiveworkshop;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // ReactiveSources.intNumbersFlux().subscribe(
        //     e -> System.out.println(e),
        //     err -> System.out.println(err.getMessage()),
        //     () -> System.out.println("completed")
        // );

        // Subscribe to a flux using an implementation of BaseSubscriber
        

        ReactiveSources.intNumbersFlux().subscribe(new MySubscribe<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}


class MySubscribe<T> extends BaseSubscriber<T>{
    
    @Override
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscription happened");
        request(1);
    }

    @Override
    public void hookOnNext(T value) {
        System.out.println(value.toString() + " received");
        request(1);
    }
    
}