class Solution {
    public char processStr(String s, long k) {
        int n=s.length();
        long l=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(l>0) l--;
            }else if(ch=='#'){
                l*=2;
            }else if(ch=='%'){
                //reverse , no change in L
                continue;
            }else{
                l++;
            }
        }

        if(k>=l){
            return '.';
        }

        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='*'){
                l++;  //no change in k
            }else if(ch=='%'){
                k=l-k-1; // no change in l
            }else if(ch=='#'){
                l=l/2;
                k=(k>=l)?k-l:k;
            }else{ //'a' to 'z'
                l--;
            }

            if(l==k) return s.charAt(i);
        }

        return '.';
    }
}