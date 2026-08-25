public class TwentyFour {
    public static void main(String[] args){
        numberToWords(234);
        numberToWords(100);
        numberToWords(-987);
        System.out.println(getDigitCount(100));
    }

        public static int reverse(int number){
            int num = number < 0 ? -(number) : number;
            int reverse = 0;
            while(num > 0){
                reverse *= 10;
                int lastDigit = num % 10;
                reverse = reverse + lastDigit;
                num /= 10;
            }

            return number < 0 ? -(reverse) : reverse;
        }

        public static void numberToWords(int number){
            if(number < 0){
                System.out.println("Invalid Value");
                return;
            }

            if (number == 0) {
                System.out.println("Zero");
                return;
            }

            int reverse = reverse(number);
            int digitCount = getDigitCount(number);

            while(reverse > 0){
                int last = reverse % 10;
                switch (last){
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    default -> System.out.println("Invalid Value");
                }
                reverse /= 10;
                digitCount--;
            }
            while (digitCount > 0) {
                System.out.println("Zero");
                digitCount--;
            }
        }

        public static int getDigitCount(int number){
            if(number < 0){
                return -1;
            }

            if (number == 0) {
                return 1;
            }

            int count = 0;
            while(number > 0){
                count++;
                number /= 10;
            }

            return count;
        }
}
