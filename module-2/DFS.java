import java.util.Iterator;
import java.util.LinkedList;

class Graphs
{
	private int v;
	private LinkedList<Integer>adj[]; 
	Graphs(int v)
	{
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList();
		
	}
	void addedge(int i,int j)
	{
		adj[i].add(j);
	}
	
	void dfs(int i)
	{
		boolean Vis[]=new boolean[v];
		dif(i,Vis);
	}
	void dif(int i,boolean[] v)
	{
		System.out.print(i+" ");
		v[i]=true;
		
		
		Iterator<Integer> j=adj[i].listIterator();
		while(j.hasNext())
		{
			int n=j.next();
			if(!v[n])
				dif(n,v);
		}
	}
			
		
}

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Graph g = new Graph(4); 
		Graphs g=new Graphs(4);
        g.addedge(0, 1); 
        g.addedge(0, 2); 
        g.addedge(1, 2); 
        g.addedge(2, 0); 
        g.addedge(2, 3); 
        g.addedge(3, 3); 
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.dfs(2); 
		

	}

}


