public class Hello {
   public static void main(String[] args) {
        System.out.println("Coding");

        int topScore = 80;
        if( topScore > 75 ){
            System.out.println("You have scored high!");
        }
        int secondTopScore = 60;
        if ( topScore > secondTopScore && topScore > 75){
            System.out.print("This is the second top score!");
        }
    }
}
