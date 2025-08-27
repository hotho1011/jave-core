package chapter4;

import java.util.Scanner;

public class lab04final {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Chương trình quản lý điểm số");
			System.out.println("-------------------");
			float sum = 0;
			int count =0;
			float score=0;
			
			do {
				System.out.print("Nhập vào điểm số: ");
				score = scanner.nextFloat();
				if(score <=0 || score >= 10) {
					System.out.println("Điểm không hợp lệ, Nhập lại");
					continue;
				}
					
				sum+=score;
				count++;
;			}while(score != -1);
			
			int choose= 0;
			
				System.out.println("--------------------");
				System.out.println("====MENU====");
				System.out.println("1. Tính điểm trung bình");
				System.out.println("2. Phân loại học lực");
				System.out.println("3. Thoát chương trình");
				System.out.println("Nhập lựa chọn: ");
				choose = scanner.nextInt();
				float average = sum/count;
				 switch (choose) {
				case 1: {
					
					if(sum!=0) {
						System.out.printf("Điểm trung bình đã nhập là: %.2f",average);
					}else {
						System.out.println("Bạn chưa nhập điểm nào!");
					}
					
					break;
				}
				case 2: {
					if(average >=9 && average <=10) {
						System.out.println("Xếp loại xuất sắc");
					}else if(average >=8 && average <9) {
						System.out.println("Xếp loại giỏi");
					}else if(average >=6.5 && average <8) {
						System.out.println("Xếp loại khá");
					}else if(average >=5 && average <6.5) {
						System.out.println("Xếp loại trung bình");
					}else {
						System.out.println("Xếp loại yếu");
					}
					break;
				}
				case 3: return;
				default: System.out.println("Lựa chọn không hợp lệ, mời chọn lại");
					
				}
			
			
			
//			System.out.println(sum +"---"+count);
			
			scanner.close();
			return;
		}
}
