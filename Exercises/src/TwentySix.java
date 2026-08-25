public class TwentySix {
    public static void main(String[] args){
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }

        int value = 0;
        for(int i = 2; i <= number; i++ ){

            if(number % i == 0){
                while (number % i == 0) {
                    value = i;
                    number /= i;
                }
            }
        }

        if(value == 0){
            value = number;
        }

        return value;
    }
}
