//Justin Butler 11/18/2021
/*
Runtime: 3 ms
Memory Usage: 48.3 MB
Beats 100% of Java Submissions.
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // map all nums to hashset
        for(int i : nums)
        {
            set.add(i);
        }
        //2 loop from i -> nums.length and check if each increment is in the set
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= nums.length; i ++)
        {
            if(!set.contains(i))
            {
                res.add(i);
            }
        }
        return res;
    }
}
