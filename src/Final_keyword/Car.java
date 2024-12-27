package Final_keyword;

public final class Car extends Vehicle {

    public final int speed;

    public Car(int s){
        this.speed = s;
    }

    @Override
    public void accelerate(){
    }

    @Override
    public void deccelerate(){

    }

    public void displaySpeed(){
        System.out.println(speed);
    }

    public final void airBags(){
        System.out.println("4 Airbags");
    }
}
