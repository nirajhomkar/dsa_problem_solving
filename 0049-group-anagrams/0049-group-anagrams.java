class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String,List <String>> map=new HashMap<>();
        for(String s: strs){
            //1 Generate Key
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            //2 Check whether key exists
            if(map.containsKey(key)){
                //add s to existing list
                map.get(key).add(s);
            }
            
           

            //3 Add s to the appropriate list
            else
            {
                
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
            
        }
        for(Map.Entry<String,List<String>> entry:map.entrySet())
        {
            answer.add(entry.getValue());
        }
        return answer;
        
    }
}