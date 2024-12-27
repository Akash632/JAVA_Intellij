//import Enums.Day;
//import Enums.Days;
//import Final_keyword.Vehicle;
//import Final_keyword.Car;
//import Static_keyword.Demo;
//import Static_keyword.Person;
//import access_modifiers.Human;
//
//import java.util.*;
//import java.sql.SQLOutput;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//
//    public static void welcomeUser(){
//        System.out.println("Welcome user");
//    }
//
//    public static int factorial(int n){
//        if(n==1){
//            return 1;
//        }
//        return n*factorial(n-1);
//    }
//
//    public static void reverseAnArray(int arr[]){
//        int j = arr.length-1;
//        for(int i=0; i<arr.length; i++){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            j=j-1;
//
//            if(i>=j){
//                break;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
////        System.out.println("SUNDAY");
//
//        //this is a bad approach, because rather than writing the same constant,
//        //again and again we can create a constant and use.
////        System.out.println(Day.MONDAY);
////        System.out.println(Day.TUESDAY);
//
//        //to make it more simpler we can use an interface because in interface, by default the values are
//        //public static final
//        //TO simplify more, we can use enums.
////
////        System.out.println(Days.FRIDAY);
////
////        Days monday = Days.MONDAY;  //because we have learned, every value in enum is an instance of that enum
////
////        int ordinal = monday.ordinal();
////
////        System.out.println(ordinal); //gives the position of this monday in the enum
////
////        Days enumDay = Days.valueOf("MONDAY");
////
////        Days[] values = Days.values();
////
////        for(Days s : values){
////            System.out.println(s);
////        }
//
//        //Vehicle v = new Car(100); //this is reference of object vehicle, I'm using here.
//
//
////        Person p = new Person();
////
////        System.out.println(p.getName());
////
////        System.out.println(Person.getName());
////
////        Demo d = new Demo();
////
////        Demo.
////        System.out.println(Person.count); // we can directly acess count here, because it is attached with class
////        //but not with the instance.
////
////        welcomeUser();
//
//        int num = 5;
//        System.out.println(factorial(num));
//
//        int[] arr= {1,2,3,4,5};
//        reverseAnArray(arr);
//
//
//        Human h = new Human("sweety");
//
//    }
//}