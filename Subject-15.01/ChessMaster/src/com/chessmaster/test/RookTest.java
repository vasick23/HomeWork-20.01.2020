package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Rook;

public class RookTest {
	public static void testIfPieceCanMoveUp() {
		System.err.println("TestRook:");
		Rook testElementRook = new Rook(PieceColor.WHITE, 8, 0);
		boolean isValid=testElementRook.isMoveActionValidForRook(7, 0);
		String testMessage = (isValid)? "Valid":"False";	
		System.out.println(testMessage);		
	}
	public static void testIfPieceCanMoveSide() {
		Rook testElementRook = new Rook(PieceColor.WHITE, 1, 2);
		boolean isValid=testElementRook.isMoveActionValidForRook(1, 8);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void testIfPieceCanNotMoveOnBothAxis() {
		Rook testElementRook = new Rook(PieceColor.WHITE, 8, 5);
		boolean isValid = testElementRook.isMoveActionValidForRook(5, 1);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void runRook() {
		testIfPieceCanMoveUp();
		testIfPieceCanMoveSide();
		testIfPieceCanNotMoveOnBothAxis();
	}
}
