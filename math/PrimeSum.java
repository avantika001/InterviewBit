/* If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 
*/
public class Solution {
    public ArrayList<Integer> primesum(int A) {
        if(A%2==1)return new ArrayList<Integer>();
        boolean a[]=new boolean[A+1];
        Arrays.fill(a,true);
        for(int i=2;i*i<=A;i++){
            if(a[i]){
                for(int j=i*i;j<=A;j+=i){
                    a[j]=false;
                }
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=2;i<=A;i++){
            if(a[i]){
                int diff=A-i;
                if(diff>=0&&a[diff]){
                    ans.add(i);
                    ans.add(diff);
                    return ans;
                }
            }
        }
        return new ArrayList<Integer>();
    }
}
