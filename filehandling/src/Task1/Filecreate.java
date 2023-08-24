package Task1;

import java.io.File;
import java.io.IOException;

public class Filecreate {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\ADMI\\Desktop\\task\\CJC.txt");
		boolean b=f.createNewFile();
		
		if(b==true)
		{
			System.out.println("File created");
		}
	
		else
		{
			System.out.println("File Not created");
		}
	
	}
	
}
