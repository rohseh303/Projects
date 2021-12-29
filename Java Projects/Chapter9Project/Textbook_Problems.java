
public class Textbook_Problems {
protected static int number;
	protected static int days;
	public T4(int n, int d) {
		number = n;
        	days = d;
	}
	public abstract int getPrice();
	public abstract String toString();
	public class WalkUp extends T4 {
		public WalkUp(int n, int d) {
			super(number, days);
		} 
		public int getPrice() {
			return 50;
		}
		public String toString() {
			return "Number: "+number+","+ " Price: 50.0" ;
		}
	}
	public class Advance extends T4 {
		public Advance(int n, int d) {
			super(number, days);
		}
		public String toString() {
			if(days >=10) {
				return "Number: "+number+","+ " Price: 30.0" ;
			}
			else {
				return "Number: "+number+","+ " Price: 40.0" ;
			}
		}
		public int getPrice() {
			if(days >=10) {
				return 30;
			}
			else {
				return 40;
			}
		}	
	}
	public class Student extends T4 {
		public Student(int n, int d) {
			super(number, days);
		}
		public String toString() {
			if(days >=10) {
				return "Number: "+number+","+ " Price: 15.0 [ID required]" ;
			}
			else {
				return "Number: "+number+","+ " Price: 20.0 [ID required]" ;
			}
		}
		public int getPrice() {
			if(days >=10) {
				return 15;
			}
			else {
				return 20;
			}
		}
	}
}