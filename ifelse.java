import java.util.Scanner;
class ifelse
{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int i=scob.nextInt();
int j=scob.nextInt();
if(j==0)
System.out.println("divisable by 0 error");
else
System.out.println(i+"dividable by"+j+"is"+ i/j);
i=i+j;
}
}