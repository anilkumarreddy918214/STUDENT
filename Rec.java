class Bio{
private String mine_name;
private String nic_name;
private String native_place;
private String bio;
private String phon_name;
public void setMine_name(String mine_name)
{this.mine_name=mine_name;}
public void setNic_name(String nic_name)
{this.nic_name=nic_name;}
public void setNative_place(String native_place)
{this.native_place=native_place;}
public void setBio(String bio)
{this.bio=bio;}
public void setPhon_name(String phon_name)
{this.phon_name=phon_name;}
public String getMine_name()
{return mine_name;}
public String getNic_name()
{return nic_name;}
public String getNative_place()
{return native_place;}
public String getBio()
{return bio;}
public String getPhon_name()
{return phon_name;}
}
class ANUPAMA{

public static void main(String args[]){
Bio sc=new Bio();
sc.setMine_name("ANUPAMA dAR@LING");
sc.setNic_name("PONNU");
sc.setNative_place("KERALA PORI");
sc.setBio("ACTOR ('HEROHIEN')");
sc.setPhon_name("143");
System.out.println(sc.getMine_name());
System.out.println(sc.getNic_name());
System.out.println(sc.getNative_place());
System.out.println(sc.getBio());
System.out.println(sc.getPhon_name());
}
}
















