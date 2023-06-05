import java.io.*;
import java.lang.*;
import java.util.*;

public class StudentDetails{
    public static void main(String args[]) throws IOException{
            
                System.out.println("Enter Stud name");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String name = br.readLine();

                System.out.println("Enter stud age");

                int age =  Integer.parseInt( br.readLine());

                System.out.println("Enter stud marks");

                float marks = Float.parseFloat( br.readLine());

                System.out.println("Student name: "+ name + " | age: "+ age + "| marks : " + marks);

            }
    };
