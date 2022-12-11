import javax.net.ServerSocketFactory;
import java.io.*;
import java.net.Socket;

public class ServerSocket {

    public static void main(String[] args) {
        try {
            java.net.ServerSocket ss=new java.net.ServerSocket(3333);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while (!str.equals("stop")){
                str= dis.readUTF();
                System.out.println("client says:"+str );
                str2=br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            dis.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
