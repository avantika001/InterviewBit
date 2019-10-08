public class Solution {
    public int trailingZeroes(int A) {
        int B=A;
        int count1=0;
        while(A>0){
            count1+=A/5;
            A=A/5;
        }
        
        int count2=0;
        while(B>0){
            count2+=B/2;
            B=B/2;
        }
        
        return (count1>count2)?count2:count1;
    }
}
