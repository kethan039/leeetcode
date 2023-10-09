class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && isSpecialRow(i, mat) && isSpecialCol(j, mat)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isSpecialRow(int row, int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat[row].length; i++) {
            sum += mat[row][i];
            if (sum > 1) return false;
        }
        return true;
    }

    private boolean isSpecialCol(int col, int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][col];
            if (sum > 1) return false;
        }
        return true;
    }
}