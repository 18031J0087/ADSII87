package module10;

import java.util.Scanner;
//Implement LCS (Longest common subsequence) in Java. Also, note that you have to give the path as well (not just the length of the longest common subsequence)
public class LeastCommonSequence
{
	public int leastCommonSequence(char[] x,char[] y,int n,int m)
	{
		int count=0;
		int lcs[][]= new int[n+1][m+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==0||j==0)
				{
					lcs[i][j]=0;
				}
				else if(x[i]==y[j])
				{
					lcs[i][j]=lcs[i-1][j-1]+1;
					System.out.print(lcs[i][j]+"-");
					
				}
				else
				{
					lcs[i][j]=maximum(lcs[i-1][j],lcs[i][j-1]);
					System.out.print(lcs[i][j]+"-");
					
				}
			}
			System.out.println("");
		}
		return lcs[n][m];
	}
	public int maximum(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else 
			return b;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string and subStrings:");
		String s = scan.nextLine();
		String sub = scan.next();
		char x[]=s.toCharArray();
		char y[]=sub.toCharArray();
		int s_of_s=x.length;
		int s_of_sub=y.length;
		LeastCommonSequence lcs = new LeastCommonSequence();
		lcs.leastCommonSequence(x, y, s_of_s, s_of_sub);
		System.out.println("The length of the sub String is:"+);
		
	}
}
