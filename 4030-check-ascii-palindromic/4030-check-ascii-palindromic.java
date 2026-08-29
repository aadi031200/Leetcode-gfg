class Solution {
    public boolean isPalindromic(String s) {
        
        String ans="";
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            String binary8Bit = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
            ans=ans.concat(binary8Bit);
        }   
        StringBuilder sb= new StringBuilder(ans);

        return sb.toString().equals(sb.reverse().toString());
    }
}