public class Image {
	private final int BLACK = 1;
	private final int WHITE = 0; 
	private int[][] image;
	private int size;
	
	public static void main(String[] args)
	{
		Image b = new Image();
		b.display();
		b.eraseBlob(3,3);
		b.display();
	}
	public Image() {
		size = 8;
		image = new int [][] {{WHITE, WHITE, BLACK, WHITE, WHITE, WHITE, WHITE, WHITE,},
			{WHITE, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, WHITE,},
			{WHITE, BLACK, WHITE, WHITE, WHITE, WHITE, BLACK, WHITE,},
			{WHITE, BLACK, WHITE, BLACK, WHITE, WHITE, BLACK, WHITE,},
			{WHITE, BLACK, WHITE, WHITE, WHITE, WHITE, BLACK, WHITE,},
			{WHITE, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, WHITE,},
			{BLACK, BLACK, BLACK, BLACK, WHITE, WHITE, BLACK, WHITE,},
			{WHITE, WHITE, WHITE, BLACK, BLACK, WHITE, WHITE, WHITE,}};
	}
	public void display() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(image[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
	}
	public void eraseBlob(int row, int col) {
		if((row >= 0 && row <= size) && (col >=0 && col <= size)) {
			if(image[row][col] == BLACK) {
				image[row][col] = WHITE;
				eraseBlob(row-1, col);
				eraseBlob(row+1, col);
				eraseBlob(row, col-1);
				eraseBlob(row, col+1);
			}
		}
	}
}