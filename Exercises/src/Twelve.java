public class Twelve {
    public static void main(String[] args){
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && temperature < 46 && temperature > 24){
            return true;
        } else return !summer && temperature < 36 && temperature > 24;
    }
}
