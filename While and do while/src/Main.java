public class Main {
    public static void main(String[] args){

        for(int i = 0; i <= 5; i++){
            System.out.println("For loop " + i);
        }

        int j = 0;
        while(j <= 5){
            System.out.println("While loop " + j);
            j++;
        }

        int k = 0;
        while(true){
            if(k > 5){
                break;
            }
            System.out.println("While loop with break " + k);
            k++;
        }

        int l = 0;
        do{
            System.out.println("Do While loop " + l);
            l++;
        }while(l <= 5);

        int number = 0;
        while(number < 50){
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            System.out.print(number + "_");
        }
    }


}