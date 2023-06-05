import java.io.*;
import java.util.*;

class StrongNumber{


    static int factorial(int x){
        if (x==0)
            return 1;
        return (x * factorial(x-1));
    }

    public static void main(String args[]){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int total_sum = 0;
        int temp = num;
        while(temp>0){
            int d = temp % 10;
            temp = temp/10;
            total_sum += factorial(d);
        }
        
        System.out.println("Total sum of factorial of each digit "+ total_sum);
        if(total_sum == num){
            System.out.println("STRONG NUM");
        }else{
            System.out.println("NOT STRONG NUM");
        }

    }
};


            
