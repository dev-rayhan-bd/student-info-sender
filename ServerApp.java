import java.io.*;
import java.net.*;
import java.util.*;

public class ServerApp {
    public static void main(String[] args) {
      
        HashMap<Integer, Integer[]> studentDataMap = new HashMap<>();
        String[] studentNames = new String[100];
        int studentCount = 0;

        try (ServerSocket myServerSocket = new ServerSocket(5000)) {
            System.out.println(">>> Server Started. Waiting for data on port 5000...");

            while (true) {
                try (Socket connection = myServerSocket.accept();
                     BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    
                    String receivedLine = inputReader.readLine();
                    if (receivedLine != null) {
                      
                        String[] info = receivedLine.split("#");
                        int sId = Integer.parseInt(info[0]);
                        String sName = info[1];
                        int sMarks = Integer.parseInt(info[2]);

                        
                        studentDataMap.put(sId, new Integer[]{sMarks});
                        studentNames[studentCount++] = sName;

                       
                        System.out.println("\n[ NEW RECORD RECEIVED ]");
                        System.out.println("------------------------------------------");
                        for (int i = 0; i < studentCount; i++) {
                            
                            System.out.println("Student Name: " + studentNames[i]);
                        }
                        System.out.println("Latest Entry ID: " + sId + " | Score: " + studentDataMap.get(sId)[0]);
                        System.out.println("------------------------------------------");
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Server Error: " + e.getMessage());
        }
    }
}