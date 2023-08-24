package createfolder;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\ADMI\\Desktop\\java practice\\12-08-2023\\folder\\Harsh.java");

		boolean check=f.createNewFile();
		
		if(check==true)
		{
			System.out.println("file created");
		}

		else
		{
			System.out.println("file not created");
		}

	}
}
