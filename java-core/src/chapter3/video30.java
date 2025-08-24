package chapter3;

public class video30 {
	public static void main(String[] args) {
		int day = 3;
		switch(day) {
		case 1:
		System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
			break;
		default: System.out.println("another day");
		}
		
		String result = switch(day) {
		case 1 -> "monday";
		case 2 -> "tuesday";
		default -> "another day";
		};
		System.out.println(">>>Java 12 trở lên mới chạy đc, kết quả là: "+result);
		
	}
}
