import java.util.Scanner;
class student{
    int m1,m2,m3;
    String name1;
    student(String name,int n1,int n2,int n3){// this is constructor
        m1=n1;
        m2=n2;
        m3=n3;
        name1=name;
    }public void display(){
        System.out.println("percentage of"+ name1 +"is"+((m1+m2+m3)/3));//l*b cant do coz they are local variable they are present only in rect
    }
}
public class  Main{
    public static void main(String[]args){
      Scanner scan=new Scanner(System.in); 
      int n1,n2,n3;
      String name;
      System.out.println("enter num of students");
      int n=scan.nextInt();
      student[] r=new student[n];
      for(int i=0;i<n;i++){
          System.out.println("enter the detail of student"+(i+1));
          name=scan.next();
          n1=scan.nextInt();
          
                    n2=scan.nextInt();
                    
                    n3=scan.nextInt();
                    r[i]=new student(name,n1,n2,n3);//creating object
          
          
      }for(int i=0;i<n;i++){
          System.out.println("percentage of student"+(i+1));
          r[i].display();
          
      }
      
    }}
