
public class Mobile implements Cloneable {
int imie;
String os;
int ramSize;
//Has-A relationship
Battery b1 = new Battery(21254, 1000);
public Mobile(int imie, String os, int ramSize) {
	
	this.imie = imie;
	this.os = os;
	this.ramSize = ramSize;
}
@Override
public String toString() {
	return "Mobile [imie=" + imie + ", os=" + os + ", ramSize=" + ramSize + "]";
}
@Override
public Object clone() throws CloneNotSupportedException{
	Mobile m1 = new Mobile(this.imie, this.os, this.ramSize);
	Battery b2 = new Battery(this.b1.number, this.b1.capacity);
	m1.b1= b2;
	
	return m1;
	
}


}
