package com.assigment1.matrix;

import java.util.Random;

public class Matrix {
	private int dimX;
	private int dimY;
	private int[][] matrix;
	private int sumOfMatrix;
	
	public Matrix(int dimX, int dimY) {
		this.dimX = dimX;
		this.dimY = dimY;
		this.matrix = new int[dimX][dimY];
		Random rand = new Random();
		for (int i = 0; i < dimX; i++) {
			for (int j = 0; j < dimY; j++) {
				this.matrix[i][j] = rand.nextInt(10);
			}
		}
	}

	public int getDimX() {
		return dimX;
	}

	public int getDimY() {
		return dimY;
	}

	public int getSumOfMatrix() {
		return sumOfMatrix;
	}

	public void calculateSumOfMatrix() {
		int matrixSum = 0;
		for (int i = 0; i < dimX; i++) {
			for (int j = 0; j < dimY; j++) {
				matrixSum += this.matrix[i][j];
			}
		}
		this.sumOfMatrix = matrixSum;
	}

	public int[][] getMatrix() {
		return matrix;
	}
	
	public Matrix addMatrices(Matrix m2) {
		Matrix sumMatrices = new Matrix(this.dimX, this.dimY);
		for (int i = 0; i < dimX; i++) {
			for (int j = 0; j < dimY; j++) {
				sumMatrices.matrix[i][j] = this.matrix[i][j] + m2.matrix[i][j];
			}
		}
		return sumMatrices;
	}
	
	
}
