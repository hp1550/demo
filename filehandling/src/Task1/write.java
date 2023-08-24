package Task1;

import java.io.FileWriter;
import java.io.IOException;

public class write
{
public static void main(String[] args) throws IOException {
	
	FileWriter f=new FileWriter("C:\\Users\\ADMI\\Desktop\\task\\CJC.txt");
	f.write("hello to the Complete java classes");
	f.flush();
}
}
