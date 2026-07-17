class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap <Character,Integer> first=new HashMap<>();
        HashMap <Character,Integer> second=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!first.containsKey(s.charAt(i)))
            {
                first.put(s.charAt(i),1);
            }
            else{
                first.put(s.charAt(i),first.getOrDefault(s.charAt(i),0)+1);
            }
            

            if(!second.containsKey(t.charAt(i)))
            {
                second.put(t.charAt(i),1);   
            }
            else
            {
                second.put(t.charAt(i),second.getOrDefault(t.charAt(i),0)+1);
            }
        }
        return first.equals(second);
    }
}