class Desktop {
    public void coding(){
        System.out.println("coding by using desktop");
    }
}

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
        Developer dev1 = new Developer();
        dev1.devApp(lap);

        Developer dev2 = new Developer();
        Desktop desk = new Desktop();
//        dev2.devApp(desk);
    }
}
