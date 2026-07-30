class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        int c=0;
        for(int i=0;i<word.length();i++){
            c++;
            if(c<=8) ans+=1;
            else if(c>=9 && c<=16) ans+=2;
            else if(c>=17 && c<=24) ans+=3;
            else ans+=4;
        }
        return ans;
    }
}