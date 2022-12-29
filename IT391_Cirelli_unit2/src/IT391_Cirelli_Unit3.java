
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;

public class IT391_Cirelli_Unit3 {

	private static final String HashSet = null;

	public static void main(String[] args) {
		// *********************************************************
		// ****Assignment 1, Part A, Section 1
		// *********************************************************
		System.out.printf("\n");
		System.out.printf("**********Assignment 3, Part A, Section 1**********\n");
		System.out.printf("\n");

		String[] professionNames = { "Software Engineer", "Programmer", "Database Admin", "Network Admin",
				"Web Developer", "Program Manager" };

		List<String> professionNameSet = Arrays.asList(professionNames);

		System.out.printf("Original List:\n");
		System.out.printf("[" + String.join(", ", professionNameSet) + "]\n\n");

		Collections.sort(professionNameSet);

		System.out.printf("Sorted List:\n");
		System.out.printf("[" + String.join(", ", professionNameSet) + "]\n\n");

		// *********************************************************
		// ****Assignment 3, Part A, Section 2
		// *********************************************************
		System.out.printf("\n");
		System.out.printf("**********Assignment 3, Part A, Section 2**********\n");
		System.out.printf("\n");

		String[] titles = { "To Kill a Mockingbird", "Huckleberry Finn", "Pride and Prejudice", "Brave New World",
				"Lord of the Flies", "Alice in Wonderland", "The Old Man and the Sea", "Atlas Shrugged" };

		LinkedList<String> titleList = new LinkedList<String>(Arrays.asList(titles));

		System.out.printf("Original Book List:\n");
		System.out.printf("[" + String.join(", ", titleList) + "]\n\n");

		titleList.sort(Comparator.naturalOrder());
		System.out.printf("Sorted Book List:\n");
		System.out.printf("[" + String.join(", ", titleList) + "]\n\n");

		titleList.remove(1);
		titleList.removeFirst();
		titleList.removeLast();

		System.out.printf("Book List After Deletions:\n");
		System.out.printf("[" + String.join(", ", titleList) + "]\n\n");
		System.out.printf("The number of items in my book list is:" + titleList.size() + "\n\n");

		if (titleList.contains("Brave New World")) {
			System.out.printf("Brave New World is in the list.\n");
		}

		// *********************************************************
		// ****Assignment 3, Part A, Section 3
		// *********************************************************

		System.out.printf("\n");
		System.out.printf("**********Assignment 3, Part A, Section 3**********\n");
		System.out.printf("\n");

		BinaryTree bt = new BinaryTree();
		bt.insert(50);
		bt.insert(30);
		bt.insert(45);
		bt.insert(12);
		bt.insert(29);

		System.out.printf("The contents of the binary tree are:\n");
		bt.inOrder(bt.root);

		// *********************************************************
		// ****Assignment 3, Part B, Section 1
		// *********************************************************
		System.out.printf("\n");
		System.out.printf("**********Assignment 3, Part B, Section 1**********\n");
		System.out.printf("\n");

		String[] mammals = new String[] { "Bear", "Gorilla", "Tiger", "Polar Bear", "Lion", "Monkey" };
		HashSet<String> setMammals = new HashSet<String>();
		System.out.printf("[" + String.join(", ", mammals) + "]\n\n");

		System.out.print("Original List: \n");

		System.out.print("Sorted List: ");

		SortedSet<String> sortedMammals = new TreeSet<String>(setMammals);

	}
}

class BinaryTree {

	public Node root;

	BinaryTree() {
		root = null;
	}

	static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}

		public void displayData() {
			System.out.print("Traversed " + value + "\n");
		}
	}

	public void insert(int i) {
		root = insert(root, i);
	}

	public Node insert(Node node, int value) {
		if (node == null) {
			return new Node(value);
		}

		if (value < node.value) {
			node.left = insert(node.left, value);
		}

		else if (value > node.value) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	public Node find(int searchedValue) {
		Node current = root;
		while (current.value != searchedValue) {
			if (searchedValue < current.value)

				current = current.left;
			else

				current = current.right;
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	public void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		node.displayData();
		inOrder(node.right);
	}

}