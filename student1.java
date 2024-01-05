class Student{
int id;
String name;
}
class TestStudent3{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.id=101;
s2.id=201;
s1.name="anil";
s2.name="ali";
System.out.println(s2.id+" "+s2.name);

}
}