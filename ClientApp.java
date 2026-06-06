import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        try {
            System.out.println("=== Student Info Portal ===");
            System.out.print("Enter ID: ");
            int id = userInput.nextInt();
            userInput.nextLine(); 
            
            System.out.print("Enter Full Name: ");
            String name = userInput.nextLine();
            
            System.out.print("Enter Obtained Marks: ");
            int score = userInput.nextInt();

         
            try (Socket clientSocket = new Socket("localhost", 5000);
                 PrintWriter outWriter = new PrintWriter(clientSocket.getOutputStream(), true)) {
              
                outWriter.println(id + "#" + name + "#" + score);
                System.out.println(">> Success: Data transmitted to server.");
            }
        } catch (IOException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        } finally {
            userInput.close();
        }
    }
}