package access_modifiers;

public class Test {
    public static void main(String[] args){
        Human h = new Human("chuchu");

        h.changeAgeMethod(19);
        h.changeAge(16);
    }
}
