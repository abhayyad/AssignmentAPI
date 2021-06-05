public class Rectangle {
 
 int x,y;
 float length,breadth;
 
 Rectangle()
 {
  this(0,0,4,5);
  
 }
 
 Rectangle(float l,float b)
 {
  this(0,0,l,b);
 }
 
 Rectangle(int a,int b, float l, float br)
 {
  x=a;
  y=b;
  length=l;
  breadth=br;
  
 }
 public static void main(String[] args) {
  Rectangle r1=new Rectangle();
  Rectangle r2=new Rectangle(2,3);
  Rectangle r3=new Rectangle(2,3,4,5);
  
  

 }

}