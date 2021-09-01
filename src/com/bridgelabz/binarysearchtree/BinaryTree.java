package com.bridgelabz.binarysearchtree;

public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;
	public void add(K key) {
		this.root=this.addRecursively(root,key);
	}
	private BinaryNode<K> addRecursively(BinaryNode<K> currentNode ,K key){
		if(currentNode==null) {
			return new BinaryNode<>(key);
		}
		int compare = key.compareTo(currentNode.key);
		if(compare==0) return currentNode;
		if(compare<0) {
			currentNode.left=addRecursively(currentNode.left, key);
		}
		else {
			currentNode.right=addRecursively(currentNode.right, key);
		}
		return currentNode;
	}
	public int size() {
		return sizeRecursively(root);
	}
	private int sizeRecursively(BinaryNode<K> current) {
		return (current==null)?0:1+this.sizeRecursively(current.left)+this.sizeRecursively(current.right);
	}
	public void search(K key) {
		if(searchRecursively(key,root)) {
			System.out.println("key found");
			return;
		}
		System.out.println("key not found");
		
	}
	private boolean searchRecursively(K key,BinaryNode<K> current) {
		if(current==null)
			return false;
		int compare = current.key.compareTo(key);
		if(compare==0) return true;
		else if(compare>0) {
			return searchRecursively(key, current.left);
		}
		else {
			return searchRecursively(key, current.right);
		}
		
	}
}