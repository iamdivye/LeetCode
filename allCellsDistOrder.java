class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> cells = new ArrayList<>();
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                cells.add(new int[]{r, c});
        cells.sort(Comparator.comparingInt(a -> Math.abs(a[0]-rCenter) + Math.abs(a[1]-cCenter)));
        int[][] result = new int[cells.size()][2];
        for (int i = 0; i < cells.size(); i++)
            result[i] = cells.get(i);
        return result;
    }
}
