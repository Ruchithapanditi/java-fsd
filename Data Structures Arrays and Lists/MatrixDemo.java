package com;

public class MatrixDemo {
	public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) 
	     {
	        	int[][] result = new int[r1][c2];
	        	for(int i = 0; i < r1; i++) 
	                    {
	            			for (int j = 0; j < c2; j++) 
	                           {
	                			for (int k = 0; k < c1; k++) 
	                            {
	                    				result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
	                			}
	            			}
	       	       	}
	            return result;
	    }
	public static void displayProduct(int[][] result) 
	     {
	        	System.out.println("Product of two matrices is: ");
	        	for(int[] row : result) 
	                   {
	            			for (int column : row) 
	                        {
	                			System.out.print(column + "\t ");
	            			}
	            			System.out.println();
	        		}
	    	}


	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		int[][] mat1 = { {2,-1,7}, {0,4,3} };
		int[][] mat2 = { {5,9}, {-4,2}, {6,0} };
        int[][] result = multiplyMatrices(mat1, mat2, r1, c1, c2);
        displayProduct(result);



	}

}
