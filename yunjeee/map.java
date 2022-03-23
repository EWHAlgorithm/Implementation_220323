import java.util.Scanner;

public class map {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //공간의 크기를 나타낼 N 입력 받기 
		sc.nextLine(); // 버퍼 비우기 
		String[] plans = sc.nextLine().split(" ");
		int x = 1, y = 1;
		
		// L R U D에 따른 이동 방향 저장
		int[] dx = { 0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		char[] moveTypes = {'L', 'R', 'U', 'D'};
		
		// 이동 계획을 하나씩 확인하기
		for (int i = 0; i < plans.length; i++) {
			char plan = plans[i].charAt(0);
			
			// 이동 후 좌표 구하기
			int nx = -1, ny = -1;
			for (int j = 0; j<4; j++){
				if (plan == moveTypes[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			
			// 공간을 벗어나는 경우 이동 결과 무시하기
			if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
			
			// 이동 수행하기 
			x = nx;
			y = ny;
			
		}
		
		System.out.println(x + " " + y);
		
	}

}
