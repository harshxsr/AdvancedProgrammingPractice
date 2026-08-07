import java.util.Scanner;

public class Studentdetails{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String name;
        int rollno;
        String dept;
        int i;
        int a=5;

        

        for(i=0;i<a;i++){
            System.out.print("Enter name:");
            name = sc.next();

            System.out.print("Enter rollno:");
            rollno = sc.nextInt();

            System.out.print("Enter department:");
            dept = sc.next();}

            System.out.println("---Student Details---");
            System.out.println("Name:"+name);
            System.out.println("Roll no:"+rollno);
            System.out.println("Department:"+dept);
        
        }
}


