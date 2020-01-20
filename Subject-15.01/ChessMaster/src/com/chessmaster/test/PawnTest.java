package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.*;

public class PawnTest {
	public static void testIfPieceCanMoveOnlyOneSquere() {
		System.err.println("TestPawn:");
		Pawn testElementPawn = new Pawn(PieceColor.WHITE, 8, 0);
		boolean isValid=testElementPawn.isMoveActionValidForPawn(7, 0);
		String testMessage = (isValid)? "Valid":"False";	
		System.out.println(testMessage);		
	}
	public static void testIfPieceCanNotMoveMoreThenOneSquere() {
		Pawn testElementPawn = new Pawn(PieceColor.WHITE, 8, 0);
		boolean isValid = testElementPawn.isMoveActionValidForPawn(8, 1);
		String testMessage = (isValid)? "Valid":"False";
		System.out.println(testMessage);		
	}
	public static void runPawn() {
		testIfPieceCanMoveOnlyOneSquere();
		testIfPieceCanNotMoveMoreThenOneSquere();
	}
}
