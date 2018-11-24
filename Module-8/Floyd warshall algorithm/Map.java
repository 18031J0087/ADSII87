import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Map
{
	int matrix[][]=new int [29][29];
	   /* String Countries[];
	    String CountryCodes[];
	    Map()
	    {
	    	this.matrix=new int[29][29];
	    	Countries=new String[29];
	    	CountryCodes=new String[29];
	    }*/
	 ArrayList<String> CountryCodes=new ArrayList<String>();
	 ArrayList<String> Countries=new ArrayList<String>();
	    public  void matrix() throws IOException
	    {
	    File file = new File("E:\\18031j0087_ADS2\\ADSII87\\Module-9\\Tests\\distance.txt"); 
		File file1 = new File("E:\\18031j0087_ADS2\\ADSII87\\Module-9\\Tests\\ha29_name.txt");
		File file2 = new File("E:\\18031j0087_ADS2\\ADSII87\\Module-9\\Tests\\ha29_code.txt");
		
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  BufferedReader brname = new BufferedReader(new FileReader(file1));
		  BufferedReader brcode = new BufferedReader(new FileReader(file2 ));
		
		  String st2=brname.readLine();
		  String st1=brname.readLine();
		  String st;
		  
		  while ((st = brname.readLine()) != null) 
		  {
			 Countries.add(st);

		  }
		  String st3=brcode.readLine();
		  String st4=brcode.readLine();
		  String st5;
		 
		  while ((st5 = brcode.readLine()) != null) 
		  {
			 CountryCodes.add(st5);
			 
		  }
		 // System.out.println(Countries);
		 // System.out.println(CountryCodes);
		     
		  String st6=br.readLine();
		  String st7=br.readLine();
		  String st8=br.readLine();
		  String st9;
		  int i=0;
		  while((st9=br.readLine())!=null)
		  {
			  String[] b=st9.split("  ");
			  for(int j=0;j<b.length;j++)
			  {
				  matrix[i][j]=Integer.parseInt(b[j]);
			  }
			  i++;
			  }
			  
		  }
}

