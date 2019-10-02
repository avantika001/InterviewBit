/*  A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 */
    
public class Solution {
    public int titleToNumber(String A) {
        int res=0;
        int n=A.length();
        for(int i=n-1;i>=0;i--){
            res+=(A.charAt(i)-'A'+1)*(Math.pow(26,n-i-1));
        }
        return res;
    }
}
