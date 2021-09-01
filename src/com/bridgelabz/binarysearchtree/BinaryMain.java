package com.bridgelabz.binarysearchtree;

public class BinaryMain {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree  = new BinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		System.out.println(binaryTree.size());
	}

}
