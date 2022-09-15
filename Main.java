import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please input your number");
        Scanner UserNumber = new Scanner(System.in);
        int UserInput = UserNumber.nextInt();
        //System.out.println(UserInput%2);
        if (UserInput%2 == 0){
           
            if (UserInput == 2){
                System.out.println("This number is a prime number");
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
                }
                else if (DivisionAnswer == 2){
                    System.out.println("This number is a prime number");
                }
           }
        }

}
}
