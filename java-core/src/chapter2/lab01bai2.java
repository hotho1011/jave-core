package chapter2;

import java.util.Scanner;

public class lab01bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		int chieu_dai = scanner.nextInt();
		System.out.print("Nhập chiều rộng: ");
		int chieu_rong = scanner.nextInt();
		int chu_vi = (chieu_dai + chieu_rong)*2;
		int dien_tich = chieu_dai * chieu_rong;
		int min = Math.min(chieu_dai, chieu_rong);
		System.out.println("Chu vi hinh chu nhat là: " +chu_vi);
		System.out.println("Dien tich hinh chu nhat là: " +dien_tich);
		System.out.println("cạnh nhỏ nhất là: " +min);
		
	}
}
