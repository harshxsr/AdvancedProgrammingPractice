import java.util.Scanner;

public class Book{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String title;
        String author;
        int price;
        int i;
        int n=5;

        for(i=0;i<n;i++){
        System.out.print("Enter Title:");
        title=sc.next();

        System.out.print("Enter Author:");
        author=sc.next();

        System.out.print("Enter price:");
        price=sc.nextInt();


        System.out.println("---Book Details---");
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);}
    }

}