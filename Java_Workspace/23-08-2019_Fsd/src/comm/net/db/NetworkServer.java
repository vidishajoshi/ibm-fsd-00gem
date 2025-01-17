package comm.net.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

public class NetworkServer {

	
		public static void main(String[] args) throws IOException, SQLException {
			ServerSocket server=null;
			Socket client;
			
			//default port no we are going to use
			int portNumber=3456;
			
			//create server side socket
			try {
				server=new ServerSocket(portNumber);
				
			}catch(IOException ie) {
				System.out.println("Cannot open socket." +ie);
				System.exit(1);
			}
			System.out.println("server socket is created "+server);

			//wait for the data from the client and reply
			while(true) {
				//Listen for a connection to be made to this socket and accept it.
				System.out.println("Waiting for connect request!!");
				client= server.accept();
				System.out.println("Connect request is accepted!!");
				String clientHost=client.getInetAddress().getHostAddress();
				int clientPort = client.getPort();
				System.out.println("client host : "+clientHost + " client port: "+clientPort);
				
				//read data from client
				InputStream ClientIn = client.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(ClientIn));
				String msgFromClient = br.readLine();
	            System.out.println("Message received from client = " + msgFromClient);
	            
	            // Send response to the client
	         //   if (msgFromClient != null ) {
	                int num = Integer.parseInt(msgFromClient);
	                EmployeeService emp=new EmployeeServiceImpl();
	                Employee em=emp.getEmployeeById(num);
	                
	                OutputStream clientOut = client.getOutputStream();
	                PrintWriter pw = new PrintWriter(clientOut, true);
	                pw.println(em.getId()+""+em.getFirstName()+""+em.getLastName()+""+em.getEmail());
	           // }
	            
	            // Close sockets
	            if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
	                server.close();
	                client.close();
	                break;
	            }
				
			}
		}
		}


