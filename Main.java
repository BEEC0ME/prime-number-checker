import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please input your number");
        Scanner UserNumber = new Scanner(System.in);
        int UserInput = UserNumber.nextInt();
        boolean prime = true;
        if (UserInput%2 == 0){
           
            if (UserInput == 2){
            prime = true;   
            }
            else {
                System.out.println("This number is not a prime number");
            }
        }
        else {
        
           for(int i = 2; i < UserInput; i++){
                //System.out.println(i);
                int DivisionAnswer = UserInput % i;
                System.out.println(DivisionAnswer);
                if (DivisionAnswer == 0){
                    System.out.println("This number is not a prime number");
                    prime = false; 
                    break;
                }
 
           }
        }
        if (prime){
            System.out.println("This number is a prime number");
        }

}
}
