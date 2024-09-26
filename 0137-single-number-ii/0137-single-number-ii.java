class Solution {
    public static boolean Cb(int a,int b){
        return ((a & (1<<b) )!=0);
    }
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<=31;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(Cb(nums[j],i)){
                    c++;
                }
            }
            if(c%3!=0)
            ans |= 1<<i;
        }
        return ans;
    }
}