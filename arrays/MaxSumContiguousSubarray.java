/* Input 1:
    A = [1, 2, 3, 4, -10]

Output 1:
    10 */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max_so_far=A.get(0),curr_max=A.get(0);
        for(int i=1;i<A.size();i++){
            max_so_far=Math.max(A.get(i),max_so_far+A.get(i));
            curr_max=Math.max(max_so_far,curr_max);
        }
        return curr_max;
    }
}
