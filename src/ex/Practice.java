package ex;

public class Practice {
    private String name;
    private int score;

    public Practice(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%s %d",
                name,score);
    }
}