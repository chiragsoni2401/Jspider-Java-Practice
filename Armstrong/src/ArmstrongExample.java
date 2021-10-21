import java.util.Scanner;  
class ArmstrongExample{  
  public static void main(String[] args)  {  
    int c=0,a,temp;  
    Scanner n= new Scanner(System.in);
    System.out.println("enter number");  
    int num=n.nextInt();
    //It is the number to check armstrong  
    //some armstrong no. are: 370,371,153,407
    temp=num;  
    while(num>0)  
    {  
    a=num%10;  
    num=num/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  