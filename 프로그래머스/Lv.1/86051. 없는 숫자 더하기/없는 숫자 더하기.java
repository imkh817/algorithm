import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
       int answer = 0;
        for(int i=0; i<=9; i++){
            boolean isContain = false;
            for(int j=0; j<numbers.length; j++){
                if(numbers[j] == i){
                    isContain = true;
                }
            }
            
            if(isContain == false) answer += i;
        }
        return answer;
    }
}