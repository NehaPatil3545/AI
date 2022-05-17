import java.util.*;
public class bfsdfs{
	static class Treenode{
		int data;
		Treenode left,right;
		public Treenode(int key){
			data=key;
			left=right=null;
		}
	}

	public static void bfs(Treenode root){
		Queue<Treenode> queue=new LinkedList<Treenode>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Treenode treenode=queue.poll();
			System.out.print(treenode.data+" ");
			if(treenode.left!=null){
				queue.add(treenode.left);
			}
			if(treenode.right!=null){
				queue.add(treenode.right);
			}
		}
	}
	public static void dfs(Treenode root){
		if(root==null)
			return;
		dfs(root.left);
		
		dfs(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String args[]){
		Treenode root=new Treenode(0);
		root.left=new Treenode(1);
		root.right=new Treenode(2);
		root.left.left=new Treenode(3);
		root.left.right=new Treenode(4);
		System.out.println("BFS Traversal:");
		bfs(root);
		System.out.println();
		System.out.println("DFS Traversal:");
		dfs(root);
		
	}
}