class Solution {
    public boolean isAnagram(String s, String t) {
         int n=s.length();
         if (s.length() != t.length())
        return false;
         char a[]=s.toCharArray();
         char b[]=t.toCharArray();
         Map<Character,Integer> freq=new HashMap<>();
         for(int i=0;i<n;i++){
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            freq.put(b[i], freq.getOrDefault(b[i], 0) - 1);
         }
    
         for(int value:freq.values()){
              if(value!=0)
               return false;
         }
         return true;

    }
}
