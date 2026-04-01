
import java.util.Scanner;
public class decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        String hex = "";
        while(n>0){
            int rem=n%16;
            if(rem<10){
                hex=rem+hex;
            }else{
                hex=(char)(rem-10+'A')+hex;
            }
            n=n/16;
        }
        System.out.println("Hexadecimal: " + hex);
        sc.close();


    }
    
}
