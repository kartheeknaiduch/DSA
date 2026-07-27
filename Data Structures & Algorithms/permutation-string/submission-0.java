class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2)
            return false;

        int[] need = new int[26];

        for (int i = 0; i < n1; i++)
            need[s1.charAt(i) - 'a']++;

        for (int i = 0; i <= n2 - n1; i++) {

            int[] freq = new int[26];

            for (int j = i; j < i + n1; j++)
                freq[s2.charAt(j) - 'a']++;

            if (equal(need, freq))
                return true;
        }

        return false;
    }

    public boolean equal(int[] need, int[] freq) {

        for (int i = 0; i < 26; i++)
            if (need[i] != freq[i])
                return false;

        return true;
    }
}