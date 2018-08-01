package mainpackage;
import java.io.*;
import java.util.Scanner;
import java.net.*;
public class mainclass {

	private static Scanner sc;
	private static Socket s;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		String x;
		try
		{
			System.out.println("Enter the ip address of the server system: ");
			String ip = sc.next();
			System.out.println("Enter the port number same as of the server system: ");
			int port = sc.nextInt();
			s = new Socket(ip,port);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(s.getInputStream());
			while(true)
			{
				System.out.println("You: ");
				x = sc.nextLine();
				dos.writeUTF(x);
				String read = dis.readUTF();
				System.out.println(read);
			}
		}
		catch(Exception e) { }
	}

}
