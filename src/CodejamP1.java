import static java.lang.Math.*;

import java.util.Scanner;

public class CodejamP1 {

	public static void main(String[] args)  {
		long beginTime = System.nanoTime();
		//InputStream is =  System.in;
		Scanner scanner = new Scanner(System.in) ;
		int testCount = scanner.nextInt();
		for (int testNumber = 1; testNumber <= testCount; testNumber++) {

			int n = scanner.nextInt();
			int m = scanner.nextInt();
			String s="";
//			     +-+-+-+-+
//				 |.|.|.|.|
//			     +-+
			for (int i=0;i<n;i++) {
				String l="";
				for (int j = 0; j < m; j++) {
					if (i < 1 && j < 1) {
						s = s + "..";
					}
					else {
						s = s + "+-";
					}

				}
				s = s + "+";
				s=s+"\n";
				for (int j = 0; j < m; j++) {
					if (i < 1 && j < 1) {
						s = s + "..";
					}
					else {
						s = s + "|.";
					}
				}
				s = s + "|";
				s=s+"\n";
			}
			for (int j = 0; j < m; j++) {

				s = s + "+-";
			}
			s = s + "+";

			System.out.println("Case #" + testNumber + ": " );
			System.out.println(s );
		}

/*		..+-+-+-+
	    ..|.|.|.|
		+-+-+-+-+
			|.|.|.|.|
		+-+-+-+-+
			|.|.|.|.|
		+-+-+-+-+*/
		//System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}
