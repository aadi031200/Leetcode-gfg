class Solution {
    public String reverseVowels(String s) {
        if(s.equals(" ")) return s;
        StringBuilder sb= new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(j)==' ') j--;
            if( s.charAt(i)==' ') i++;
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                sb.setCharAt(i,s.charAt(j));
                sb.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }else if(!isVowel(s.charAt(i))){
                i++;
            }else j--;
        }

        return sb.toString();
    }

    public boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
         if(ch=='e' || ch=='E') return true;
          if(ch=='i' || ch=='I') return true;
           if(ch=='o' || ch=='O') return true;
            if(ch=='u' || ch=='U') return true;
        return false;
    }
}