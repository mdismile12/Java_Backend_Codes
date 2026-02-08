import java.util.*;
import java.net.*;
import java.io.*;

class Server
{
    public static void main(String[]args) throws Exception
    {
        ServerSocket s1 = new ServerSocket(1234);
        System.out.println("Server is ready to generate Otp");
        int count = 2086;
        while(true)
        {
            
        Socket s = s1.accept();
        System.out.println("Connection Established");
        System.out.println("Generating OTP....");
        System.out.println("OTP Generated Successfully");
        System.out.println(" Total OTP Generated  : "+count);
        count++;
        Random r1 = new Random();
        int otp = r1.nextInt(900000) + 100000;
        OutputStream out = s.getOutputStream();
        DataOutputStream dout = new DataOutputStream(out);
        
        dout.writeInt(otp);
        dout.close();
        out.close();
        s.close();
        }

    }


}