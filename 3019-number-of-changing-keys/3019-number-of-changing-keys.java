class Solution {
    public int countKeyChanges(String s) {

        String sb=s.toLowerCase();
        
        int ans=0;
        int i=0;
        while(i<sb.length()-1){
            if(sb.charAt(i)!=sb.charAt(i+1)){
                ans++;
            }
            i++;
        }
        return ans;
    }
}