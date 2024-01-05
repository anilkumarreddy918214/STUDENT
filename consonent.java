import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("INPUT");
char c=scob.next().charAt(0);
System.out.println("OUTPUT");
if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
{
System.out.print("it is a alphabet");

if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println(" ");
else
System.out.println(" ");
}
else
System.out.println(" ");
}
}
