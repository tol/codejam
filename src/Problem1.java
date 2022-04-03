import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem1 {

	public static int rowsum (int a[][],int i,int n){
		int s=0;
		for (int x=0;x<n;x++){
			s=s+a[i][x];
		}
		return s;
	}
	public static int colsum (int a[][],int i,int n){
		int s=0;
		for (int x=0;x<n;x++){
			s=s+a[x][i];
		}
		return s;
	}

	public static void main(String[] args)  {
		long beginTime = System.nanoTime();
		//InputStream is =  System.in;
		Scanner scanner = new Scanner(System.in) ;
			int testCount = scanner.nextInt();
			for (int testNumber = 1; testNumber <= testCount; testNumber++) {

				int n = scanner.nextInt();
				n=n*2;
				int[][] m=new int[n][n];
				for (int i=0;i<n;i++) {
					//for (int j = 0; j < n; j++) {
						int j=0;
						String  s = scanner.next();
						for (char c:s.toCharArray()){
							if (c=='O'){
								m[i][j]=0;
							}else{
								m[i][j]=1;
							}
							j++;
						}

					//}
				}
				int rowsuml=0;
				int rowsumr=0;
				 for (int i=0;i<n/2;i++){
					 rowsuml+=rowsum(m,i,n);
					 rowsumr+=rowsum(m,n-i-1,n);

				}

				int colsumr=0;
				int colsuml=0;
				for (int i=0;i<n/2;i++){
					colsuml+=colsum(m,i,n);
					colsumr+=colsum(m,n-i-1,n);

				}
				//System.out.println(rowsuml);
				//System.out.println(rowsumr);
				//System.out.println(colsuml);
				//System.out.println(colsumr);

				//solve(testNumber, elements);
				System.out.println("Case #" + testNumber + ": " + max(abs(rowsuml-rowsumr),abs(colsuml-colsumr)));
			}

		//System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}
