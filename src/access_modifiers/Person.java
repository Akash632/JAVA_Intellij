package access_modifiers;

public class Person {
   private String name = "Akash";

   protected int age;

   public Person(String name, int age){
      this.name = name;
      this.age = age;
   }

   public void getAge(){
      System.out.println(this.name);
   }

   protected void changeAge(int age){
      this.age = age;
   }

}
