package simple.file.traversing.program;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		File root = new File("root");
		root.mkdir();
		File f1 = new File("root","file1");
		File f2 = new File("root","file2");
		File folder1 = new File("root","folder1");
		File folder2 = new File("root","folder2");
		f1.createNewFile();
		f2.createNewFile();
		folder1.mkdir();
		folder2.mkdir();
		String[] s = root.list();
		for(String s1: s) {
			File f = new File(root,s1);
			if(f.isFile()) {
				System.out.println(s1);
			}
			
		}
		
		File myfile = new File("my-file");
		myfile.createNewFile();
		System.out.println(myfile.length());
		myfile.delete();
		

	}

}
