import java.util.Scanner;

public class Factorial{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a;
        int i;
        int fact=1;

        System.out.print("Enter the numebr: ");
        a=sc.nextInt();

        for(i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("The factorial is: " + fact);
    }
}