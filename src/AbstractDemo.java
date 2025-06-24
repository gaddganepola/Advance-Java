abstract class Car {
    //Declare a method
    public abstract void drive();

//    public void drive() {
//        //In here we do not know the implementation of the drive method
//    }

    public void playMusic(){
        System.out.println("Play music");
    }
}

class BMW extends Car {
    //Need to define the abstract method in parent class in the child class
    public void drive() {
        System.out.println("Drive BMW");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        //'Car' is abstract; cannot be instantiated
//        Car car = new Car();

        Car newCar = new BMW();

        newCar.playMusic();
        newCar.drive();
    }
}
