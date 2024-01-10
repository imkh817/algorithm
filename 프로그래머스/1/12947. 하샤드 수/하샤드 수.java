class Solution {
    public boolean solution(int x) {
       boolean answer = true;
        String arr[] = String.valueOf(x).split("");
        int tmp = 0;
        for (String s : arr){
            tmp+=Integer.parseInt(s);
        }
        if(x%tmp != 0) answer = false;
        System.out.println("answer = " + answer);
        return answer;
    }
}