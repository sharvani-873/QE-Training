package com.example;

public class Activity3 {
public static void main(String[] args) {
    double sec=1000000000;
    double e=31557600;
    double me=0.2408467*e;
    double v=0.61519726*e;
    double m=1.8808158*e;
    double j=11.862615*e;
    double s=29.447498*e;
    double u=84.816846*e;
    double n=164.79132*e;
    System.out.printf("%.2f%n",sec/e);
    System.out.printf("%.2f%n",sec/me);
    System.out.printf("%.2f%n",sec/v);
    System.out.printf("%.2f%n",sec/m);
    System.out.printf("%.2f%n",sec/j);
    System.out.printf("%.2f%n",sec/s);
    System.out.printf("%.2f%n",sec/u);
    System.out.printf("%.2f%n",sec/n);
}
}
