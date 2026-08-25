public class Sixteen {
    public static void main(String[] args){
        System.out.println(isPalindrome(123) ? " is a Palindrome" : " is not a Palindrome");
        System.out.println(isPalindrome(-12221) ? " is a Palindrome" : " is not a Palindrome");
    }

    public static boolean isPalindrome(int number){
        int num = number < 0 ? -(number) : number;
        int reverse = 0;
        while(num > 0){
            reverse *= 10;
            int lastDigit = num % 10;
            reverse = reverse + lastDigit;
            num /= 10;
        }

        return (number < 0 ? -(number) : number) == reverse;
    }
}
