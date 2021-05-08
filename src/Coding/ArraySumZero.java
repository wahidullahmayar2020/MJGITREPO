package Coding;

public class ArraySumZero {

    public int[] solution(int N) {
        // write your code in Java SE 8
        if(N==1){
            return  new int[]{0};
        }
        int num = N/2;
        int[] res = new int[N];
        int index=0;
        while(num>0){
            res[index++]=num;
            res[index++]=num *-1;
            num--;
        }
        if(N%2!=0){
            res[res.length-1]=0;
        }
        return res;
    }
}
