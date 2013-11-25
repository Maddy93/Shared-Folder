import java.io.*;
import java.net.*;

public class client
{
	public static int serverPort = 3000;
	public static int clientPort = 7007;
	public static int buffer_size = 4024000;
	public static DatagramSocket ds;
	public static byte byteFile[] = new byte[buffer_size];
	public static void main(String[] args) throws Exception 
	{
		ds = new DatagramSocket(clientPort);
		while(true) 
		{
			DatagramPacket p = new DatagramPacket(byteFile, byteFile.length);
			FileOutputStream file = new FileOutputStream("./beep1.mp3",true);
			ds.receive(p);
			for (int i = 0; i < byteFile.length; i++) 
			{
				       	file.write((char)byteFile[i]);
		        }
		}
	}
}

