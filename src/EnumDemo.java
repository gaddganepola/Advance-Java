enum Status{
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String[] args) {

        Status[] status = Status.values();
        for (Status s : status) {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
