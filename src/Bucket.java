import java.util.ArrayList;

public class Bucket {

    ArrayList<String> fruits = new ArrayList<>();
    String fruit;

    public String putFruit(String fruit) {
        fruits.add(fruit);
        this.fruit=fruit;
        return fruit;
    }

    public String takeFruit (String fruit) {
        fruits.remove(0);
        return fruit;
    }

    public void showFruits () {
        System.out.println(fruits);
    }
}

