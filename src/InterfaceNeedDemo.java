class Developer {
    public void devApp(){
        System.out.println("dev app by coding");
    }
}

public class InterfaceNeedDemo {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.devApp();
    }
}
