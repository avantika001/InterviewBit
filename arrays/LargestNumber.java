/* Given [3, 30, 34, 5, 9], the largest formed number is 9534330. */

public class Solution implements Comparator<String> {
    // DO NOT MODIFY THE LIST
    public String largestNumber(final List<Integer> A) {
        List<String> B = new ArrayList<String>();
        for (Integer number : A) {
            String x = number.toString();
            B.add(x);
        }
        Collections.sort(B, this);
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        for (int i = B.size() - 1; i >= 0; i--) {
            ans.append(B.get(i));
            sum += Integer.parseInt(B.get(i));
        }
        return sum == 0 ? "0" : ans.toString();
    }

    public int compare(String a, String b) {
        String fe = a + b;
        String se = b + a;
        return (fe.compareTo(se));
    }

}
