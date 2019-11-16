package com.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/* ************Question********************
        * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
        For example:
        Given binary tree [3,9,20,null,null,15,7],
        3
        / \
        9  20
        /  \
        15   7
        return its level order traversal as:
        [
        [3],
        [9,20],
        [15,7]
        ]
        ************Solution********************
        Intuition behind solution:
        Create a queue and add the root to the queue.
        While the queue is not empty process all the nodes in the queue.
        At every iteration of the queue not being empty, get the size of the queue (this represents
        however many nodes are on the current level of the tree).
        Iterate through all these nodes with a for loop, adding their values to a "current level" list.
        After adding their value to the list, check if they have left and right children adding them to the queue is they do exist (
        this allows us to process the next level of the tree on the next iteration of our while loop).
        Once our for loop terminates we have populated a list of all the nodes'
        values on the current level and we add this list to our return value (a list of lists).
        Once our while loop ends we have processed all the levels of the true and therefore return our result (our list of lists).

Queue.add() --> It will add the element to the tail of the queue
Queue.remove() ---> It will removes and returns the head of the queue
1. Create a two classes Tree Node (tree structure) and BST (used to traverse the tree)
2. Tree NOde consists of val, left, right fields.
3. Set the values for Tree Node object val, left, right
4. In BST create a method which takes the treenode object as the parameter (object is in tree structre)
5. create the nested result array list in which list within the list can be used to return the level order traversal of binary tree.
6. Check if the treenode obj is null return the empty result list.
7.Create the <treenode> queue as linked list and add the treenode obj to it.
8. Check it in whether the queue is not empty.
9. Get the size of the queue, create a new array list for current level and loop the queue based on the size of the queue.
10. Remove the element from the queue using queue.remove (it follows FIFO to delete each element) then add that element to currentlevel list.
*/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val=x;
    }
}

public class BST {

    public static  List<List<Integer>> levelofOrder(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        if(root==null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currentlevel = new ArrayList<>();
            for(int i=0;i<size;i++) {

                TreeNode current = queue.remove();
                currentlevel.add(current.val);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                }
                result.add(currentlevel);



        }
        return result;
    }

    public static void main(String[] args) {

        TreeNode root= new TreeNode(3);
        root.left = new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(levelofOrder(root));
    }
}
