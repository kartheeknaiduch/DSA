class Solution {

    public String minWindow(String s, String t) {

        int n = s.length();
        int m = t.length();

        if (m > n)
            return "";

        // Try every possible window size
        for (int len = m; len <= n; len++) {

            // Check every window of this size
            for (int start = 0; start <= n - len; start++) {

                int[] need = new int[256];

                for (int i = 0; i < m; i++)
                    need[t.charAt(i)]++;

                int cnt = 0;

                // Traverse current window
                for (int end = start; end < start + len; end++) {

                    if (need[s.charAt(end)] > 0)
                        cnt++;

                    need[s.charAt(end)]--;
                }

                // First valid window is the minimum
                if (cnt == m)
                    return s.substring(start, start + len);
            }
        }

        return "";
    }
}