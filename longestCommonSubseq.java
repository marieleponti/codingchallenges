class Solution {
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] T = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i <= text1.length(); i++){
            for (int j = 0; j <= text2.length(); j++){
                if (i == 0 || j == 0){
                    T[i][j] = 0;
                } else if(text1.charAt(i -1) == text2.charAt(j - 1)){
                    T[i][j] = T[i - 1][j -1] + 1;
                } else {
                    T[i][j] = Math.max(T[i][j - 1], T[i - 1][j]);
                }
            }
        }
        return T[text1.length()][text2.length()];
    }

    public static void main(String[] args){
        String str1 =  "qpppazqqqwsxtttehdbcn";
        String str2 = "pppqzwxec";
        System.out.println(str1 + ", " + str2 + ": " +
                longestCommonSubsequence(str1, str2));
    }
}