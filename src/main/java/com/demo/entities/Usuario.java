package com.demo.entities;

public class Usuario {

    public record Person(String name, int age) {
        // No need to explicitly define getters and setters
    }
}
