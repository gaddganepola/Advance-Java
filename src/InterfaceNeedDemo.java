class Laptop {
    public void coding(){
        System.out.println("coding by using laptop");
    }
}

class Developer {
    public void devApp(Laptop lap){
        lap.coding();
    }
}

public class InterfaceNeedDemo {
    public static void main(String[] args) {
        //Before hire a developer need a laptop
        Laptop lap = new Laptop();

        //Hire developer
        Developer dev = new Developer();
        dev.devApp(lap);
    }
}
