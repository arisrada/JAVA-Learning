public class Nine {
    public static void main(String[] args){
        System.out.println(area(24));
        System.out.println(area(12, 24));
    }
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }else{
            return Math.PI * radius * radius;
        }
    }

    public static double area(double length, double breadth){
        if(length < 0 || breadth < 0){
            return -1.0;
        } else{
            return length * breadth;
        }
    }
}
