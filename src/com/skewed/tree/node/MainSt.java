package com.skewed.tree.node;
public class MainSt {
			BstNode node;
			BstNode prev = null;
			BstNode nHead = null;
void processBST(BstNode root)	{
	if(root == null)return;
			processBST(root.left);
			BstNode rightNode = root.right;			
	if(nHead == null)		{
			nHead = root;
			root.left = null;
			prev = root;	}
	else	{
			prev.right = root;
			root.left = null;
			prev = root;	}
			processBST(rightNode);		}
void traverse(BstNode root)	{
	if(root == null)return;
			System.out.print("    " + root.val +"") ;
			traverse(root.right);	}
public static void main(String[] args) {
	System.out.println("-=> Welcome to Great Learning <=-") ;			
	MainSt tree = new MainSt();
			tree.node = new BstNode(50);
			tree.node.left = new BstNode(30);
			tree.node.right = new BstNode(60);
			tree.node.left.left = new BstNode(10);
			tree.node.right.left= new BstNode(55);
			tree.processBST(tree.node);
			tree.traverse(tree.nHead);
	}
}