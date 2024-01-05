class Teacher{
public int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
}
class BCA{
public static void main(String args[])
{
Teacher ob=new Teacher();
ob.setId(2525);
System.out.println("id:"+ob.getId());
}
}