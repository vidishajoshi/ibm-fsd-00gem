package comm.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleEncryp {
	void encrypt(String source, String dest, int shiftSize) {
		BufferedReader reader;
		BufferedWriter writer;
		char y;
		
		int total=0;
		try {
			reader=new BufferedReader(new FileReader(source));
			writer=new BufferedWriter(new FileWriter(dest));
			String line=reader.readLine();
			System.out.println(line);
			int data;
			int count=0;
			while(line!=null) {
				for(int i =0;i<line.length();i++) {
				    y=line.charAt(i);
				    System.out.println("value of char : "+line.charAt(i));
				    if((y =='a')||(y=='e')||(y=='i')||(y=='o')||(y=='u')) {
					      count++;
						}else {
							System.out.println("no vowel present");
						}
				    data=(int)line.charAt(i)+shiftSize;
					writer.write(data);
				}
				writer.write((int)'\n');
				line=reader.readLine();
				System.out.println("total vowel are :"+count);
			}
			reader.close();
			writer.close();
		}catch(IOException ie) {
			System.out.println("failed");
		}
	}
	
	public void viewFileContent(String filename) throws IOException {
		BufferedReader reader;
		
		reader=new BufferedReader(new FileReader(filename));
		String line=reader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=reader.readLine();
		}
		reader.close();
		
	}
	
	public int checkVowel(char y) {
		int count=0;
		//System.out.println("char value is :" +c);
		
		if((y =='a')||(y=='e')||(y=='i')||(y=='o')||(y=='u')) {
		      return count++;
			}else {
				System.out.println("no vowel present");
				
			}
		return count;
	}

}
