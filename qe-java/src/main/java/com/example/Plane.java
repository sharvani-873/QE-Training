package com.example;
import java.time.LocalDate;
import java.util.ArrayList;
public class Plane {

int maxpassengers=0;
ArrayList<String> arr;
LocalDate lasttimelanded;
boolean fly=false;

Plane(int maxpassengers,ArrayList<String> arr){
    this.maxpassengers=maxpassengers;
    this.arr=arr;
    this.lasttimelanded=LocalDate.now();
    LocalDate C=LocalDate.now();
        public int onboard(String name){
          if (arr.size() < maxPassengers) {
            arr.add(name);
        }
        return arr.size();
    }
    public String Takeoff(){
        if(fly=true){
            return "plane took off";
        }
        return "plane is waiting";
    }
    public void land(){
          fly=true;
          return lasttimelanded;
    }
    public String getlasttimelanded(){
          return lasttimelanded;
    }
    public int getpassengers(int [] arr){
        return arr.size();
    }
}
class Activity6{
    public static void main(String[] args) {
        Plane plane=new Plane(10,arr);
        plane.onboard("vaishnavi");
        plane.onboard("manvitha");
        System.out.println( plane.Takeoff());
        
        
        

    }
}
}
