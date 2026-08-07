import java.util.Scanner;

public class LargestofThree{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Enter first number:");
        a=sc.nextInt();

        System.out.print("Enter second number:");
        b=sc.nextInt();

        System.out.print("Enter third number:");
        c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("The greatest numebr is: "+a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest number is: "+b);
        }
        else{
            System.out.println("The greatest number is "+c);
        }
    }
    }

