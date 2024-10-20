class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []o=new int[nums.length];
        o[0]=1;
        for(int i=1;i<nums.length;i++){
            o[i]=o[i-1]*nums[i-1];

        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            o[i]=o[i]*right;
            right=right*nums[i];
        }
        return o;

        
    }
}