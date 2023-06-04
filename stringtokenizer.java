import java.io.*;
import java.util.StringTokenizer;

public class stringtokenizer {
	public static void main(String[] args)throws IOException {
		// multiple inputs in same line
		BufferedReader b = new BufferedReader( new InputStreamReader(System.in));
		String ip = b.readLine();
		StringTokenizer str = new StringTokenizer(ip,",");

			// System.out.println(age);
		String s1 = str.nextToken();
		String s2 = (str.nextToken()).trim();
		System.out.println(s1+s2);
	}
}
