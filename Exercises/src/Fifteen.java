public class Fifteen {
    public static void main(String[] args){
        System.out.println("Value " + sumOdd(1, 100));
        System.out.println("Value " + sumOdd(-1, 100));
        System.out.println("Value " + sumOdd(100, 100));
        System.out.println("Value " + sumOdd(13, 13));
        System.out.println("Value " + sumOdd(100, -100));
        System.out.println("Value " + sumOdd(100, 1000));
    }

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }else return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if(start <= 0 || end <= 0 || end < start){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            boolean odd = isOdd(i);
            if (odd){
                sum += i;
            }
        }
        return sum;
    }
}
