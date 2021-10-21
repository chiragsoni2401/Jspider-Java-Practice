
public class NoticeBoard {
	 
	void studentRecords(Student[] arg){
		System.out.println("Rollno\tName\tMarks");
		System.out.println("--------------------------");
		for(int i = 0;i<arg.length;i++)
		{
		
		if(arg[i] != null)
		System.out.println(arg[i].rollno+"\t"+arg[i].name+"\t"+arg[i].marks);
		
				
	}

}
	int studentCount(Student[] arg){
		int count = 0;
		for(int i = 0;i<arg.length;i++){
			if(arg[i] != null)
				count++;
		}
		return count;
	}
}
