//		Assessment lab 3 find pair
package com.lab3.pairfind;
import java.util.HashSet;
public class FindPair {
	static class Node {
	int nodedata;
	Node leftNode, rightNode;
	} 
	static Node newNode (int nodeData)
{
	Node temp = new Node () ;
	temp.nodedata = nodeData;
	temp.leftNode = null;
	temp.rightNode = null;
	return temp;
	}	
	public Node insert(Node root, int key)
	{
	if (root == null)    			//  root id null
	return newNode (key) ;			//	 new nosw 40
	if (key<root.nodedata)			// root 40 and key 20
	root.leftNode = insert (root.leftNode,key) ;
	else root.rightNode = insert (root.rightNode,key) ;
	return root;
	}
	
public boolean findPairUtil (Node root, int sum, HashSet<Integer> set ) {
	if (root == null)
	return false;
	
if (findPairUtil(root.leftNode,sum,set))
	return true;

if (set.contains(sum-root.nodedata)) {
	System.out.println("The pair is found by Azim... (" + (sum-root.nodedata) + "," + root.nodedata + ")");
	return true;
	}
	else
	set.add(root.nodedata) ;
	return findPairUtil(root.rightNode,sum,set) ;
	}

public void findPairwiththingivensum (Node root, int sum)
	{
	HashSet<Integer> set = new HashSet <Integer> () ;

	if (!findPairUtil(root, sum, set))	
		System.out.println("Sorry! Pair does not exit :" + "\n") ;
	}
	public static void main(String[] args) {
	Node root = null;
	FindPair fp = new FindPair () ;
	
	root = fp.insert (root, 40) ;	// execyted
	root = fp.insert (root, 20) ;
	root = fp.insert (root, 60) ;
	root = fp.insert (root, 10) ;
	root = fp.insert (root, 30) ;
	root = fp.insert (root, 50) ;
	root = fp.insert (root, 70) ;

	// 	Please Enter sum value below.  
	int sum = 130 ;
	fp.findPairwiththingivensum (root,sum) ;
	}
}
