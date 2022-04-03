import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem2 {


	public static void main(String[] args) throws FileNotFoundException {
		long beginTime = System.nanoTime();
		InputStream is =  System.in;
		try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(is)))) {
			int testCount = scanner.nextInt();
			for (int testNumber = 1; testNumber <= testCount; testNumber++) {


/*				2 4 5
				20 8 1000000000
				60 4 1000000000
				10 30 50 70*/

				int D=scanner.nextInt();
				int N=scanner.nextInt();
				int U=scanner.nextInt();
				int m[]=new int[D];
				int l[]=new int[D];
				int e[]=new int[D];
				for (int i=0;i<D;i++){
    				m[i]=scanner.nextInt();//time
					l[i]=scanner.nextInt();//amount
					e[i]=scanner.nextInt();//expiration
				}
				int o[]=new int[N];
				for (int i=0;i<N;i++) {
					o[i]=scanner.nextInt();
				}

				int orders=0;
				for (int i=0;i<N;i++) {
					boolean found=false;
					int uf=U;
					for (int j=0;j<D;j++){
						if (o[i]>=m[j] && o[i]<m[j]+e[j] && l[j]>=uf){
							found=true;
							l[j]=l[j]-uf;
							break;
						}
						if (o[i]>=m[j] && o[i]<m[j]+e[j] && l[j]<uf){
							uf=U-l[j];
							l[j]=0;

						}
					}
					if (found){
						orders++;
					} else {
						break;
					}

				}



				//solve(testNumber, elements);
				System.out.println("Case #" + testNumber + ": " + orders);
			}
		}
		//System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}
