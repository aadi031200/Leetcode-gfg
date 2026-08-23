class Solution {
    public boolean sumGame(String num) {
        int n=num.length();

        int leftq=0;
        int rightq=0;

        int lefts=0;
        int rights=0;

        for(int i=0;i<n;i++){
           if(num.charAt(i)=='?'){
             if(i<n/2){
                leftq++;
            }else{
                rightq++;
            }
           }else{
                if(i<n/2){
                lefts+=num.charAt(i)-'0';
            }else{
                rights+=num.charAt(i)-'0';
            }
           }
        }

        int total=leftq+rightq;
        if(total%2==1) return true;

        int left=2*lefts+9*leftq;
        int right=2*rights+9*rightq;

        if(left==right) return false;

        return true;
    }
}