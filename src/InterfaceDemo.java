interface AInterface {

    //By default all variables are public and static
    int age = 55;
    String name = "Roy";

    //By default all methods are public and abstract
    public abstract void show();
    void config();
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
    }
}
