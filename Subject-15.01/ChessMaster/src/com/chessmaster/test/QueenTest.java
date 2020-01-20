package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Queen;

public class QueenTest {
	public static void testIfPieceCanMoveUp() {
		System.err.println("TestQueen:");
		Queen testElementQueen = new Queen(PieceColor.WHITE, 8, 0);
		boolean isValid=testElementQueen.isMoveActionValidForQueen(7, 0);
		String testMessage = (isValid)? "Valid":"False";		
		System.out.println(testMessage);		
	}
	public static void testIfPieceCanMoveSide() {
		Queen testElementQueen = new Queen(PieceColor.WHITE, 1, 2);
		boolean isValid=testElementQueen.isMoveActionValidForQueen(1, 8);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void testIfPieceCanNotMoveOnBothAxis() {
		Queen testElementQueen = new Queen(PieceColor.WHITE, 8, 5);
		boolean isValid = testElementQueen.isMoveActionValidForQueen(5, 1);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void testIfDiagonalIsValid() {
		Queen testElementQueen = new Queen(PieceColor.WHITE, 7, 8);
		boolean isValid=testElementQueen.isMoveDiagonalForQueen(8, 9);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void testIfDiagonalIsFalse() {
		Queen testElementQueen = new Queen(PieceColor.WHITE, 7, 8);
		boolean isValid=testElementQueen.isMoveDiagonalForQueen(5, 1);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void runQueen() {
		testIfPieceCanMoveUp();
		testIfPieceCanMoveSide();
		testIfPieceCanNotMoveOnBothAxis();
		testIfDiagonalIsValid();
		testIfDiagonalIsFalse();
	}
}
