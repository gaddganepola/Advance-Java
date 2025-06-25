interface AInterface {

    //By default all variables are public and static
    int age = 55;
    String name = "Roy";

    //By default all methods are public and abstract
    public abstract void show();
    void config();
}

interface X {
    void run();
}

//Interface can extends another interface
interface Y extends X {

}

//Single class can implements multiple interfaces
class CClass implements AInterface, Y {
    //Need to define all the methods of interfaces
    //Here need to define the run method because we implements the Y interface amd that extends the X interface which hold run method
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    public void run() {
        System.out.println("in run");
    }
}

class BClass implements AInterface {

    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        //Direct access of variables with interface name
        System.out.println(AInterface.age);

        //Reference variable creation with interface name
        AInterface obj;

        //Instantiate the object
        obj = new BClass();

        obj.show();
        obj.config();

        CClass obj1 = new CClass();
        obj1.show();
        obj1.config();
        obj1.run();
    }
}
