package com.ctci.arrayandstring;

import java.util.Arrays;

public class ZeroMatrxiFlag {

	public static void main(String[] args) {

		int[][] inputMatrix = { { 1, 0, 3 }, { 4, 5, 0 }, {7, 8, 9} };

		System.out.println("Input Matrix : ");

		for (int[] rowsValInput : inputMatrix) {

			System.out.println(Arrays.toString(rowsValInput));
		}
		
		setZerosElements(inputMatrix);
		
		System.out.println("Output Matrix : ");
		for (int[] rowsValInput : inputMatrix) {

			System.out.println(Arrays.toString(rowsValInput));
		}

	}

	private static void setZerosElements(int[][] inputMatrix) {

		boolean[] rowFlag = new boolean[inputMatrix.length]; 
		boolean[] columnFlag = new boolean[inputMatrix[0].length];
		
		for (int i = 0; i < inputMatrix.length ; i ++){
			
			for (int j=0; j< inputMatrix[0].length ; j++){
				
				if (inputMatrix[i][j] == 0){
					
					rowFlag[i] = true; // update the row flag to true to indicate the zero element
					columnFlag[j] = true; // update the column flag to true to indicate the zero element
				}
			}
			
		}
		
		System.out.println("Row Flag : " + Arrays.toString(rowFlag));
		System.out.println("Column Flag : " + Arrays.toString(columnFlag));
		
		//nullify row elements
		
		for (int k = 0 ; k < rowFlag.length ; k++){
			
			if (rowFlag[k]){ // get the row index of zero elements
				
				setAllRowsZero(k, inputMatrix);
			}
		}
		
		//nullify columns
		
		for (int p =0 ; p < columnFlag.length ;  p++){
			
			if (columnFlag[p]){ // get the column index of zero elements
				
				setAllColumnsZero(p, inputMatrix);
			}
			
		}
		
		
	}

	private static void setAllColumnsZero(int columnIndex, int[][] inputMatrix) {

		for (int n=0 ; n < inputMatrix.length ; n++){ // iterate over the all rows to make all elements for that fixed columnIndex as zero.
			
			inputMatrix[n][columnIndex] =0;
		}
		
	}

	private static void setAllRowsZero(int rowIndex, int[][] inputMatrix) {

		for (int m = 0 ; m < inputMatrix[0].length ; m++){ // iterate over the all columns to make all elements for that fixed rowIndex as zero.
			
			inputMatrix[rowIndex][m] =0;
			
		}
		
	}

	

}
