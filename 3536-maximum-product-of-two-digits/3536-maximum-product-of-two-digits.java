class Solution {
    public int maxProduct(int n) {
        int dig=(int)(Math.log10(n)+1);
        int[] ans=new int[dig];
        int i=0;
        while(n!=0){
            int rmn=n%10;
            ans[i]=rmn;
            i++;
            n=n/10;
        }

        Arrays.sort(ans);

        return ans[ans.length-1]*ans[ans.length-2];
    }
}