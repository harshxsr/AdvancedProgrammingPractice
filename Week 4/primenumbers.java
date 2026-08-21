import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int start,end,i,j,count=0;

        System.out.println("Enter start number:");
        start=sc.nextInt();

        System.out.println("Enter end number:");
        end=sc.nextInt();

        int[] arr= new int[30];

    
        for (i = start; i <= end; i++) {

            int flag = 0;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                arr[count] = i;
                count++;
            }
        }

        System.out.println("Prime numbers:");

        for (i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}