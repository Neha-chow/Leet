class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }
        for(int i:nums2){
            hs2.add(i);
        }
        int count1=0,count2=0;
        for(int i:nums1){
           if(hs2.contains(i)){
            count1++;
           }
        }
        for(int i:nums2){
           if(hs1.contains(i)){
            count2++;
           }
        }
        int a[] = new int[2];
        a[0] = count1;
        a[1] = count2;
        return a;
    }
}