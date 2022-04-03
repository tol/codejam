import java.util.Scanner;

public class Codejam2 {

	private static int min(int x,int y, int z){
		return Math.min(Math.min(x,y),z);
	}
	public static void main(String[] args)  {
		long beginTime = System.nanoTime();
		//InputStream is =  System.in;
		Scanner scanner = new Scanner(System.in) ;
		int testCount = scanner.nextInt();
		for (int testNumber = 1; testNumber <= testCount; testNumber++) {


            int  sum=1000000;
			int C1 = scanner.nextInt();
			int M1 = scanner.nextInt();
			int Y1 = scanner.nextInt();
			int K1 = scanner.nextInt();

			int C2 = scanner.nextInt();
			int M2 = scanner.nextInt();
			int Y2 = scanner.nextInt();
			int K2 = scanner.nextInt();

			int C3 = scanner.nextInt();
			int M3 = scanner.nextInt();
			int Y3 = scanner.nextInt();
			int K3 = scanner.nextInt();

			int C=min(C1,C2,C3);
			int M=min(M1,M2,M3);
			int Y=min(Y1,Y2,Y3);
			int K=min(K1,K2,K3);
			if (C+M+Y+K<sum){
				System.out.println("Case #" + testNumber + ": " + "IMPOSSIBLE");
			} else {
				if (C+M+Y+K==sum){
					System.out.println("Case #" + testNumber + ": " + C+" "+M+" "+Y+" "+K);
				} else {
					int margin=C+M+Y+K-sum;
					int m=C+M+Y+K-sum;
					for (int i=0;i<margin && m>0;i++){
						if (C>0){
							C--;
							m--;
							if (m==0) break;
						}
						if (M>0){
							M--;
							m--;
							if (m==0) break;
						}
						if (Y>0){
							Y--;
							m--;
							if (m==0) break;
						}
						if (K>0){
							K--;
							m--;
							if (m==0) break;
						}
					}
					System.out.println("Case #" + testNumber + ": " + C+" "+M+" "+Y+" "+K);
				}
			}

			//System.out.println("Case #" + testNumber + ": " + 1);
		}

		//System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}
