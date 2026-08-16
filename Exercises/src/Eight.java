public class Eight {
    public static void main(String[] args){
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int first, int second, int third){
        return (first > 12 && first < 20) || (second > 12 && second < 20) || (third > 12 && third < 20);
    }

    public static boolean isTeen(int age){
        return age > 12 && age < 20;
    }
}
