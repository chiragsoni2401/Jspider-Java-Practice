package FileCreationDemo;
import java.io.File;

public class FileCreationDemo {
	public static void main(String[] args) {
		File f = new File("d:\\FileCreationDemo");
		f.mkdir();
		System.out.println("File created");
		
				
	}

}
