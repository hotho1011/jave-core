package chapter4;

import java.util.Scanner;

public class lab04bai3_33 {
//	Viết một chương trình Java yêu cầu người dùng nhập mật khẩu từ bàn phím.
//	Nếu người dùng nhập sai mật khẩu, chương trình sẽ yêu cầu nhập lại.
//
//	Khi người dùng nhập đúng mật khẩu (ví dụ: "hoidanit"), chương trình sẽ in ra thông báo "Đăng nhập thành công!" và kết thúc vòng lặp.
//
//	Sử dụng vòng lặp do-while để đảm bảo rằng chương trình luôn yêu cầu nhập ít nhất một lần.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String old="abc";
		boolean flag = false;
		do {
			System.out.print("Nhập vào mật khẩu của bạn: ");
			String password = scanner.nextLine();
			if(password.equals(old)) {
				flag = true;
				System.out.print("Đăng nhập thành công!");
			}
		}while(!flag);
		
		
		
		
		scanner.close();
		
	}

}
