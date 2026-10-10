class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans= new ArrayList<>();

        HashSet<Integer> h1= new HashSet<>();
        HashSet<Integer> h2= new HashSet<>();

        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();

        for(int ele:nums1){
            h1.add(ele);
        }
        for(int ele:nums2){
            h2.add(ele);
        }

        for (int ele : h1) {
            if (!h2.contains(ele)) {
                list1.add(ele);
            }
        }

        for (int ele : h2) {
            if (!h1.contains(ele)) {
                list2.add(ele);
            }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}