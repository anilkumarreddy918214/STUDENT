class Icard{
private String college_name;
private String college_adress;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private String adhar_no;
public void setCollege_name(String college_name)
{this.college_name=college_name;}
public void setCollege_adress(String college_adress)
{this.college_adress=college_adress;}
public void setAy_start(int ay_start)
{this.ay_start=ay_start;}
public void setAy_end(int ay_end)
{this.ay_end=ay_end;}
public void setId(int id)
{this.id=id;}
public void setStudent_name(String student_name)
{this.student_name=student_name;}
public void setCourse_name(String course_name)
{this.course_name=course_name;}
public void setAdhar_no(String adhar_no)
{this.adhar_no=adhar_no;}
public String getCollege_name(){return college_name;}
public String getCollege_adress(){return college_adress;}
public int getAy_start(){return ay_start;}
public int getAy_end(){return ay_end;}
public int getId(){return id;}
public String getStudent_name(){return student_name;}
public String getCourse_name(){return course_name;}
public String getAdhar_no(){return adhar_no;}
}
class ANI{
public static void main(String args[]){
Icard ds=new Icard();
ds.setCollege_name("A");
ds.setCollege_adress("B");
ds.setAy_start(3);
ds.setAy_end(5);
ds.setId(6);
ds.setStudent_name("F");
ds.setCourse_name("G");
ds.setAdhar_no("123");
System.out.println(ds.getCollege_name());
System.out.println(ds.getCollege_adress());
System.out.println("A.Y"+ds.getAy_start()+"-"+ds.getAy_end());
System.out.println("ID."+ds.getId());
System.out.println(ds.getStudent_name());
System.out.println(ds.getCourse_name());
System.out.println(ds.getAdhar_no());
}
}