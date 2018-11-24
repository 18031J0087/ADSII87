import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Graph
{
	int count;
	int V;
	int E;
	String s[];
	LinkedList<Integer> adj[];
	Graph(int v,int e)
	{
		this.V=v;
		this.E=e;
	}
	public int V()
	{
		return V;
	}
	public int E()
	{
		return E;
	}
	public void addEdge(int v,int w)
	{
		E++;
		adj[v].add(w);
		adj[w].add(v);
	}
	public boolean hasNext()
	{
		return false;
		
	}
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}
	void dfs(int i,int c)
	{
		boolean vis[]=new boolean[V];
		countPath(i,vis,c);
	}
	void countPath(int i,boolean[] visited,int count1)
	{
		System.out.print(i+" ");
		visited[i]=true;
		count=0;
		Iterator<Integer> j=adj[i].listIterator();
		while(j.hasNext())
		{
			int n=j.next();
			if(!visited[n])
			{
				countPath(n,visited,count1);
				count=count+1;
			}
			if(count==count1)
			{
				System.out.println(count+"");
			}
		}
		
	}
}
public class Solution {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] str=s.split(" ");
		//int e=Integer.parseInt(str[1]);
		Graph graph = new Graph(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
		for(int i=0;i<Integer.parseInt(str[0]);i++)
		{
			String s1=scan.nextLine();
			String str1[]=s1.split(" ");
			graph.addEdge(Integer.parseInt(str1[0]), Integer.parseInt(str1[1]));
		}
		//queries
		int n;
		String s2=scan.next();
		n=Integer.parseInt(s2);
		for(int i=0;i<n;i++)
		{
			String s3=scan.nextLine();
			String[] str3=s3.split("");
			graph.dfs(Integer.parseInt(str3[0]),Integer.parseInt(str3[1]));
		}
		
	}

}
