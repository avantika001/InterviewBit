/* Input:S = 111
    Output:[] */
    
public class Solution {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean zero=false;
        int n=A.length();
        int gain[]=new int[n];
        for(int i=0;i<n;i++){
            gain[i]=(A.charAt(i)=='1')?-1:1;
            if(A.charAt(i)=='0')zero=true;
        }
        
        if(!zero) return ans;
        
        int currL=0,currR=0,currmax=0,sum=0;
        int L=0,R=0;
        for(int i=0;i<n;i++){
            if(sum+gain[i]>=0){
                sum=sum+gain[i];
                currR=i;
            }else{
                sum=0;
                currL=i+1;
            }
            
            if(sum>currmax){
                currmax=sum;
                L=currL;
                R=currR;
            }
        }
        
        ans.add(L+1);
        ans.add(R+1);
        
        return ans;
        
    }
}
