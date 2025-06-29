interface Computer {
    void coding();
}

class Desktop implements Computer {
    public void coding(){
        System.out.println("coding by using desktop");
    }
}

class Laptop implements Computer {
    public void coding(){
        System.out.println("coding by using laptop");
    }
}

class Developer {
    public void devApp(Computer com){
        com.coding();
    }
}

public class InterfaceNeedDemo {
    public static void main(String[] args) {
        //Before hire a developer need a laptop
        Computer lap = new Laptop();
        //Hire developer
        Developer dev1 = new Developer();
        dev1.devApp(lap);

        Developer dev2 = new Developer();
        Computer desk = new Desktop();
        dev2.devApp(desk);
    }
}
