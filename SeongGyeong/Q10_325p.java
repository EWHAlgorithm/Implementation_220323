package Implementation_2;

public class Q10_325p {

   /* //2차원 리스트 90도 회전하기
    public static int[][] rotateMatrixBy90Degree(int[][] a){
        int n = a.length;
        int m = a[0].length;

        int[][] result = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[j][] = a[i][j]
            }
        }

        return result;
    }

    //자물쇠의 중간 부분이 모두 1인지 확인
    public static boolean check(int[][] newLock){

    }


    public boolean solution(int[][] key, int[][] lock){
        int n = lock.length; //자물쇠 격자 세로 길이, 근데 정사각형이라 세로==가로
        int m = key.length; //키 격자 세로 길이, 근데 정사각형이라 세로 == 가로

        //자물쇠의 크기를 기존의 3배로 변환
        int[][] newLock = new int[n*3][m*3];

        //새로운 자물쇠의 중앙 부분에 기존의 자물쇠 넣기
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                newLock[i+n][j+n] = lock[i][j];
            }
        }

        //4가지 방향에 대해 확인
        for(int rotation = 0; rotation < 4; rotation++){
            key = rotateMatrixBy90Degree(key); //키를 90도로 회전시킨다.
        }
        return true;
    }

    public static void main(String[] args) {


    }*/
}
