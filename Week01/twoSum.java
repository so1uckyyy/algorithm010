class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int[] returnResult = {-1,-1};
        for(int i = 0;i < nums.length - 1;i++){
            for(int j = i+1;j < nums.length;j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    returnResult[0] = i;
                    returnResult[1] = j;
                    return returnResult;
                }
            }
        }
        return returnResult;
    }
}