import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class Edge{
	public long value;
	public int identity;
	public ArrayList<Edge> links=new ArrayList<>();
}


public class Solution {

    public static long findMax(Edge e,Long m){
		//System.out.println(m);
		if (e.links.size()==0){
			return Math.max(m,e.value);
		}
		if (e.links.size()==1){
			return findMax(e.links.get(0),Math.max(m,e.value));
		}
		if (e.identity==0){
			long s=0;

			for (Edge c : e.links) {

					s+=findMax(c, Math.max(m,e.value));

			}
			return s;
		}
		long max=0;
		for (int i=0;i<e.links.size();i++) {
			long s=0;
			int j=0;
			for (Edge c : e.links) {
				if(j==i) {
					s+=findMax(c, Math.max(m,e.value));
				} else{
					s+=findMax(c, 0l);
				}
				j++;
			}
			max=Math.max(max,s);
		}
		//System.out.println(max);
		return max;
	}
	public static void main(String[] args)  {
		/*long ll=2003736682l;
		System.out.println(ll);*/
		long beginTime = System.nanoTime();
		//InputStream is =  System.in;
		Scanner scanner = new Scanner(System.in) ;
		int testCount = scanner.nextInt();
		for (int testNumber = 1; testNumber <= testCount; testNumber++) {

			int n = scanner.nextInt();
/*			3
			4
			60 20 40 50
			0 1 1 2*/
			Edge e = new Edge();
			e.identity=0;
			e.value=0l;

			Map<Integer,Edge> edges=new HashMap<>();
			edges.put(e.identity,e);

			for (int i=0;i<n;i++) {
				Edge e1 = new Edge();
				e1.value=scanner.nextLong();
				e1.identity=i+1;
				edges.put(e1.identity,e1);
			}
			for (int i=0;i<n;i++) {

				int l=scanner.nextInt();
				edges.get(l).links.add(edges.get(i+1));

			}

			System.out.println("Case #" + testNumber + ": " + findMax(edges.get(0),0l));
		}

		//System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}

