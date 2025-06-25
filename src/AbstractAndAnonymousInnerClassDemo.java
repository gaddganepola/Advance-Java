abstract class Vehicle {
    public abstract void drive();
    public abstract void playMusic();
}

public class AbstractAndAnonymousInnerClassDemo {
    public static void main(String[] args) {

        //Here it creates an object of anonymous inner class not of abstract class
        Vehicle v = new Vehicle() {
            public void drive() {
                System.out.println("in anonymous inner drive");
            }

            public void playMusic() {
                System.out.println("in anonymous inner playMusic");
            }
        };

        v.drive();
        v.playMusic();
    }
}
