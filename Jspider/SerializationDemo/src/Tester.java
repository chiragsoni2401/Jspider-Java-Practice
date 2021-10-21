import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Tester {
//serialization demo
	public static void main(String[] args) {
		try {
			Employee e = new Employee(1, "raju", 11000.00);
			FileOutputStream fout = new FileOutputStream("g://demo.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e);
			System.out.println("object serialized");
			out.close();
			//generic exception
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
