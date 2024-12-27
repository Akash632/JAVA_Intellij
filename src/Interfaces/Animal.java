package Interfaces;

public interface Animal {
     void eat();

     void sleep();

     int legs = 4;

     public static void info(){
          System.out.println("information");
     }

     default void getInfo(){
          System.out.println("this is info");
     }
}
