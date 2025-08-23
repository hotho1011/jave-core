package chapter2;

import java.util.Scanner;

public class lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập tên sinh viên: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.print("Nhập điểm: ");
		float diem = scanner.nextFloat();
		
		System.out.printf("%s có điểm = %.1f",name,diem);
		
	}

}
