public class One {
    public static  void main(String[] args){
        checkNumber(13);
    }

    public static void checkNumber(int number){
        System.out.println(number > 0 ? "positive" : number < 0 ? "negative" : "zero");
    }
}
