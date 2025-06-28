//Enum class
enum Bike {
    CT100(10000, "Black"), Platina(20000, "White"), Pulsar, Deo, Pleasure;

    private int price;
    private String color;

    Bike() {
        price = 0;
        color = "No Color";
        System.out.println("No args");
    }

    Bike(int price, String color) {
        this.price = price;
        this.color = color;
        System.out.println("Args");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}

public class EnumClassDemo {
    public static void main(String[] args) {

        Bike b = Bike.CT100;
        b.setPrice(5);
        b.setColor("Red");

        System.out.println(b + " : " + b.getPrice() + " : " + b.getColor());


        for (Bike bike : Bike.values()) {
            System.out.println(bike + " : " + bike.getPrice() + " : " + bike.getColor());
        }



    }
}
