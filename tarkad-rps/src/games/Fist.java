package games;
import java.util.Random;

public class Fist {

    //@TODO: where can these fields come to use?
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    //@TODO: You're not using this global field, you can erase it. You have a local variable that does the job.
    private Random random;
    Fist() { random=new Random ();}

    // en metod när den anropas
    //@TODO: You're not calling the method, try calling it in
    public int play() {
        Random playRandom = new Random();
        int result = playRandom.nextInt(3);
        return result;
    }
}