package com.example;

public class Generic {
public static void main(String[] args) {
    echo("hello");
}public static<T> T echo(T input) {
    return input;

}
}
