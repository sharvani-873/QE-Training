package com.example;

public class Bicycle implements BicycleOperations,Bicycleparts {
    int gears;
    int currentspeed;
    Bicycle(int gears,int currentspeed){
        this.gears=gears;
        this.currentspeed=currentspeed;
    }
  public int applybrakes(int v){
       return currentspeed-v;

    }   
  public int speedup(int v){
        return currentspeed-v;
  }
  public String bicycledesc(){
    return(gears+"speed"+maxspeed);

  }
  class mountainbike{
    mountainbike(int speed,int applybrake){
    public static void main(String[] args) {
        mountainbike mb=new mountainbike(3,0,25);
        System.out.println(mb.bicycledesc());
        mb.speedup(20);
        mb.applybrake(5);
    }}
  }
}
