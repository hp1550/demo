package createfolder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
public static void main(String[] args) throws IOException {
	
	Scanner sc=new Scanner(System.in);
	
	FileWriter f=new FileWriter("C:\\Users\\ADMI\\Desktop\\java practice\\12-08-2023\\folder\\Harsh.java");

	System.out.println("Enter Name");
	f.write(sc.next());
	f.flush();
	

}

}
