import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bucket bucket = new Bucket();
        Orange orange = new Orange();

        Apple apple = new Apple();
        Banana banana = new Banana();
        bucket.putFruit(orange);
        orange.showFruits();



    }
}
