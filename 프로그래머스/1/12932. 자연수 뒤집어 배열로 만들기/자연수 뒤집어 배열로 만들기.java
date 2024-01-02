class Solution {
    public int[] solution(long n) {
       String number = n+"";
        int[] answer = new int[number.length()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] =  Integer.parseInt(number.substring(number.length()-i-1,number.length()-i));
        	System.out.println(answer[i]);
        }
        return answer;
    }
}