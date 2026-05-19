// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {

//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums1) {
//             set.add(num);
//         }

//         int ans = Integer.MAX_VALUE;

//         for (int num : nums2) {
//             if (set.contains(num)) {
//                 ans = Math.min(ans, num);
//             }
//         }

//         return ans == Integer.MAX_VALUE ? -1 : ans;
//     }
// }


class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }

            else if (nums1[i] < nums2[j]) {
                i++;
            }

            else {
                j++;
            }
        }

        return -1;
    }
}