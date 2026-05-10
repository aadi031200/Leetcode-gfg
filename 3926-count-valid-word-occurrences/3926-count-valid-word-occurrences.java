class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        int[] ans = new int[queries.length];
        StringBuilder sb = new StringBuilder();
        for (String str : chunks) {
            sb.append(str);
        }
        String s = sb.toString();

        HashMap<String,Integer> map= new HashMap<>();

        int n=s.length();
        int i=0;
        while(i<n){
            while(i<n && !isLetter(s.charAt(i))){
                i++;
            }
            if(i>=n) break;

            int start=i;
            while(i<n){
                char ch= s.charAt(i);

                if(isLetter(ch)){
                    i++;
                }
                else if(ch=='-' && i>start && i+1<n && isLetter(s.charAt(i-1)) && isLetter(s.charAt(i+1)) ){
                    i++;
                }
                else break;
            }
            String word=s.substring(start,i);
            map.put(word,map.getOrDefault(word,0)+1);

            i++;
        }

        for(int j=0;j<queries.length;j++){
            ans[j]=map.getOrDefault(queries[j],0);
        }

        return ans;
    }
    private boolean isLetter(char ch){
        return ch>='a' && ch<='z';
    }
}