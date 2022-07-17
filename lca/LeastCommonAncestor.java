package com.greatlearning.lca;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAncestor {
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		
		Node( int value ) {
			data = value;
			left = right = null;
		}
	}
	
	// after calling this method
	// we get true if the number is found (else false)
	// path will have the path to the found number n (10, 20, 50, 90)
	public boolean findPath( Node root, int n, List<Integer> path ) {
		// base case
		if( root == null ) {
			return false;
		}
		
		path.add( root.data );
		
		if( root.data == n ) {
			return true;
		}
		
		if( root.left != null && findPath( root.left, n, path ) ) {
			return true;
		}
		
		if( root.right != null && findPath( root.right, n, path ) ) {
			return true;
		}
		
		// the tree rooted at root node does not have the data. Therefore it should not be present in the path.
		path.remove( path.size() - 1 ); 
		
		return false;
	}
	
	// Assuming the tree has only positive number, we return -1 to indicate LCA does not exist
	public int findLCA( int n1, int n2 ) {
		List<Integer> path1 = new ArrayList<Integer>();
		List<Integer> path2 = new ArrayList<Integer>();
		
		// exit if n1 is not present
		if( !findPath( root, n1, path1 ) ) {
			System.out.println( n1 + " not present" );
			return -1;
		}
		
		// exit if n2 is not present
		if( !findPath( root, n2, path2 ) ) {
			System.out.println( n2 + " not present" );
			return -1;
		}
		
		// path1 will have path to n1 node, and path2 will have path to n2
		
		// loop through the path nodes one-by-one comparing them at each step. We stop when they are different.
		int i;
		// path1 (eg. 10, 20, 40) is different size from path2 (eg. 10, 20, 50, 90)
		// i will have the index of where path1 and path2 differ (eg. i = 2 for above example) 
		for( i = 0; i < path1.size() && i < path2.size(); i++ ) {
			if( !path1.get( i ).equals(path2.get( i ) ) ) {
				break;
			}
		}
		
		// return the value of the node, before the place the paths differed
		return path1.get( i - 1 );
	}
}