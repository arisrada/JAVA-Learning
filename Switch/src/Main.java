public class Main{
    public static void main(String[] args){
        int value = 5;
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actual value was " + value);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }
    }
}