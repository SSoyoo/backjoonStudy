package B03_반복문;

import java.io.*;
import java.util.*;

public class b_15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i< t ; i++) {
			
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int sum = a + b ; 
		bw.write(sum +"\n");
		

	
		}
		
		bw.flush();

	}

}
