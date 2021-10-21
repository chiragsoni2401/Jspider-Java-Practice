
import java.util.Scanner;
public class MainClass 
{
 public static void main(String[] args)  
 {
		
  Scanner sc = new Scanner(System.in);
		
  System.out.println("Enter Number of Students:");
		
  Student[] stArr = new Student[sc.nextInt()];
		
  System.out.println("You Entered: "+ stArr.length);
		
		for(int i = 0; i<stArr.length;i++)
		{
	        System.out.println("Enter Student "+i+" Details:");
	        System.out.println();
			System.out.println("Enter Roll Number:\n");
			int rollno = sc.nextInt();
			System.out.println("Enter Name:\n");
			String name = sc.next();
			System.out.println("Enter Marks:\n");
			double marks = sc.nextDouble();
			
			stArr[i] = new Student(rollno, name, marks);
			
		}
		NoticeBoard nb = new NoticeBoard();
		nb.studentRecords(stArr);
		nb.studentCount(stArr);

 }

}
