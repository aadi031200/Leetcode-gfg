class Solution {
    public boolean checkStrings(String s1, String s2) {
         char[] even1=new char[s1.length()];
        char[] even2=new char[s1.length()];
        char[] odd1=new char[s1.length()];
        char[] odd2=new char[s1.length()];
         
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even1[i]=s1.charAt(i);
            }else{
                odd1[i]=s1.charAt(i);
            }
        }
          for(int i=0;i<s2.length();i++){
            if(i%2==0){
                even2[i]=s2.charAt(i);
            }else{
                odd2[i]=s2.charAt(i);
            }
        }

         Arrays.sort(even1);
         Arrays.sort(even2);
        Arrays.sort(odd1);
        Arrays.sort(odd2);

        return Arrays.equals(even1,even2) && Arrays.equals(odd1,odd2);
    }
}