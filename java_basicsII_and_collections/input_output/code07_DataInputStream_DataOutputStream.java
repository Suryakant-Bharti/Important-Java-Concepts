import java.io.*;
public class DataInput_Stream {

   public static void main(String args[])throws IOException {

      // writing string to a file encoded as modified UTF-8
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("E:\\file.txt"));
      dataOut.writeUTF("hello, nice to meet you!");

      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("E:\\file.txt"));

      while(dataIn.available()>0) {
         String k = dataIn.readUTF();
         System.out.print(k+" ");
      }
   }
}