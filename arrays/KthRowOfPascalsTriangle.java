public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> temp=new ArrayList<>();
        
        temp.add(1);
        if(A==0){
            return temp;
        }
        
        for(int i=1;i<=A;i++){
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(1);
            
            for(int j=1;j<i;j++){
                int sum=temp.get(j)+temp.get(j-1);
                ans.add(sum);
            }
            
            ans.add(1);
            temp=ans;
            
        }
        
        return temp;
        
    }
}
