package Week_06;


public class CountSubstrings {
    public static void main(String[] args) {

        System.out.println(Solution_1.countSubstrings("abc"));
    }
}

 class Solution_1 {
    public static int countSubstrings(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int result = s.length();
        for (int i = 0; i < n; i++) dp[i][i] = true;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }
                if (dp[i][j]) {
                    result++;
                }
            }
        }
        return result;

    }
}