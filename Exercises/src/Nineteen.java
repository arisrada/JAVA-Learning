public class Nineteen {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        if(numberOne > 99 || numberOne < 10 || numberTwo > 99 || numberTwo < 10 ){
            return false;
        }

        int secondNumber = numberTwo;
        int oneLastDigit = 0;
        int twoLastDigit = 0;

        while(numberOne > 0){
            oneLastDigit = numberOne % 10;

            while(numberTwo > 0){
                twoLastDigit = numberTwo % 10;
                numberTwo /= 10;

                if(oneLastDigit == twoLastDigit){
                    return true;
                }
            }

            numberOne /= 10;
            numberTwo = secondNumber;
        }

        return false;
    }
}
