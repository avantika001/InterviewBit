public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int n=A.size();
        int cSize=(int)Math.log10(C)+1;
        if(cSize<B||n==0)return 0;
        boolean zero=false;
        if(A.get(0)==0){
            zero=true;
        }
        
        if(cSize>B){
            if(B>1&&zero){
                return (n-1)*((int)Math.pow(n,B-1));
            }else{
                return (int)Math.pow(n,B);
            }
        }
        
        int count=0;
        int power=(int)Math.pow(10,B-1);
        for(int i=B;i>0;i--){
            int target=C/power;
            C=C%power;
            power=power/10;
            
            int j=0;
            for(j=0;j<n;j++){
                if(A.get(j)>=target){
                    break;
                }
            }
            
            count+=((B>1&&i==B&&zero)?j-1:j)*((int)Math.pow(n,i-1));
            if(j == n || A.get(j) > target)
                break;
            
        }
        
        return count;
    }
}
