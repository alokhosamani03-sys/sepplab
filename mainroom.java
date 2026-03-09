class room
{
 int length;
 int breadth;

 public void getdata(int l,int b)  
 {
  length=l;
  breadth=b;
 }
 public void calculate()
 {
  int area=length*breadth;
  System.out.println("area is"+area);
 }
}
class mainroom
{
 public static void main(String args[])
 {
  room r1=new room();
  r1.getdata(3,4);
  r1.calculate();
 }
}                                                   