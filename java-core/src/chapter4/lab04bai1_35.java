package chapter4;

public class lab04bai1_35 {
	public static void main(String[] args) {
//		Yêu cầu 1: Tìm số đầu tiên chia hết cho 7 trong dãy số từ 1 đến 100
//		Gợi ý: Duyệt từ 1 → 100, in ra số đầu tiên chia hết cho 7 rồi dừng lại (dùng break).
		
		int x=0;
		for(int i=1; i<=100;i++) {
			
			if(i % 7 == 0) {
				x++;
			}
			if(x==3) {
				System.out.println("Số thứ 3 chia hết cho 7 là: "+i);
				break;
			}
			
		}
		
//		Yêu cầu 2: In các số từ 1 đến 10, bỏ qua số lẻ (dùng continue)
		
		for(int j =1;j<=10;j++) {
			if(j%2 ==1) continue;
			System.out.println(j);
		}

	}
}
