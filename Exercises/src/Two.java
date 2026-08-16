public class Two {
    public static void main(String[] args){
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long result;
        if(kilometersPerHour < 0){
            result = -1L;
        } else {
            result = Math.round(kilometersPerHour/1.609);

        }

        return result;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }
}
