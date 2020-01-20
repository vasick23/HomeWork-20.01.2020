package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.*;

public class BishopTest {
	public static void testIfDiagonalIsValid() {
		System.err.println("TestBishop:");
		Bishop testElementBishop = new Bishop(PieceColor.WHITE, 7, 8);
		boolean isValid=testElementBishop.isMoveDiagonalForBishop(8, 9);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void testIfDiagonalIsFalse() {
		Bishop testElementBishop = new Bishop(PieceColor.WHITE, 7, 8);
		boolean isValid=testElementBishop.isMoveDiagonalForBishop(5, 1);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void runBishop() {
		testIfDiagonalIsValid();
		testIfDiagonalIsFalse();
	}
}
