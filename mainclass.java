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
			s = new Socket("172.20.10.3",3000);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(s.getInputStream());
			while(true)
			{
				System.out.println("Enter Message: ");
				x = sc.nextLine();
				dos.writeUTF(x);
				String read = dis.readUTF();
				System.out.println(read);
			}
		}
		catch(Exception e) { }
	}

}
