public class Solution {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int n=A.size();
        if(n<=2) return 0;
        //int max=Integer.MIN_VALUE;
        long[] prod = new long[A.size()];
        
        Stack<Integer> s=new Stack<>();
        s.push(0);
        
        for(int i=1;i<n;i++){
            while(!s.isEmpty()&&A.get(s.peek())<=A.get(i)){
                s.pop();
            }
            
            if(s.isEmpty()){
                prod[i]=0;
                s.push(i);
            }else{
                prod[i]=s.peek();
                s.push(i);
            }
        }
        
        s.clear();
        s.push(0);
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&A.get(s.peek())<=A.get(i)){
                s.pop();
            }
            if(s.isEmpty()){
                prod[i]=0;
                s.push(i);
            }else{
                prod[i] *= (s.peek()%1000000007);
                s.push(i);
            }
            
        }
        
        long max = 0;
        for (int i = 0; i < A.size(); i++)
            if (prod[i] > max)
                max = prod[i];
                
        return (int)(max%1000000007);
    }
}
