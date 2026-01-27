package com.example;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
      HashSet<String> hs=new HashSet<>();
hs.add("i");
hs.add("hi");
hs.add("ill");
hs.add("is");
hs.add("im");
System.out.println(hs.size());  
hs.remove("is");
System.out.println(hs.size());
hs.remove("sharvani");
System.out.println(hs.size());
if(hs.contains("i")){
System.out.println(true);
}else{
    System.out.println(false);
}
for(String ch:hs){
    System.out.println(ch);
}
    }


}
