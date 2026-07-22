class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> res = new HashMap<>();

        for (String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String sortedS = new String(arr);

            if (!res.containsKey(sortedS)) {
                res.put(sortedS, new ArrayList<>());
            }

            res.get(sortedS).add(s);
        }

        return new ArrayList<>(res.values());
    }
}