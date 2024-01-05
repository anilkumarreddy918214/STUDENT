import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if(c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='a'||c=='e'||c=='0'||c=='1')
System.out.println("YES");
else
System.out.println("NO");
}
}