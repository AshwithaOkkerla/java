import java.io.*;
import java.lang.*;
import java.util.*;

class ArmstrongNumber{
    

    public static void main(String args[]){
            String s;
            System.out.println("Enter any number ");
            Scanner sc = new Scanner(System.in);
            s = sc.next();

            int len = s.length();

            int num = Integer.parseInt(s);

            int temp = num;

            int total_sum = 0;

            while(temp>0){

                int d = temp%10;
                temp = temp/10;

                total_sum +=   Math.pow(d,len);

            }

            System.out.println(total_sum);

            if(num == total_sum)
                System.out.println("ArmstrongNumber");
            else
                System.out.println("Not armstrong ");

        }
}

