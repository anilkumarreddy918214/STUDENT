class Rectangle
{
int Length;
int Width;
void insert(int L,int W)
{
Length=L;
Width=W;
}
void calucateArea()
{
System.out.println(Length*Width);
}
}
class TestRectangle
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(2,3);
r2.insert(4,6);
r1.calucateArea();
r2.calucateArea();
}
}

