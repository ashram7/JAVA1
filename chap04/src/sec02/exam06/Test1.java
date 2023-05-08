package sec02.exam06;

public class Test1 {

	public static void main(String[] args) {
		int total = 0;
		int i = 0;
		while (i<10) { // i = 9
			i++;       // i = 9 (10)
			total+=i;  // tot(55) = tot(45) + 10
			System.out.print(i);  // 1+2+3+...9+10
			if(i!=10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}
