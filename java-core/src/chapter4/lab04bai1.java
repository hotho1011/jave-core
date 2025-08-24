package chapter4;

import java.util.Scanner;

public class lab04bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết chương trình java, nhập vào một số nguyên từ 1 đêbs 7
		//In ra tên ngày trong tuần tương ứng, theo thứ tự
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào một số nguyên từ 1-7: ");
		int day = scanner.nextInt();
		switch (day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day number!");
		}

		//Cách 2
		String result = switch(day){
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day number!";
		};
		System.out.println(result);
		
		scanner.close();
	}

}
