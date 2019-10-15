public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n=A.size();
        int k=0;
            while(k<A.size()-1&&A.get(k)==0){
                A.remove(k);
            }
        n=A.size();
        if(A.get(n-1)>=0&&A.get(n-1)<=8){
            A.set(n-1,A.get(n-1)+1);
            
            return A;
        }
        int carry=1;
        int i=n-1;
        while(i>=0){
            int val=(A.get(i)+carry);
            A.set(i,val%10);
            carry=val/10;
            if(carry==0)break;
            i--;
        }
        if(carry>0){
            A.add(0,carry);
        }
        return A;
    }
}
