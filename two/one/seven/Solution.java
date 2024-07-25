package two.one.seven;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> conta = new HashSet<>();
        for (int num : nums) {
            if (!conta.add(num)) {
                return true;
            }
        }
        return false;
    }
}