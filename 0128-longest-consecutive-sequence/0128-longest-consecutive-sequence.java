class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        HashSet<Integer> set= new HashSet<>();

        for(int ele:nums){
            set.add(ele);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int x=num;
                int count=1;

                 while(set.contains(x+1)){
             x=x+1;
             count=count+1;   
            }
            longest=Math.max(longest,count);
            }

           
        }
      

    return longest;
    }
}