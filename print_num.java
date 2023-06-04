import java.util.*;
import java.lang.*;


public class print_num {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<n;i++){
			for(int j=1;j<= i/2;j++){
				if( (j*(j+1)) == i){
					System.out.println(i+" ");
				}
			}
		}
	
	}
	
}
