import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please input your number");
        Scanner UserNumber = new Scanner(System.in);
        int UserInput = UserNumber.nextInt();
        System.out.println(UserInput%2);
        if (UserInput%2 == 0){
           
            if (UserInput == 2){
                System.out.println("This number is a prime number");
            }
            else {
                System.out.println("This number is not a prime number");
            }
        }
        else {
            System.out.println("This number is a prime number");
        }

}
}
