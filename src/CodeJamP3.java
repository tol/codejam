import java.util.PriorityQueue;
import java.util.Scanner;

public class CodeJamP3 {

	public static void main(String[] args)  {
		long beginTime = System.nanoTime();
		//InputStream is =  System.in;
		Scanner scanner = new Scanner(System.in) ;
		int testCount = scanner.nextInt();
		for (int testNumber = 1; testNumber <= testCount; testNumber++) {

			int n = scanner.nextInt();
			PriorityQueue<Integer> dices=new PriorityQueue<>( );
			for (int i=0;i<n;i++)
			{
				int d=scanner.nextInt();
				dices.add(d);

			}
			int m=0;
			int current=1;
			for (int i=0;i<n;i++)
			{
				int d=dices.poll();
				if (d>=current){
					m++;

					current++;
				}
/*				else{
					break;
				}*/
			}

			System.out.println("Case #" + testNumber + ": " + m);
		}

		//System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}

}
