public class Main {
    public static void main(String[] args) {
    int highScore =    calculateScore(true, 800, 5, 100, true);
        System.out.println("Your final score was " + highScore);
     int highScoreTwo =   calculateScore(true, 10000, 8, 200, false);
        System.out.println("Your final score was " + highScoreTwo);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, boolean shouldIncrement){
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            if(shouldIncrement){
                finalScore += 1000;
            }

        }

        return  finalScore;
    }
}
