package comm.buffer;

import java.io.IOException;

public class BufferedReaderWriter {
public static void main (String[] args) throws IOException {
	String a0, a1, a2;
	if(args.length !=3) {
		a0="farrago.txt";
		a1="outagain.txt";
		a2="1";
	}else {
		a0= args[0];
		a1= args[1];
		a2= args[2];
		
	}
	SimpleEncryp se= new SimpleEncryp();
	se.encrypt(a0,a1,Integer.parseInt(a2));
	se.viewFileContent("outagain.txt");
}
}
