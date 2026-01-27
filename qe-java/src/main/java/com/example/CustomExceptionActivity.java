package com.example;

public class CustomExceptionActivity {
    public static void exception(String message) throws customexception {
        if(message==null){
            throw new customexception("No message");
        }else{
            System.out.println(message);
        }
    }
    public static void main(String[] args){
        try{
            exception(null);
            exception("heyyyy");
        }catch(customexception e){
System.out.println(e.getMessage());
        }
    }

}
