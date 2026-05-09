class Solution {
    public int[] scoreValidator(String[] s) {
        int score=0;
        int count=0;
        int[] ans= new int[2];

        for(int i=0;i<s.length;i++){
            if(count>= 10) break;
            if(s[i].equals("W")) count+=1;
            else if(s[i].equals("WD")) score+=1;
            else if(s[i].equals("NB")) score+=1;
            else{
                score+=Integer.parseInt(s[i]);
            }
        }

        ans[0]=score;
        ans[1]=count;

        return ans;
    }
}