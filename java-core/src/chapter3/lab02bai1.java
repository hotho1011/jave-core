package chapter3;

import java.util.Scanner;

public class lab02bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập điểm trung bình của học sinh: ");
		float score = scanner.nextFloat();
		System.out.println("---------------");
		if(score <= 10 && score >=9 ) {
			System.out.println("Xuất sắc");
		}else if(score <9 && score >=8) {
			System.out.println("Giỏi");
		}
		else if(score <8 && score >= 6.5) {
			System.out.println("Khá");
		}
		else if(score <6.5 && score >=5) {
			System.out.println("Trung Bình");
		}
		else if(score <5 && score >=0) {
			System.out.println("Yếu");
		}else {
			System.out.println("Điểm không hợp lệ");
		}
		scanner.close();
	}

}
