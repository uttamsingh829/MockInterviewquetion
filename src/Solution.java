

// Warning: Printing unwanted or ill-formatted data to output will cause the test…

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * num is number of cities in the state.
roadList is a list of roads where each road connects two cities.
 */
public class Solution{

	public static int[]  maxTollRevenue(int num, int[][] roadList)
	{
		int[]  answer = new int[100];
		// Write your code here
		
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// input for num
		int num = in.nextInt();
		
		// input for roadList
		int roadList_row = in.nextInt();
		int roadList_col = in.nextInt();
		int roadList[][] = new int[roadList_row][roadList_col];
		for(int idx = 0; idx < roadList_row; idx++)
		{
			for(int jdx = 0; jdx < roadList_col; jdx++)
			{
				roadList[idx][jdx] = in.nextInt();
			}
		}
		
		int[] result = maxTollRevenue(num, roadList);
		for(int idx = 0; idx < result.length - 1; idx++)
		{
			System.out.print(result[idx] + " ");
		}
		System.out.print(result[result.length - 1]);
	}
}

