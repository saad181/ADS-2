import java.util.Scanner;
import java.util.HashMap;
class Solution{
	//time complexity is O(logN) for both put() & get()
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		BST<Integer, Integer> bst = new BST<Integer, Integer>();
		for(int i =0;i<num;i++){
			int temp = Integer.parseInt(scan.nextLine());
			if(!bst.contains(temp)){
				bst.put(temp, 1);
			} else {
				bst.put(temp, bst.get(temp)+1);
			}
		}
		bst.display();
		}
}