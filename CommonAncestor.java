package for_CTCI;

public class CommonAncestor {
	
	public class TreeNode<T> {
		T data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(){
			this.data = null;
			this.left = null;
			this.right = null;
		}
		
		TreeNode(T new_data){
			this.data = new_data;
		}
		
		TreeNode(T new_data, TreeNode lt, TreeNode rt){
			this.data = new_data;
			this.left = lt;
			this.right = rt;
		}
	}
	
	public class Result{
		public TreeNode node;
		public boolean isAncestor;
		Result(TreeNode n, boolean isAnc){
			node = n; 
			isAncestor = isAnc;
		}
	}
	
	public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		Result r = commonAncestorAux(root, p, q);
		if (r.isAncestor) {
			return r.node;
		} 
		return null;
	}
	
	public Result commonAncestorAux(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return new Result(null, false);
		}
		
		if (p == root && q == root) {
			return new Result(root, true);
		}
		
		Result rx = commonAncestorAux(root.left, p, q);
		if (rx.isAncestor) {
			return rx;
		}
		
		Result ry = commonAncestorAux(root.right, p, q);
		if (ry.isAncestor) {
			return ry;
		}
		
		if (rx.node != null && ry.node != null) {
			return new Result(root, true);
		} else if (root == p || root == q) {
			boolean isAncestor = rx.node != null || ry.node != null;
			return new Result(root, isAncestor);
		} else {
			return new Result(rx.node != null ? rx.node : ry.node, false);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}
