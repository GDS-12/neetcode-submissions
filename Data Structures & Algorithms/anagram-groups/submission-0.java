class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            for(int i=0; i<s.length(); i++){
                count[s.charAt(i)-'a']++;
            }
            List<Integer> key = new ArrayList<>();
            for (int x : count){
                key.add(x); 
            }
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> value : map.values()){
            result.add(value);
        }
        return result;
    }
}
