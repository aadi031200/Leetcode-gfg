class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        int i=1;
        int m=n;
        while(n!=0){
            if(i%2==0){
                even+=i;
                n--;
            }
            i++;
        }
        int j=1;
         while(m!=0){
            if(j%2!=0){
                odd+=j;
                m--;
            }
            j++;
        }

        while(odd>0 && even>0){
            if(odd>even){
                odd=odd%even;
            }else{
                even=even%odd;
            }
        }
        if(odd==0) return even;
       //else  return odd;
        
       return odd;
    }
}