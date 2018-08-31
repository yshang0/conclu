//768_Yang_Hui_Triangle
public class Solution {
    /**
     * @param n: a Integer
     * @return: the first n-line Yang Hui's triangle
     */
    public List<List<Integer>> calcYangHuisTriangle(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        cur.add(1);
        result.add(new ArrayList<>(cur)); // add the first line;

        if(n == 0) {
            return new ArrayList<>();
        }
        if(n == 1) {
            return result; // when n == 1, return result, since the line has been added;
        }
        for(int i = 1; i < n; i++) {
            List<Integer> p = new ArrayList<>();
            p.add(1);
            if(i - 2 >= 0) {
                for(int j = 1; j < i; j++) {
                    p.add(cur.get(j -1) + cur.get(j));
                }
            }
            p.add(1);
            result.add(new ArrayList<>(p));

            cur = p; // used to calculate the next line;
        }
        return result;
    }
}

