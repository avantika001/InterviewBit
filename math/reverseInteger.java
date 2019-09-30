//eg: -123 --> -321 


public class Solution {

    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    
    public int reverse(int A) {
        long res=0;
        while(A!=0){
            res=res*10+A%10;
            if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)return 0;
            A=A/10;
        }
        return (int)res;
    }
}
