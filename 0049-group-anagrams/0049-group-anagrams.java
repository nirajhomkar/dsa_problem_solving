class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key))
            {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            } 
            else
            {
                map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}