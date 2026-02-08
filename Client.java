import java.util.*;
import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = "Welcome to OTP Generator";
            System.out.println(str);
            System.out.println("Press 1 to generate OTP");
            System.out.println("Press 2 to quit");
            int n = sc.nextInt();
            if (n == 1) {
                Socket s1 = new Socket("localhost", 1234);
                System.out.println("Connection Successful");

                InputStream inp = s1.getInputStream();
                DataInputStream d = new DataInputStream(inp);
                System.out.println("Your OTP is : " + d.readInt());
                d.close();
                inp.close();
                s1.close();

            } else if (n == 2) {
                System.out.println("Exiting Program....");
                System.out.println("***************************************************");
                break;
            } else {
                System.out.println("Invalid Choice");
                System.out.println("***************************************************");
                continue;

            }

            System.out.println("***************************************************");

        }

    }
}