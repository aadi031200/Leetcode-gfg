class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1)
            return 1;
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = i + 1;
        while (j < chars.length) {
            if (chars[i] == chars[j]) {
                j++;
            } else {
                sb.append(chars[i]);
                if (j - i > 1) {
                    sb.append(j - i);
                }
                i = j;
                j++;
            }
        }
        sb.append(chars[i]);
        if (j - i > 1) {
            sb.append(j - i);
        }

        String ans = sb.toString();

        for (int a = 0; a < ans.length(); a++) {
            chars[a] = ans.charAt(a);
        }
        return ans.length();
    }
}