package oop;


public class Fruits {
    String name;
    
    Fruits(String name){
    this.name=name;
    }
    
    void eat(){
    System.out.println(name +" eats the grapes");
    }
    void peel(){
    System.out.println(name +" peeled the fruit");
    }
}