//Justin Butler 11/18/2021
/*
Runtime: 3 ms
Memory Usage: 48.3 MB
Beats 100% of Java Submissions.
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Create a boolean array to mark all the seen nums
        boolean[] seen = new boolean[nums.length+1];
        for(int i : nums)
        {
            seen[i] = true; //mark the num as seen
        }
        // Create a list of all unseen.
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i < seen.length; i++)
        {
            if(!seen[i])
            {
                res.add(i);
            }
        }
        return res;
        
    }
}
