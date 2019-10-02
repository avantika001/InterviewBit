/* Input : [(0, 0), (1, 1), (1, 2)]
Output : 2 */

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count=0;
        int n=A.size();
        for(int i=0;i<n-1;i++){
            count+=step(A.get(i),B.get(i),A.get(i+1),B.get(i+1));
        }
        return count;
    }
    static int step(int x1,int y1,int x2,int y2){
        int dx=Math.abs(x1-x2);
        int dy=Math.abs(y1-y2);
        return (dx>dy)?dx:dy;
    }
}
