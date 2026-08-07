import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int a;
    int mul;

    System.out.print("Enter a number:");
    a=sc.nextInt();

    System.out.println("The multiplication table of "+ a +" is:");

    for(int i=1;i<=10;i++){
        mul=a*i;
        System.out.println(mul);
    }
}
}