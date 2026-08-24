class Solution {
    public int getLucky(String s, int k) {
        
        // First transformation
        int sum = 0;

        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;

            // Add digits of value
            sum += value / 10;
            sum += value % 10;
        }

        // Remaining k-1 transformations
        for (int i = 1; i < k; i++) {
            int digitSum = 0;

            while (sum > 0) {
                digitSum += sum % 10;
                sum /= 10;
            }

            sum = digitSum;
        }

        return sum;
    }
}