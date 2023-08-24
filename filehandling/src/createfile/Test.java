package createfile;

import java.io.File;
import java.io.IOException;

public class Test 
{
public static void main(String[] args) throws IOException {
	
	File f=new File("abcd.java");
	boolean b=f.createNewFile();

	if(b==true)
	{
		System.out.println("file create successfully" +f.getName());
	}

	else
	{
		System.out.println("not created");
	}
}
}