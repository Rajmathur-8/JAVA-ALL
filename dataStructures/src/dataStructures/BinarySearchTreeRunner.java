package dataStructures;

public class BinarySearchTreeRunner {

	public static void main(String[] args) {
		BinarySearchTree myBST = new BinarySearchTree();

		myBST.rInsert(2);
		myBST.rInsert(1);
		myBST.rInsert(3);
//		myBST.rInsert(18);
//		myBST.rInsert(27);
//		myBST.rInsert(52);
//		myBST.rInsert(82);
//		// System.out.println(myBST.rContains(27));
		// System.out.println(myBST.rContains(17));
		System.out.println("\nRoot = " + myBST.root.value);
		System.out.println("\nRoot-> left: " + myBST.root.left.value);
		System.out.println("\nRoot-> right: " + myBST.root.right.value);

		// System.out.println(myBST.minValue(myBST.root));

		myBST.deleteNode(2);
		System.out.println("\nRoot = " + myBST.root.value);
		System.out.println("\nRoot-> left: " + myBST.root.left.value);
		System.out.println("\nRoot-> right: " + myBST.root.right);

	}

}
