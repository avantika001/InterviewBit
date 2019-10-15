public class Solution {
    public int romanToInt(String A) {
       int n=A.length();
       int i=0;
       int ans=0;
       HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);map.put('X',10);map.put('C',100);map.put('M',1000);
        map.put('V',5);map.put('L',50);map.put('D',500);
       
       while(i<n){
           int num1=map.get(A.charAt(i));
           if(i+1<n){
               int num2=map.get(A.charAt(i+1));
               if(num1>=num2){
                   ans+=num1;
               }else{
                   ans+=num2-num1;
                   i++;
               }
           }else{
               ans+=num1;
           }
           i++;
       }
       return ans;
    }
    
}
