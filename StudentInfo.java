import java.util.Scanner;

public class StudentInfo{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int a;
        int b;
        int sum;

        System.out.print("Enter first numebr:");
        a = sc.nextInt();

        System.out.print("Enter second number:");
        b = sc.nextInt();

        sum=a+b;

        System.out.println("The sum is: "+sum);

        sc.close();
    }
}