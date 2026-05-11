class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> ans= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                ans.add(nums[i]);
            }else{
                String s=Integer.toString(nums[i]);
                   for(int j=0;j<s.length();j++){
                    ans.add(s.charAt(j)-'0');
                }
            }
        }
        int[] res= new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }   
}