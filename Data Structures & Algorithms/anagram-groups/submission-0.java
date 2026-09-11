class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] arr = new int[26];
            for (char a : strs[i].toCharArray()) {
                arr[a - 'a']++;
            }
            String ref = Arrays.toString(arr);
            if (!map.containsKey(ref)) {
                map.put(ref, new ArrayList<>());
            }
            map.get(ref).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}