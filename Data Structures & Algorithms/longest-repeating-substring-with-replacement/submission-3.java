class Solution {
    public int characterReplacement(String s, int k) {
    
        int maxlen=0;
        for(int i=0;i<s.length();i++){
                 int hash[]=new int[26];
                 int maxf=0;
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j)-'A']++;
                maxf=Math.max(maxf,hash[s.charAt(j)-'A']);
                int ch=(j-i+1)-maxf;
                if(ch<=k)
                {
                    maxlen=Math.max(maxlen,j-i+1);
                }
                else
                break;
            }
        }
        return maxlen;
    }
}
