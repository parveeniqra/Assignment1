import java.util.Scanner; 
 
 public class octal {
   
    public static void main(String[] args) {
         int ans=0;
    int power=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a octal number: ");
        int n = sc.nextInt();
        while(n>0){
        int rem=n%10;
         ans =ans+ (int)(rem*Math.pow(8, power));
        

         power++;
         n=n/10;
        }
        
                System.out.println(ans); 
                sc.close(); 
    }
   
    
}
