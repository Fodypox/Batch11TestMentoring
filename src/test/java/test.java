import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate a random number between 1 and 6 (inclusive)
        int randomNumber = rand.nextInt(6) + 1;
        System.out.println(randomNumber);
    }
}
