/**
 * @file stockApiApplication.java
 * Inititiates the Spring-boot application to run, connecting to
 * specified server within the UI.
 */

package com.stocksim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class stockApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(stockApiApplication.class, args);
    }
}
