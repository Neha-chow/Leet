class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            hs2.add(nums2[i]);
        }
        List<Integer>l1 = new ArrayList<>();
        for(Integer num:hs2){
            if(!hs1.contains(num)){
                l1.add(num);
            }
        }
        List<Integer>l2 = new ArrayList<>();
        for(Integer num:hs1){
            if(!hs2.contains(num)){
                l2.add(num);
            }
        }
        List<List<Integer>>list = new ArrayList<>();
        list.add(l2);
        list.add(l1);
        return list;
    }
}