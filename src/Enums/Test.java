package Enums;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Days monday = Days.MONDAY;  //All the constants are the instances of an enum.
        System.out.println(monday);  //MONDAY
        System.out.println(monday.ordinal());  //1
        System.out.println(monday.name()); //MONDAY
        System.out.println(monday.toString()); //MONDAY
        Days[] arr = Days.values();
        System.out.println(Arrays.toString(arr));  //[SUNDAY, MONDAY, TUESDAY, WEDNESDY, THURSDAY, FRIDAY, SATURDAY]
        Days EnumDay = Days.valueOf("MONDAY");
        //if the string is present in the enum, it returns that string, else throws an error.
        System.out.println(EnumDay);
    }

}
