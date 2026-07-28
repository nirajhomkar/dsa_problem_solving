class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Step 1: Count the frequency of each number
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 

        //Step 2: Create a max heap based on the frequency
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        //Step 3:Add all entries into the PrirorityQueue
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            pq.add(entry);
        }

        //Step 4: Extract the top k frequent elements
        int[] results = new int[k];
        for(int i=0;i<k;i++)
        {
            Map.Entry<Integer, Integer> entry = pq.poll();
            results[i] = entry.getKey();
        }
        return results;
    }
}