package com.example;

import java.util.ArrayList;

public class Activity9 {
public static void main(String[] args) {
    ArrayList<String> arr=new ArrayList<>();
    arr.add("sharvani");
    arr.add("IBM");
    arr.add("its me");
    arr.add("you");
    arr.add("me");
    for(String ch:arr){
        System.out.print(ch+" ");
    }
System.out.println(arr.get(2));

if(arr.contains("IBM")){
    System.out.println(true);
}else{
    System.out.println(false);
}
System.out.println(arr.size());
arr.remove("IBM");
System.out.println(arr.size());
}}
