/* Input 1:
    A = [1, 2, 5, -7, 2, 3]

Output 1:
    [1, 2, 5]
*/

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> copy=new ArrayList<>();
        long temp=0;
        long max=0;
        for(int x:A){
            if(x>=0){
                temp+=x;
                copy.add(x);
            }else{
                temp=0;
                copy.clear();
            }
            if(temp>max||(temp==max&&ans.size()<copy.size())){
                max=temp;
                ans.clear();
                ans.addAll(copy);
            }
        }
        return ans;
    }
}
