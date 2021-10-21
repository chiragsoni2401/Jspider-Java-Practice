
public class Battery {
int number;
int capacity;
public Battery(int number, int capacity) {
	
	this.number = number;
	this.capacity = capacity;
}
@Override
public String toString() {
	return "Battery [number=" + number + ", capacity=" + capacity + "]";
}


}
