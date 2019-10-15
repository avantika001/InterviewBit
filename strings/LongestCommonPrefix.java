public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        String s=A.get(0);
        int n=A.size();
        
        String str="";
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int j=0;
            while(j<n&&A.get(j).length()>i&&A.get(j).charAt(i)==ch){
                j++;
            }
            if(j!=n)break;
            str+=ch;
        }
        
        return str;
    }
}
