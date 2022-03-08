package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;


public class HandlerServer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket server_socket = new ServerSocket(2030);
		System.out.println("ServerSocket awaiting connections...");

		Socket socket = server_socket.accept();
		System.out.println("Connection from " + socket + "!");

		
		
		InputStream inputs = socket.getInputStream();
		
		ObjectInputStream objectinputs = new ObjectInputStream(inputs);
		
		Diagnostic diag =(Diagnostic) objectinputs.readObject();
		
		System.out.println("Received [" + diag.getSymptomes().size() + "] messages from: " + socket);
		
		System.out.println("All symptomes:");
        diag.getSymptomes().forEach((msg)-> System.out.println(msg));
        
        
        new DrlTest().Testing(diag);
        
        
        System.out.println("degré de contamination Convid19 : "+diag.getDegreCont_C19());
        
        /****** renvoyer le diagnostic au client ******/
        
        OutputStream os=socket.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		
		oos.writeObject(diag);
        
        
        System.out.println("Closing sockets.");
        
        server_socket.close();
        socket.close();
	

	}
}
