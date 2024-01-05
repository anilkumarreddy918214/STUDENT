class Circle{
int Radius;
void insert(int R){
Radius=R;
}
void calucateArea(){System.out.println((22/7)*(Radius*Radius));}
}
class TestCircle{
public static void main(String args[]){
Circle c1=new Circle();
c1.insert(9);
c1.calucateArea();
}
}