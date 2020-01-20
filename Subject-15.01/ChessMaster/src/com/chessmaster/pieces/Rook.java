package com.chessmaster.pieces;
public class Rook {
	public String  color;
	public int power;
	public int id;
	public int row;
	public int col;
	
	public Rook(String color, int row, int col){
		this.color = color;
		this.power = 5;
		this.id = 4;
		this.row= row;	
		this.col = col;
	}
	public boolean isMoveActionValidForRook(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = false;
		boolean isColMoveValid = false;
		if((moveRowCoeficient >= 0) && (moveColCoeficient <= 0)) {
			isColMoveValid = true;
			isRowMoveValid = true;
		}
		return isRowMoveValid & isColMoveValid;
	}
	
	public void move(int row, int col) {
		if(isMoveActionValidForRook(row, col)) {
			this.row = row;
			this.col = col;
		}
	}
	
	public void attackRook() {
		
	}
	
	public void renderRook() {
		
	}
}
