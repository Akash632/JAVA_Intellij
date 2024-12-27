package access_modifiers;

public class Human extends Person{
    public Human(String name){
        super(name, 21);
    }

    public void relation(){
        System.out.println(getName());
    }

    public String getName(){
        return getClass().getSimpleName();
    }

    public void changeAgeMethod(int age){
        super.changeAge(age);
    }

}
