package filtering.file.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("updated-data.txt");
		
		BufferedReader br2 = new BufferedReader(new FileReader("orginal-data.txt"));
		
		String s1 = br2.readLine();
		while(s1 != null) {
			boolean present = false;
			BufferedReader br1 = new BufferedReader(new FileReader("updated-data.txt"));
			String s = br1.readLine();
			while(s != null) {
				if(s1.equals(s)) {
					present = true;
					break;
				}
				s= br1.readLine();
				
			}
			if(present == false) {
				pw.println(s1);
				pw.flush();
				
			}
			s1 = br2.readLine();
			br1.close();
			
		}
		br2.close();
		pw.close();

	}

}
