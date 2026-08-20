class common{
  static String PM="Narendra Modi";
}
class TN[
static String CM="Vijay";
ststic String state="Tamil Nadu";
String dis;
int no;
public void set_obj(String a,int b){
  this.dis=a;
  this.no=b;
}
public void display(){
 System.out.println("PM: "+common.PM);
 System.out.println("CM: "+CM);
 System.out.println("State: "+state);
 System.out.println("Dis: "+dis);
 System.out.println("population: "+no);
}
}class AP{
  static String CM="CB Naidu";
static String state="Andhra pradesh";
String dis;
int no;
  public void set_obj(String a,int b){
  this.dis=a;
  this.no=b;
}public void display(){
 System.out.println("PM: "+common.PM);
 System.out.println("CM: "+CM);
 System.out.println("State: "+state);
 System.out.println("Dis: "+dis);
 System.out.println("population: "+no);
}
}
public class Main{
  public static void main(String[]args){
    TN a=new TN();
    TN b=new TN();
    AP a1=new AP();
    AP b1=new AP();
    a.set_obj("chennai",60);
        b.set_obj("theni",66);
    a.display();
    b.display();
    System.out.println("-------------------");
        a1.set_obj("hyd",61);
        b1.set_obj("kurnool",63);
        a1.display();
    b1.display();
  }}
    
    
    
    
  
  

  
