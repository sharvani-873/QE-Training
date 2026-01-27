package com.example;
abstract class Book{
     String title;
     public void setTitle(String s){
        title=s;
     }
     public String getTitle(){
        return title;
     }
    }
public class MyBook extends Book{
    public static void main(String[] args) {
        
     MyBook novel=new MyBook();
     novel.setTitle("heyyy");
     System.out.println(novel.getTitle());


}
}
