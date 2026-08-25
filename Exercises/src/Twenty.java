public class Twenty {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree){
        if(!isValid(numberOne) || !isValid(numberTwo) || !isValid(numberThree) ){
            return false;
        }

        int oneLastDigit = numberOne % 10;
        int twoLastDigit = numberTwo % 10;
        int threeLastDigit = numberThree % 10;

        return ((oneLastDigit == twoLastDigit) || (twoLastDigit == threeLastDigit) || (threeLastDigit == oneLastDigit));
    }

    public static boolean isValid(int number){
        return (number <= 1000 && number >= 10);
    }
}
