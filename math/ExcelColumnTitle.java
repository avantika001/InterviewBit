/* eg
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
*/
public class Solution {
    public String convertToTitle(int A) {
        int n=A;
        StringBuilder sb=new StringBuilder();
        while(n-->0){
            sb=sb.insert(0,(char)((A%26)+'a'));
            n=(n/26)-1;
        }
        
        return sb.toString();
    }
}
