java.util.Scanner;
class Rect{
    int a,c;
    Rect(int l,int b){// this is constructor
        a=l;
        c=b;
    }public void display(){
        System.out.println("area is"+(a*c));//l*b cant do coz they are local variable they are present only in rect
    }
} import 
public class  Main{
    public static void main(String[]args){
      Scanner scan=new Scanner(System.in); 
      int l,b;
      int n=scan.nextInt();
      Rect[] r=new Rect[n];
      for(int i=0;i<n;i++){
          System.out.println("enter the length"+(i+1));
          l=scan.nextInt();
          System.out.println("enter the breadth"+(i+1));
                    b=scan.nextInt();
                    r[i]=new Rect(l,b);
          
          
      }for(int i=0;i<n;i++){
          System.out.println("area of the rectangle"+(i+1));
          r[i].display();
          
      }
      
    }}
