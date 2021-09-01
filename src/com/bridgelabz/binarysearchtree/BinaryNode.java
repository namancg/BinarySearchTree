package com.bridgelabz.binarysearchtree;

public class BinaryNode<K extends Comparable<K>> {
	K key;
	BinaryNode<K> left, right;

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

}