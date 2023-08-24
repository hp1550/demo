package createfolder;

import java.io.File;

public class A {
public static void main(String[] args) {
	File f=new File("C:\\Users\\ADMI\\Desktop\\java practice\\12-08-2023\\folder");

	boolean check=f.mkdir();
	
	if(check==true)
	{
		System.out.println("folder created");
	}

	else
	{
		System.out.println("folder not created");
	}

}

}
