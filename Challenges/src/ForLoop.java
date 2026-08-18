public class ForLoop {
    public static void main(String[] args){
        System.out.println("It is " + (isPrime(4) ? "a prime number" : "not a prime number"));
        int primeCounter = 0;
//        for(int i = 2; i <= 1000; i++){
//            int counter = 0;
//            for(int j = 1; j <= i; j++ ){
//                if(i % j == 0){
//                    counter++;
//                }
//            }
//            if(counter == 2){
//                primeCounter++;
//            }
//        }
        for(int i = 2; i <= 1000; i++){
            boolean prime = isPrime(i);
            System.out.println(prime);
            if(prime) {
                System.out.println(i);
                primeCounter++;
            }
            if(primeCounter == 3){
                break;
            }
        }
        System.out.println("There are " + primeCounter + " prime numbers in the range of 0 to 1000");

        int value = 0;
        int counterOne = 0;
        for(int k = 1; k <= 1000; k++){
            if(k % 3 == 0 && k % 5 == 0){
                System.out.println(k + " Values that met the conditions");
                value += k;
                counterOne++;
            }
            if(counterOne == 5){
                break;
            }
        }

        System.out.println(value + " is the sum of numbers that met the condition");
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int i = 2; i < wholeNumber; i++){
            if(wholeNumber % i == 0){
                return false;
            }
        }
        return true;
    }
}
