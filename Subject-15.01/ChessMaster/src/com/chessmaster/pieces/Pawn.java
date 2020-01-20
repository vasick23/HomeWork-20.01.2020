package com.chessmaster.pieces;
public class Pawn {
	public String  color;
	public int power;
	public int id;
	public int row;
	public int col;
	
	public Pawn(String color, int row, int col){
		this.color = color;
		this.power = 1;
		this.id = 1;
		this.row= row;	
		this.col = col;
	}
	
	public boolean isMoveActionValidForPawn(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = (moveRowCoeficient == 1);
		boolean isColMoveValid = (moveColCoeficient == 0);
		return isRowMoveValid && isColMoveValid;
	}
	
	public void movePawn(int row, int col) {
		if(isMoveActionValidForPawn(row, col)) {
			this.row = row;
			this.col = col;
		}
	}
	
	public void attackPawn() {
		
	}
	
	public void renderPawn() {
		
	}
}