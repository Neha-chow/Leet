class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int p1=0,p2=0;
       int m1=0,m2=0;
           int mid = (n+m)/2;
            for(int i=0;i<=mid;i++){
                m2 = m1;
                if(p1 != n && p2 != m){
                      if(nums1[p1]<nums2[p2]){
                          m1 = nums1[p1++];
                      }
                      else{
                          m1 = nums2[p2++];
                      }
                }else if(p1<n){
                    m1 = nums1[p1++];
                }
                else{
                    m1 = nums2[p2++];
                }
            }
        if((n+m) % 2 != 0) {
            return (double)m1;
        }
        else {
            double ans = (double) m1 + (double) m2;
            return ans / 2.0;
        }
    }
}