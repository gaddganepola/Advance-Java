class ATest {
     public void show() {
         System.out.println("in show");
     }

}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        ATest at = new ATest()
        {
            public void show() {
                System.out.println("in new show");
            }
        };
        at.show();
    }
}
