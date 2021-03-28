package DataStructure.Tree.HuffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTreeTest {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 29, 5, 11, 23, 14 };
		createHuffmanTree(arr);
	}

	public static HuffmanNode createHuffmanTree(int[] arr) {
		List<HuffmanNode> nodes = new ArrayList<>();
		for (int value : arr) {
			nodes.add(new HuffmanNode(value));
		}

		while (nodes.size() > 1) {
			Collections.sort(nodes);
			HuffmanNode left = nodes.get(nodes.size() - 1);
			HuffmanNode right = nodes.get(nodes.size() - 2);
			HuffmanNode parent = new HuffmanNode(left.value + right.value);
			nodes.remove(left);
			nodes.remove(right);
			nodes.add(parent);
		}
		System.out.println(nodes);
		return nodes.get(0);

	}
}
