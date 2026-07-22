class Solution {
    class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
    public String reorganizeString(String s) {
        
           // Step 1 : Count frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        // Step 2 : Max Heap
        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a,b)->b.freq-a.freq);

        for(char ch : map.keySet()) {
            pq.add(new Pair(ch,map.get(ch)));
        }

        StringBuilder ans = new StringBuilder();

        Pair prev = null;

        while(!pq.isEmpty()) {

            // Remove highest frequency character
            Pair curr = pq.poll();

            // Add it into answer
            ans.append(curr.ch);

            // Decrease frequency
            curr.freq--;

            // Put previous back into heap
            if(prev!=null && prev.freq>0) {
                pq.add(prev);
            }

            // Current becomes previous
            prev = curr;
        }

        // If all characters are not used
        if(ans.length()!=s.length())
            return "";

        return ans.toString();
    }
}