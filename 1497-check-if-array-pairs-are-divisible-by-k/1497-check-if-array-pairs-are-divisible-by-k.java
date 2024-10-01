class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 if((arr[i]+arr[j])%k==0){
                    count++;
                 }
            }      
      }
      System.out.println(count);
      return (count>=n/2)?true:false;
    }
}