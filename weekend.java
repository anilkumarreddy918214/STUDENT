import java.io.*;
import java.util.*;
class Test{
public static void main(Strings args[])
{
Scanner sc=new Scanner(System.in);
int intVar=sc.nextInt();
System.out.println(Test.printDay(inpVar));
}
public static StringprintDay(int dayno){
String day;
switch(dayno){
case 0:{day="SUNDAY";break;}
case 1:{day="MONDAY";break;}
case 2:{day="TUESDAY";break;}
case 3:{day="WENDESDAY";break;}
case 4:{day="THURSDAY";break;}
case 5:{day="FRIDAY";break;}
case 6:{day="SATURDAY";break;}
defalt:day="INVALID";
}
return day;
}
}