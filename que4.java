import java.util.Scanner;

public class que4{
    public static void main(String[] args) {
        int sum=0;
        
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for( int i=0;i<=num;i++){
             sum = sum+i;
       
        }
             System.out.println(sum);
        
        sc.close();
    }
}