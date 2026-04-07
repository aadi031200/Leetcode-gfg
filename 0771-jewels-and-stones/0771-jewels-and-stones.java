class Solution {
    public int numJewelsInStones(String j, String s) {
        HashSet<Character> set= new HashSet<>();
        int count=0;
        for(int i=0;i<j.length();i++){
            set.add(j.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
         }

        return count;
    }
}