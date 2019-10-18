public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String haystack, final String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        if(n2>n1) return -1;
        if(n2==0) return 0;
        for(int i=0;i<n1;i++){
            if(needle.charAt(0)==haystack.charAt(i)&&i+n2-1<=n1-1){
                String sub=haystack.substring(i,i+n2);
                if(sub.equals(needle)) return i;
            }
        }
        return -1;
    }
}
