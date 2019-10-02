/* Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3] (lexicographically smallest) */

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        ArrayList<Integer> ans=new ArrayList<>();
        Collections.sort(A);
        int n=A.size();
        int i;
        for(i=0;i<n;i+=2){
            if(i==n-1)break;
            ans.add(i,A.get(i+1));
            ans.add(i+1,A.get(i));
            
        }
        if(i==n-1)ans.add(A.get(i));
        return ans;
    }
}
