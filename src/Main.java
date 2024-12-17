import Enums.Day;
import Enums.Days;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");

        //this is a bad approach, because rather than writing the same constant,
        //again and again we can create a constant and use.
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);

        //to make it more simpler we can use an interface because in interface, by default the values are
        //public static final
        //TO simplify more, we can use enums.

        System.out.println(Days.FRIDAY);

        Days monday = Days.MONDAY;  //because we have learned, every value in enum is an instance of that enum

        int ordinal = monday.ordinal();

        System.out.println(ordinal); //gives the position of this monday in the enum

        Days enumDay = Days.valueOf("MONDAY");

        Days[] values = Days.values();
        
        for(Days s : values){
            System.out.println(s);
        }

    }
}