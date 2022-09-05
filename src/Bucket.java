import java.util.ArrayList;

public class Bucket {
String fruit;
   private ArrayList<String> bucket = new ArrayList<>();


    public ArrayList<String> getBucket() {
        return bucket;
    }

    public void setBucket(ArrayList<String> bucket) {
        this.bucket = bucket;
    }

    public String putFruit(String fruit) {
        bucket.add(fruit);
    }

    public String takeFruit (String fruit) {
        bucket.remove(0);
        return fruit;
    }

    public void showFruits () {
        System.out.println("Now in your bucket: " + bucket);
    }

}

