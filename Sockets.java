import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
class Sockets{
    public static void main(String[] args) {
        
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket clientSocket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // the 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        String message = br.readLine();
        System.out.println("Client said "+message);
        bw.write("Hello from server! got your message!");
        bw.newLine();
        bw.flush(); 
    }
}