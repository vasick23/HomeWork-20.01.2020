package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.*;

public class KingTest {
	public static void testIfPieceCanMoveOnlyOneSquere() {
		System.err.println("TestKing:");
		King testElementKing = new King(PieceColor.WHITE, 8, 0);
		boolean isValid=testElementKing.isMoveActionValidForKing(7, 0);
		String testMessage = (isValid)? "Valid":"False";	
		System.out.println(testMessage);		
	}
	public static void testIfPieceCanNotMoveMoreThenOneSquere() {
		King testElementKing = new King(PieceColor.WHITE, 8, 0);
		boolean isValid = testElementKing.isMoveActionValidForKing(7, 1);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void testIfDiagonalIsValid() {
		King testElementKing = new King(PieceColor.WHITE, 8, 8);
		boolean isValid=testElementKing.isMoveDiagonalForKing(9, 9);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void testIfDiagonalIsFalse() {
		King testElementKing = new King(PieceColor.WHITE, 7, 8);
		boolean isValid=testElementKing.isMoveDiagonalForKing(5, 1);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void runKing() {
		testIfPieceCanMoveOnlyOneSquere();
		testIfPieceCanNotMoveMoreThenOneSquere();
		testIfDiagonalIsValid();
		testIfDiagonalIsFalse();
	}
}
