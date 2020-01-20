package com.chessmaster.pieces;
public class Bishop {
	public String  color;
	public int power;
	public int id;
	public int row;
	public int col;
	
	public Bishop(String color, int row, int col){
		this.color = color;
		this.power = 5;
		this.id = 2;
		this.row= row;	
		this.col = col;
	}
	public boolean isMoveDiagonalForBishop(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		int StartPosition = this.row + this.col;
		int NextPosition = moveRow + moveCol;
		boolean isDiagonalValid = false;
		if(StartPosition == NextPosition) {
			isDiagonalValid = true;
		}else {
			if(moveRowCoeficient == moveColCoeficient) {
				isDiagonalValid = true;
			}
		}
		return isDiagonalValid;
	}
	public void move(int row, int col) {
		if(isMoveDiagonalForBishop(row, col)) {
			this.row = row;
			this.col = col;
		}
	}
	
	public void attackBishop() {
		
	}
	
	public void renderBishop() {
		
	}
}