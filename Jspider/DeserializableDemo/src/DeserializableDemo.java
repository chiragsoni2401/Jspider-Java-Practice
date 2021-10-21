import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableDemo {
	public static void main(String[] args) {
		try {
			
			FileInputStream fin = new FileInputStream("g://demo.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			Employee e=	(Employee)in.readObject();
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSal());
			System.out.println("object deserialized");
			in.close();
			//generic exception
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


}
