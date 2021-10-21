
public class MainClass {

	public static void main(String[] args) {
		Mobile orgMobile = new Mobile(3215, "Android", 4);
		Mobile cloneMobile = null;
		
		try {
			cloneMobile = (Mobile)orgMobile.clone();
			
		} catch (CloneNotSupportedException e) {
			System.out.println("can't take clone of object");
		}
		System.out.println("hashCode no. of original mobile: "+orgMobile.hashCode());
		System.out.println("hashCode no. of clone mobile: "+cloneMobile.hashCode());

		System.out.println("hashCode no. of original battery: "+orgMobile.b1.hashCode());
		System.out.println("hashCode no. of clone battery: "+cloneMobile.b1.hashCode());
		
		System.out.println("original battery properties\n");
		System.out.println(orgMobile.b1);
		System.out.println("cloned battery properties\n");
		System.out.println(cloneMobile.b1);
		System.out.println();
		System.out.println("orignal mobile properties\n");
		System.out.println(orgMobile);
		System.out.println("cloned mobile properties\n");
		System.out.println(cloneMobile);


	}
}
