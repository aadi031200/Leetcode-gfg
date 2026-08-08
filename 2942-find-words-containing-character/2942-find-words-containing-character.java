class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans= new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String s=words[i];
           for(char ch:s.toCharArray()){
             if(ch==x){
                ans.add(i);
                break;
            }
           }
        }
        return ans;
    }
}