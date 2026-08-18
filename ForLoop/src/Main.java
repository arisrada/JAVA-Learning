public class Main {
    public static void main(String[] args){
//        for(double rate = 2.0; rate < 6 ; rate ++){
//            System.out.println("Interest for " + rate + " % is " + calculateInterest(1000.0, rate));
//        }

        for(double rate = 7.5; rate <= 10 ; rate += 0.25){
            if(rate > 8.5){
                break;
            }
            System.out.println("Interest for " + rate + " % is " + calculateInterest(100, rate));
        }
    }

    public static double calculateInterest(double amount, double rateOfInterest){
        return (amount * (rateOfInterest / 100));
    }
}