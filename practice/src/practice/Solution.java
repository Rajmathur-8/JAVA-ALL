package practice;
import java.util.Scanner;

class Solution {
	public int[] countBits(int n) {

		int[] ans = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			int count = 0;
			while (i % 2 != 0) {
				count++;
				ans[i] = count;
			}
		}
		return ans;

	}

	public static void main(String[] args){
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
		for (int i = 0; i < n + 1; i++) {
			System.out.println(sol.countBits(n));
            }
        }
}