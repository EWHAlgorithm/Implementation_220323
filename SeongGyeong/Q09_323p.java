package Implementation_2;

//풀지 못해서 답지 참고했음
//핵심은 같은 수로만 쪼갠다는 것, 그리고 맨 앞에서부터 시작한다는 것!
//그러면 그냥 앞에서부터 쪼개고 맨 처음 자른 문자열이랑 비교했으면 됐는데 너무 어렵게 생각했드아

public class Q09_323p {
    public int solution(String s) {

        int answer = s.length(); //최솟값을 구하는 거니까 일단 최댓값으로 초기화를 한다

        //1부터 압축 단위를 늘려가면서 확인한다.
        for(int step = 1; step<s.length()/2+1; step++){
            String compressed =""; //이미 압축이 완료된 애들 ex. 2ab
            String prev = s.substring(0,step); //맨 앞에서부터 step만큼의 크기로 문자열 자르기
            int cnt = 1; //같은 문자열이 등장한 횟수를 세는 변수

            //단위 크기만큼 증가시키며 이전 문자열과 비교
            for(int j = step; j<s.length(); j+= step){ //이미 맨 처음 자른 문자열은 prev에 들어가있으니까 그 다음 문자부터 step의 크기만큼 자른다
                String sub = ""; //같은지 비교할 문자열
                for(int k = j; k<j+step; j++){
                    if(k < s.length()) sub+= s.charAt(k);
                }

                if(prev.equals(sub)) cnt+=1;
                //다른 문자열이 나왔다면 (더 이상 압축 안된다면)
                else{
                    compressed += (cnt>=2)? cnt + prev : prev; //지금까지 반복된 횟수만큼 일단 표기한다
                    sub=""; //그리고 비교할 문자열 다시 초기화
                    for(int k=j; k<j+step; k++){
                        if(k<s.length()) sub += s.charAt(k); //비교기준이 되는 문자열, prev를 지금 멈춘 그 위치부터 다시 만들어준다
                    }
                    prev = sub;
                    cnt = 1; //반복 횟수도 다시 초기화
                }
            }

            //남아있는 문자열 처리
            compressed += (cnt >= 2)? cnt + prev : prev; //위에 for문의 마지막 카운트에 반복된 애들은 압축에 추가를 못했으니까 추가해주기

            //만들어지는 압축 문자열이 가장 짧은 것이 정답
            answer = Math.min(answer, compressed.length()); //최솟값으로 계속 갱신
        }
        return answer;

    }

}
