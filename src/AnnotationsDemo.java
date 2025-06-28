class MyAnnotation {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in class MyAnnotation");
    }
}

class MyAnnotation2 extends MyAnnotation {
    @Override //Annotation
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in class MyAnnotation2");;
    }
}

public class AnnotationsDemo {
    public static void main(String[] args) {
        MyAnnotation2 ma2 = new MyAnnotation2();
        ma2.showTheDataWhichBelongsToThisClass();
    }
}
