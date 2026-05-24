class Solution {
    public int passwordStrength(String s) {
        int count=0;
        HashSet<Character> set= new HashSet<Character>();

      for(int i=0;i<s.length();i++){
        set.add(s.charAt(i));
      }


        for(char ch:set){
            if(ch >= 'a' && ch<='z'){
                count+=1;
            }else if(ch >= 'A' && ch<='Z'){
                count+=2;
            }else if(ch >= '0' && ch<='9'){
                count+=3;
            }else{
                count+=5;
            }
        }
        return count;
    }
}