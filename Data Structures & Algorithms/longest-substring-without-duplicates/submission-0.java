class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int max=0;
        Set<Character> temp=new HashSet<>();
        for(int i=0;i<n;i++){
            while(temp.contains(s.charAt(i))){
                temp.remove(s.charAt(left));
                left++;
                }
            temp.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
