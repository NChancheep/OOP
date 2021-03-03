//Name: Chancheep Mahacharoensuk
//ID: u6288092
//Section 1
import java.util.ArrayList;
import java.util.Collections;
public class FullBinaryTreeTester 
{
	
	public static void inOrderTraverse(Node root)
	{
		//YOUR CODE GOES HERE
		if (root != null) 
		{
		      inOrderTraverse(root.left);
		      System.out.print(root.id + " ");
		      inOrderTraverse(root.right);
		}
	}
	
	public static boolean isFullBinTree(Node root)
	{	//YOUR CODE GOES HERE
		if(root==null)
		{
			return true;
		}
		if(root.left == null && root.right ==  null)
		{
			return true;
		}
		if(root.left != null &&root.right != null)
		{
			return isFullBinTree(root.left) && isFullBinTree(root.right); 
		}
		return false;
	}
	
	public static void normalTester()
	{
		Node[] ts = new Node[7];
		int count = 0;
		ts[count++] = null;
		ts[count++] = new Node(16, null, null);
		
		ts[count++] = new Node(16, new Node(14, null, null), null);
		
		ts[count++] = new Node(1, new Node(3, new Node(6, null, null), new Node(7, null, null)), 
				new Node(4, new Node(8, null, null), new Node(10, null, null)));
		
		ts[count++] = new Node(1, new Node(3, null, null), 
				new Node(4, new Node(8, null, null), new Node(10, null, null)));
		
		ts[count++] = new Node(1, new Node(3, new Node(6, null, null), null), 
				new Node(4, new Node(8, null, null), new Node(10, null, null)));
		
		ts[count++] = new Node(1, new Node(3, new Node(6, null, null), new Node(7, null, null)), 
				null);
		
		for(int i = 0; i < ts.length; i++)
		{
			System.out.print("[T"+i+"] in-order: ");
			inOrderTraverse(ts[i]);
			System.out.println("\n[T"+i+"] is"+(isFullBinTree(ts[i])?" ":" NOT ")+"a full binary tree.\n");
		}
		
	}
	
	
	/**************BONUS STARTS***************/
	public static void printBinTree(Node root)
	{	//YOUR BONUS CODE GOES HERE
		  if (root != null) 
		  {
		      if (root.left != null && root.right != null) 
		      {
		        System.out.println("  " + root.id);
		        if (root.left!=null)
		        {
		        	System.out.print(" /");
		        }
		        if(root.right!=null) 
		        {
		        	System.out.print(" \\");
		        	System.out.print("\n");
		        }
		        if(root.left!=null) 
		        {
		        	System.out.print(root.left.id);
		        }
		        else 
		        {
		        	System.out.print(" ");
		        }
		        System.out.print("   ");
		        if(root.right!=null)
		        {
		        	System.out.print(root.right.id);
		        }
		        else 
		        {
		        	System.out.print(" ");
		        }
		        System.out.println("\n");
		        printBinTree(root.left);
		        printBinTree(root.right);
		      }
		    }
	}
		  static ArrayList<Integer> t = new ArrayList<Integer>();
		  public static void binToArr(Node node) 
		  {
		    if (node != null) 
		    {
		      if(node.left != null)
		      {
		        binToArr(node.left);
		      }
		      t.add(node.id);
		      if(node.right != null)
		      {
		        binToArr(node.right);
		      }
		    }
		  }
		  public static Node createBinT(int start, int end) 
		  {
		    if (start > end) 
		    {
		    	return null;
		    }
		    int middle = (start + end) / 2;
		    Node node = new Node(t.get(middle), createBinT(start, middle - 1), createBinT(middle + 1, end));
		    return node;
		  }

		  public static Node getBinSearchTree(Node root)
		  {
		    binToArr(root);
		    Collections.sort(t);
		    return createBinT(0, t.size() - 1);
		  }
	public static void bonusTester()
	{
		Node t = new Node(1, new Node(3, new Node(6, null, null), new Node(7, null, null)), 
				new Node(4, new Node(8, null, null), new Node(10, null, null)));
		System.out.println("Before Transforming: ");
		printBinTree(t);
		System.out.println("After Transforming: ");
		printBinTree(getBinSearchTree(t));
		
	}
	/**************BONUS ENDS***************/
	
	
	
	public static void main(String[] args)
	{
		normalTester();
		
		//Uncomment for bonus
		bonusTester();
	}
}
