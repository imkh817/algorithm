class Solution {
    public int solution(int num) {
    int answer = 0;

        if(num != 1){
            while(answer <= 500){
                if(num == 1){
                    break;
                }
                if(num<0){
                    answer = -1;
                    break;
                }
                if(num%2==0) num/=2;
                else num=num*3+1;
                answer++;
                
            }

            // while문으로 500번 반복해도 1이 안됏을때
            if(num != 1){
                answer = -1;
            }
        }
        // 주어진 수가 1인 경우에는 if문 안돌고 바로 0 반환
        System.out.println("answer = " + answer);
        return answer;
    }
}