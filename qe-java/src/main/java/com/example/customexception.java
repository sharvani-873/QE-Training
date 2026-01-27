package com.example;

public class customexception extends Exception{
   private String message;
   public customexception(String message){
    this.message=message;
   }
   @Override
   public String getMessage(){
    return this.message;
   }
}
