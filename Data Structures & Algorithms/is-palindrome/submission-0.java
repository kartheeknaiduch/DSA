class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder sb=new StringBuilder();
      
      for (int i = 0; i < s.length(); i++) {
         if (Character.isLetterOrDigit(s.charAt(i))) {
            sb.append(Character.toLowerCase(s.charAt(i)));
         }
      }
      String org=sb.toString();
      String reverse=sb.reverse().toString();
      if(org.equals(reverse))
       return true;
       else
        return false;
    }
}
