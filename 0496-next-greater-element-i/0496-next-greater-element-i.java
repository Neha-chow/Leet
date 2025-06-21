class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(j==nums2.length-1){
                        ans[k]=-1;
                    }
                    else{
                    for(int p=j+1;p<nums2.length;p++){
                        if(nums1[i]<nums2[p]){
                            ans[k]=nums2[p];
                            break;
                        }
                        else ans[k]=-1;
                    }
                    }
                    k++;
                }
            }
        }
        return ans;
    }
}