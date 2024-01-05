class Iclass{
private String student_name;
private String subject_name;
private String study_name;
private int roll_no;
private int phon_no;
public void setStudent_name(String student_name)
{this.student_name=student_name;}
public void setSubject_name(String subject_name)
{this.subject_name=subject_name;}
public void setStudy_name(String study_name)
{this.study_name=study_name;}
public void setRoll_no(int roll_no)
{this.roll_no=roll_no;}
public void setPhon_no(int phon_no)
{this.phon_no=phon_no;}
public String getStudent_name(){return student_name;}
public String getSubject_name(){return subject_name;}
public String getStudy_name(){return study_name;}
public int getRoll_no(){return roll_no;}
public int getPhon_no(){return phon_no;}
}
class ANU{
public static void main(String args[]){
Iclass an=new Iclass();
an.setStudent_name("GOOD");
an.setSubject_name("GIRL");
an.setStudy_name("SUCHARITHA");
an.setRoll_no(1);
an.setPhon_no(1);
System.out.println(an.getStudent_name());
System.out.println(an.getSubject_name());
System.out.println(an.getStudy_name());
System.out.println(an.getRoll_no());
System.out.println(an.getPhon_no());
}
}




 