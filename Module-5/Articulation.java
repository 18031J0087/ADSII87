package m4;

import java.util.Iterator;
import java.util.LinkedList;
class Graph
{
	
	public int V;
	LinkedList<Integer>[] adj;
	int t=0;
	static final int NIL=-1;
	Graph(int v)
	{ 
		this.V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList();
		}
	}
	void addEdge(int v,int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	void APUtil(int u,boolean visited[],int disc[],int low[],int p[],boolean ap[])
	{
		int c=0;
		visited[u]=true;
		disc[u]=low[u]=++t;
		Iterator<Integer> i=adj[u].iterator();
		while(i.hasNext())
		{
			int v=i.next();
			if(!visited[v])
			{
				c++;
				p[v]=u;
				APUtil(v,visited,disc,low,p,ap);
				low[u]=Math.min(low[u], low[v]);
				if(p[u]==NIL && c>1)
				{
					ap[u]=true;
				}
				if(p[u]!=NIL && low[v]>=disc[u])
				{
					ap[u]=true;
				}
				
			}
			else if(v!=p[u])
			{
				low[u]=Math.min(low[u], disc[v]);
			}
			
		}
	}

	void AP()
	{
		boolean visited[]=new boolean[V];
		int disc[]=new int[V];
		int low[]=new int[V];
		int p[]=new int[V];
		boolean ap[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			p[i]=NIL;
			visited[i]=false;
			ap[i]=false;
		}
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
				APUtil(i,visited,disc,low,p,ap);
		}
		int co=0;
		for(int i=0;i<V;i++)
		{
			if(ap[i]==true)
			{
				//System.out.println((i+1)+" ");  
				co++;         
				}
			
		}
		System.out.println(co);
		
	}
}
public class Articulation {
	public static void main(String args[])
	{
		System.out.println("articulation point");
		Graph g=new Graph(4);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.AP();
		System.out.println();
	}

}
