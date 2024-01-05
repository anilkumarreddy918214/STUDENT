class Student{
private String name;
public void setName(String name){this.name=name;}
public String getName(){return name;}
}
class ABD{
public static void main(String args[]){
Student sc=new Student();
sc.setName("NANI");
System.out.println("Name:"+sc.getName());
}
}