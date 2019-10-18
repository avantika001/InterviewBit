public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        String str=A.trim();
        if(str==null)return 0;
        String s[]=str.split(" ");
        int n=s[s.length-1].length();
        return n;
    }
}
