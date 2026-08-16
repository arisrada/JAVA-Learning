public class Main {
    public static void main(String[] args){
        convertToCentimeters(5, 8);
        convertToCentimeters(6, 0);
        convertToCentimeters(1, 0);
        System.out.println("cm : " + convertToCentimeters(68));
        getDurationString(3945);
        getDurationString(-65);
    }

    public static double convertToCentimeters(int heightInInches){
        return  heightInInches * 2.54;
    }

    public static void convertToCentimeters(int heightInFeet, int heightInInches){
        int height = (heightInFeet * 12) + heightInInches;
      double result =  convertToCentimeters(height);
      System.out.println("result " + result);
    }

    public static void getDurationString(int seconds){
        if(seconds >= 0){
            getDurationString(seconds / 60, seconds % 60);
        }else{
            System.out.println("Invalid value");
        }

    }

    public static void getDurationString(int minutes, int seconds){
        if(minutes >= 0 && seconds >= 0 && seconds <= 59){
            System.out.println(minutes / 60 + " hr : " + minutes % 60 + " min : " + seconds + " sec");
        }else{
            System.out.println("Invalid value");
        }
    }


}