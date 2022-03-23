import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //내가 쓴 답안 : if문으로 다 짜서 뭔가 조금 코드가 길어보이는 느낌

        /*String start = sc.next();
        char Col = start.charAt(0);
        int col = (int)Col;
        int row =Integer.parseInt(start.substring(1));
        int count = 0;

        //왼쪽으로 두칸 아래쪽으로 한 칸
        if(col -2 >= 97 &&  row +1 <=8)
            count++;

        //왼쪽으로 두칸 위로 한 칸
        if(col -2 >= 97 && row - 1 >= 1 )
            count ++;

        //오른쪽으로 두칸 위로 한 칸
        if(col + 2 <= 104 && row - 1 >= 1)
            count++;

        //오른쪽으로 두칸 아래로 한 칸
        if(col + 2 <= 104 && row +1 <= 8)
            count++;

        //아래로 두칸 오른쪽으로 한칸
        if(col + 1 <= 104 && row +2 <= 8)
            count++;

        //아래로 두칸 왼쪽으로 한칸
        if(col - 1 >= 97 && row +2 <= 8)
            count++;

        //위로 두칸 오른쪽으로 한칸
        if(col + 1 <= 104 && row -2 >= 1)
            count++;

        //위로 두칸 왼쪽으로 한칸
        if(col - 1 >= 97 && row -2 >= 1)
            count++;

        System.out.println(count);*/



        //답지에서 제시한 코드
        /*
        //현재 나이트의 위치 입력받기
        String inputData = sc.next();
        int column = inputData.charAt(0) -'a' + 1;
        int row = inputData.charAt(1) -'0';

        //나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1 };

        //8가지 방향에 대하여 각 위치로 이동이 가능한 지 확인한다
        int count = 0;
        for (int i =0 ; i< 8; i++){
            int nextRow = row + dx[i];
            int nextCol = column + dy[i];

            if(nextCol>= 1 && nextCol<=8 && nextRow>=1 && nextRow<=8)
                count++;
        }

        System.out.println(count);


*/
    }
}
