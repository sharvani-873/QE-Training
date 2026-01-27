package com.example;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
public static void main(String[] args) {
    HashMap<Integer,String> m=new HashMap<>();
    m.put(1,"red");
    m.put(2,"yellow");
    m.put(3,"green");
    m.put(4,"blue");
    m.put(5,"pink");
for (Map.Entry< Integer, String> entry : m.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}

    m.remove(4);
if(m.containsValue("green")){
    System.out.println(true);

}else{
    System.out.println(false);
}
System.out.println(m.size());
}
}
