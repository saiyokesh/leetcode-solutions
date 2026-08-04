class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>Set = new HashSet<>();
        for(int num : nums){
            if(!Set.add(num)){
                return true;
            }
            
        }
        return false;
    }
}