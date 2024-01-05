class Employ{
int id;
String name;
void insert(int r,String n){
id=r;
name=n;
}
void display()
{
System.out.println(id+" "+name);
}
}
class TestEmploy4
{
public static void main(String args[])
{
Employ s1=new Employ();
Employ s2=new Employ();
s1.insert(111,"anil");
s2.insert(222,"ali");
s1.display();
s2.display();
}
}
