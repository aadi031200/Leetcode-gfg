class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int sum=0;
            for(int j=0;j<s.length();j++){
                sum+=weights[s.charAt(j)-'a'];
            }
            int x=sum%26;
            sb.append((char)('z'-x));
        }
        return sb.toString();
    }
}