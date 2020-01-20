package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Knight;

public class KnightTest {
	public static void testIfPieceCanMoveOnlyOneSquere() {
		System.err.println("TestKnight:");
		Knight testElementKnight = new Knight(PieceColor.WHITE, 5, 5);
		boolean isValid=testElementKnight.isMoveActionValidForKnight(3, 6);
		String testMessage = (isValid)? "Valid":"False";	
		System.out.println(testMessage);		
	}
	public static void testIfPieceCanNotMoveMoreThenOneSquere() {
		Knight testElementKnight = new Knight(PieceColor.WHITE, 5, 5);
		boolean isValid = testElementKnight.isMoveActionValidForKnight(6, 3);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void runKnight() {
		testIfPieceCanMoveOnlyOneSquere();
		testIfPieceCanNotMoveMoreThenOneSquere();
	}
}
