import java.io.*;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",3333);
            DataInputStream dis=new DataInputStream(socket.getInputStream());
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while(!str.equals("stop")){
                str=reader.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=dis.readUTF();
                System.out.println("Server says: "+str2);
            }

            dout.close();
            socket.close();
        }catch ( IOException runtimeException){
            System.out.println(runtimeException);
        }
    }
}
