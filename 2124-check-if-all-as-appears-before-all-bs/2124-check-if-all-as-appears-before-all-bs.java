class Solution {
    public boolean checkString(String s) {
        boolean ini=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b') ini=false;

            if(ini==false && s.charAt(i)=='a') return false;
        }
        return true;
    }
}