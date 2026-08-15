public class Methods {
    public static  void  main(String[] args){
        //1500
      int position =  calculateHighScorePosition(1500);
      displayHighScorePosition("Tim", position);
//1000
         position =  calculateHighScorePosition(-1000);
        displayHighScorePosition("Tim", position);
//500
         position =  calculateHighScorePosition(500);
        displayHighScorePosition("Tim", position);
//100
         position =  calculateHighScorePosition(100);
        displayHighScorePosition("Tim", position);
//25
         position =  calculateHighScorePosition(25);
        displayHighScorePosition("Tim", position);
    }

    public static  void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500){
            return 2;
        } else if (playerScore >= 100) {
            return  3;
        }
            return  4;

    }
}
