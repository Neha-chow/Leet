class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
             if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }
        HashSet<Integer>hs = new HashSet<>();
        for (Integer count : hm.values()) {
            if(hs.contains(count))
            return false;
            else
            hs.add(count);
        }
        return true;
    }
}