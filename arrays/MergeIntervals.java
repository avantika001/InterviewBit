/* Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9]. */

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        Stack<Interval> s=new Stack<>();
        int n=intervals.size();
        intervals.add(newInterval);
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                return a.start-b.start;
            }
        });
        
        s.push(intervals.get(0));
        for(int i=1;i<n+1;i++){
            Interval temp=s.peek();
            if(temp.end<intervals.get(i).start){
                s.push(intervals.get(i));
            }else if(temp.end<intervals.get(i).end){
                temp.end=intervals.get(i).end;
            }
        }
        ArrayList<Interval> res=new ArrayList<>();
        while(!s.empty()){
            res.add(s.pop());
        }
        Collections.reverse(res);
        return res;
    }
}
