package com.chessmaster.pieces;
public class Knight {
	public String  color;
	public int power;
	public int id;
	public int row;
	public int col;
	
	public Knight(String color, int row, int col){
		this.color = color;
		this.power = 5;
		this.id = 3;
		this.row= row;	
		this.col = col;
	}
	public boolean isMoveActionValidForKnight(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = false;
		boolean isColMoveValid = false;
		if((moveRowCoeficient <= 2)) {
			if(moveColCoeficient < 0) {
				if(moveColCoeficient >= -2){
					isColMoveValid = true;
					isRowMoveValid = true;
				}
			}else {
				if(moveColCoeficient > 0) {
					if(moveColCoeficient <= 2){
						isColMoveValid = true;
						isRowMoveValid = true;
					}
				}
			}	
		}
		return isRowMoveValid && isColMoveValid;
	}	
	public void move(int row, int col) {
		if(isMoveActionValidForKnight(row, col)) {
			this.row = row;
			this.col = col;
		}
	}
	public void attackKnight() {
		
	}
	public void renderKnight() {
		
	}
}
