class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int ans=gcd(str1.length(),str2.length());
        return str1.substring(0,ans);

    }
    public int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
        else b=b%a;
        }
        if(a==0) return b;
        return a;
    }
}