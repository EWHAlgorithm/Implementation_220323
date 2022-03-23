import java.util.Scanner;

public class time {
	
	 
	// 특정한 시각 안에 3이 포함되어 있는지의 여부 체크하기
	public static boolean check(int h, int m, int s) {
	        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
	            return true;
	        return false;
	    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		// 총 경우의 수가 크지 않음 = 다 고려해도 연산시간이 매우 크지 않음 
		// 따라서 일일이 다 계산하는, '완전 탐색'을 통해서도 해결 가능할 것 
		
		for (int i = 0; i <= n; i++) { //시간 계산 
			for ( int j = 0; j<60; j++) { // 분 계산 
				for (int k = 0; k<60; k++) { //초 계산 
				if( check(i, j, k)) cnt++;
				} // 각각 i, j, k 중 해당되는 경우가 있다면 카운트 증가할 것 
		}
		
	}
	
		System.out.println(cnt);
		
}

}
