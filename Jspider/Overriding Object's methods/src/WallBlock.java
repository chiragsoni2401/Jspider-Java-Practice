/**
 * 
 */

/**
 * @author pilu soni
 *
 */
public class WallBlock {
	int hrs;
	int minutes;
	int seconds;
	public WallBlock(int hrs, int minutes, int seconds) {
		this.hrs = hrs;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	
	@Override
	public boolean equals(Object arg) {
		
		WallBlock ref = (WallBlock) arg;
		
		return this.hrs == ref.hrs && this.minutes == ref.minutes && this.seconds == ref.seconds;
	}
	@Override
	public String toString() {
		return "WallBlock [hrs=" + hrs + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}
	

}
