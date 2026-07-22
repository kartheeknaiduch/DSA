class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int a[]=new int[n];
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int j=0;
        Integer b[]=freq.keySet().toArray(new Integer[0]);
      
        Arrays.sort(b, (x, y) -> freq.get(y) - freq.get(x));
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=b[i];
        }
        return res;
        
    }
}
