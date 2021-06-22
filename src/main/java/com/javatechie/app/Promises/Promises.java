package com.javatechie.app.Promises;

import io.vertx.core.Promise;
import io.vertx.core.Vertx;

public class Promises {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Promise<String> promise = Promise.promise();
    Vertx vertx = Vertx.vertx();
    
    vertx.setTimer(5000, id -> {
    	if(System.currentTimeMillis() % 2L == 0L) {
    		promise.complete("OK!!");
    		System.out.println("Completed");
    	}else {
    		promise.fail(new RuntimeException("Bad Luck"));
    		System.out.println("Failed");
    	}
    });
    
  }
}
