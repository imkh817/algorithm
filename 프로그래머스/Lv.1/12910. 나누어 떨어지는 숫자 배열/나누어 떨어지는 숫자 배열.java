import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
         int[] answer = new int[arr.length];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[count] = arr[i];
                count ++;
            }
        }
        int tmp[] = new int[count];
        if(count == 0){
            tmp = new int[1];
            tmp[count] = -1;
            System.out.println("tmp[count] = " + tmp[count]);
        }else{
            for(int i=0; i<tmp.length; i++){
                tmp[i] = answer[i];
                System.out.println(tmp[i]);
            }
        }

        Arrays.sort(tmp);
        return tmp;
    }
}