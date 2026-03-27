

import java.util.Scanner;

public class que1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("positive no");
        }
        else if(num<0){
            System.out.println("negative no.");
        }else{
            System.out.println("Zero is neither positive nor negative");

        }
        sc.close();

    }
}