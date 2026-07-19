public class One {
    public static void main(String[] args){
        double varOne = 20.00;
        double varTwo = 80.00;
        double sumAndMultiply = ( varOne + varTwo ) * 100.00;
        System.out.println("sumAndMultiply" + " " +sumAndMultiply);

        double varRemainder = sumAndMultiply % 40.00;
        System.out.println("varRemainder" + " " +varRemainder);

        boolean isZero = (varRemainder == 0.00);
        System.out.println("isZero" + " " + isZero);

        if(!isZero){
            System.out.println(("Got some remainder"));
        }
    }
}
