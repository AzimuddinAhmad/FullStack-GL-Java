package com.greatlearning.lca;

import com.greatlearning.lca.LeastCommonAncestor.Node;

public class LeastCommonAncestorDriver {
	public static void main( String args[] ) {
		LeastCommonAncestor tree = new LeastCommonAncestor();
		
		// root
		tree.root = new Node( 10 );
		
		// level 1
		tree.root.left = new Node( 20 );
		tree.root.right = new Node( 30 );
		
		// level 2
		tree.root.left.left = new Node( 40 );
		tree.root.left.right = new Node( 50 );
		tree.root.right.left = new Node( 60 );
		tree.root.right.right = new Node( 70 );
		
		// level 3 (children of 50)
		tree.root.left.right.left = new Node( 80 );
		tree.root.left.right.right = new Node( 90 );
		
		int lca = tree.findLCA( 40, 90 ); // should give 20
		System.out.println( "lca( 40, 90 ) = " + lca );
		
		lca = tree.findLCA( 40, 100 ); // should give -1
		System.out.println( "lca( 40, 100 ) = " + lca );
	}
}