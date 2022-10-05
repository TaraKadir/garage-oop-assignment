package games;

public class Player {
    int score;
    private String name;
    public String getName() {
        return name;
    }
    //constructor
    public Player (String name, int score) {
        this.name = name;
        this.score = score;
    }
    public void rageQuit() {
        System.exit(0);
    }
    @Override
    public String toString(){
        return "Name: " + this.name + ", Score: " + this.score;
    }
}