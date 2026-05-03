class Solution {

    public boolean isprime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i) count++;
            }
        }
        if(count==2) return true;
    else return false;
    }
    
    public int sumOfPrimesInRange(int n) {
        int r=0;
        int m=0;
        int nn=n;
        int sum=0;
        
        while(n!=0){
            m=n%10;
            r=(r*10)+m;
            n=n/10;
        }

        int min=Math.min(nn,r);
        int max=Math.max(nn,r);

        for(int i=min;i<=max;i++){
            if(isprime(i)==true){
                sum+=i;
            }
        }
        return sum;
    }
}