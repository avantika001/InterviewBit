/* Input : 
        Arrivals :   [1 3 5]
        Departures : [2 6 8]
        K : 1

Return : False / 0 
*/

public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int n=arrive.size();
        long platforms=1;
        long max=1;
        int i=1,j=0;
        while(i<n&&j<n){
            if(arrive.get(i)<depart.get(j)){
                platforms++;
                i++;
            }else{
                platforms--;
                j++;
            }
            max=(max<platforms)?platforms:max;
        }
        
        if(max<=K) return true;
        return false;
    }
}
