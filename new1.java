import java.io.*;
class BufferedReaderExample{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferReader(r);
System.out.println("Enter your name");
String name=br.readLine();
System.out.println("welcome"+name);
}
}