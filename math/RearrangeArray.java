public class Solution {
    public void arrange(ArrayList<Integer> a) {
        int n=a.size();
        for(int i=0;i<n;i++){
            int val=(a.get(a.get(i))%n)*n;
            a.set(i,a.get(i)+val);
        }
        
        for(int i=0;i<n;i++){
            a.set(i,a.get(i)/n);
        }
    }
}
