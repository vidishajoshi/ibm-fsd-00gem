package comm.file.storedb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;


public class FileToDb {
public static void main(String[] args) throws SQLException {
try {
BufferedReader reader;
reader= new BufferedReader(new FileReader("farrago.txt"));
String line=reader.readLine();

while(line!=null) {
	String[] data= line.split(" ");
   int id=Integer.parseInt(data[0]);
   String firstName=data[1];
   String lastName=data[2];
   String email=data[3];
   System.out.println("employee id : "+id+" name: "+firstName+" lname: "+lastName+" email: "+email);
   
}


}catch(IOException ie) {
	System.out.println("failed");
}
}
}
