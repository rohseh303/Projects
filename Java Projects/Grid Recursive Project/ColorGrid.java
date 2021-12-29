public class ColorGrid {
	private static String [][] myPixels;
	private int myRows;
	private int myCols;
	public static void main(String[] args) {
		ColorGrid n = new ColorGrid("brrygrggyyyr", 3, 4);
		System.out.println(myPixels);
	}
	public ColorGrid(String s, int numRows, int numCols) {
		int timeran = 1;
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numCols; j++) {
				char curr =  s.charAt(i*timeran + j);
				myPixels[i][j] = Character.toString(curr);
			}
			timeran =+ 1;
		}
	}
	public void paintRegion(int row, int col, String newColor, String oldColor) {
		if(oldColor != newColor) {
			if(myPixels[row][col] == oldColor) {
				if(newColor == "r" && newColor == "b" && newColor == "g" && newColor == "y") {
					if((0 <= row && row <= myRows) && (0 <= col && col <= myCols)) {
						paintRegion(row - 1, col, newColor, oldColor);
						paintRegion(row + 1, col, newColor, oldColor);
						paintRegion(row, col - 1, newColor, oldColor);
						paintRegion(row, col + 1, newColor, oldColor);
					}
				}
			}
		}
	}
}