class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length, m = strs[0].length();
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            s[i] = strs[i].toCharArray();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            boolean checker = true;
            for (int j = 0; j + 1 < n; j++) {
                if (s[j][i] > s[j+1][i]) {
                    checker = false;
                    break;
                }
            }
            if (!checker) {
                count++;
            }
        }
        return count;
    }
}
