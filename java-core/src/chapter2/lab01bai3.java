package chapter2;

import java.util.Scanner;

public class lab01bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nhập vào cảnh của một khối lập phương, tính và xuất ra thể tích của khối lập phương
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương: ");
		int a = scanner.nextInt();
		int the_tich = (int)Math.pow(a, 3);
		System.out.print("Thể tích của khối lập phương là: "+ the_tich);
		scanner.close();
	}

}
