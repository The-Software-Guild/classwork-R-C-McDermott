package com.assigment1.matrix;

public class Main {

	public static void main(String[] args) {
		Matrix m1 = new Matrix(3, 3);
		Matrix m2 = new Matrix(3, 3);
		
		m1.calculateSumOfMatrix();
		m2.calculateSumOfMatrix();
		
		System.out.println("Matrix 1 elements: ");
		for (int i = 0; i < m1.getDimX(); i++) {
			for (int j = 0; j < m1.getDimY(); j++) {
				System.out.print(m1.getMatrix()[i][j] + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("Matrix 2 elements: ");
		for (int i = 0; i < m2.getDimX(); i++) {
			for (int j = 0; j < m2.getDimY(); j++) {
				System.out.print(m2.getMatrix()[i][j] + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("~~~~~~~~~~~~~~~~");
		System.out.println("Sum of matrix 1: " + m1.getSumOfMatrix());
		System.out.println("Sum of matrix 2: " + m2.getSumOfMatrix());
		System.out.println("Combined sum of matrix 1 & 2: " + (m1.getSumOfMatrix() + m2.getSumOfMatrix()));

	}

}
