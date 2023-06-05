import java.io.*;
import java.lang.*;
import java.util.*;

public class TwoDarray{
    
        static void input(int n,int arr[][]){

            Scanner sc = new Scanner(System.in);

            for(int i=0;i<n;i++){
                for(int j =0;j<n;j++){
                       arr[i][j] =  sc.nextInt();
                    }
            }

        }

        
        static void sum(int n, int a[][], int b[][], int c[][]){

                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){

                                c[i][j] = a[i][j] + b[i][j];
                            }
                 }

        }
                                
        public static void main(String args[]){
                
                int x[][] = new int[3][3];

                int y[][] = new int [3][3];

                int z[][] = new int [3][3];

                System.out.println("Enter the inputs of x matrice ");

                input(3,x);
    
                System.out.println("Enter the inputs of y matrice ");

                input(3,y);

                
                sum(3,x,y,z);
                    
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.print( z[i][j] + "  ");
                    }
                    System.out.print("\n");
                }
            
        }

};
