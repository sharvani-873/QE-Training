package com.example;

public class Activity2 {
    public static void main(String[] args) {
        int c=0;
        int[] arr={10,77,10,54,-11,10};
        for(int i:arr){
            if(i==10){
                c+=10;
            }
        }if(c==30){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
