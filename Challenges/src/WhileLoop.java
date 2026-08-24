public class WhileLoop {
    public static void main(String[] args){
        int numberCheck = 5;
        int oddCount = 0;
        int evenCount = 0;
        while(numberCheck <= 20){
            boolean even = isEvenNumber(numberCheck);
            if(!even){
                oddCount++;
                numberCheck++;
                continue;
            }

            System.out.println(numberCheck);
            numberCheck++;
            evenCount++;

            if(evenCount == 5){
                break;
            }
        }
        System.out.println("Number of odd and even numbers found " + (evenCount + oddCount));

        System.out.println("Sum of digits " + sumDigits(3));
    }

    public static boolean isEvenNumber(int number){
        if(number < 0){
            return false;
        } else if (number == 0) {
            return true;
        }else return (number % 2 == 0);
    }

    public static int sumDigits(int number){
        if(number <= 0){
            return -1;
        }else{
            int sum = 0;

            while (number > 9){
                sum += (number % 10);
                number = number / 10;
            }

            sum += number;
            return sum;
        }
    }
}
