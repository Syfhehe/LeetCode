package DataStructure.Tree.HuffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTreeTest {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 29, 5, 11, 23, 14 };
		createHuffmanTree(arr);
	}

	public static Node createHuffmanTree(int[] arr) {
		List<Node> nodes = new ArrayList<>();
		for (int value : arr) {
			nodes.add(new Node(value));
		}

		while (nodes.size() > 1) {
			Collections.sort(nodes);
			Node left = nodes.get(nodes.size() - 1);
			Node right = nodes.get(nodes.size() - 2);
			Node parent = new Node(left.value + right.value);
			nodes.remove(left);
			nodes.remove(right);
			nodes.add(parent);
		}
		System.out.println(nodes);
		return nodes.get(0);

	}
}
