package com.example;

public class Car {
String color;
String transmission;
int make;
int tyres;
int doors;
Car(){
    this.tyres=4;
    this.doors=4;
}
void displayCharacteristics(){
     System.out.println(color);
     System.out.println(transmission);
     System.out.println(make);
     System.out.println(tyres);
     System.out.println(doors);
   
}
void accelerate(){
    System.out.println("Car is moving forward");
}
void brake(){
    System.out.println("Car is stopped");
}
}
