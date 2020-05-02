public void find(int data)
{
	find(data,this.root);
}
 private void find(int data,Node n)
{
	 if(n==null) {
		 System.out.println("not found");
		 return;}
	if(data==n.data)
		System.out.println("Found");
	else if(data>n.data)
		find(data,n.right);
	else
		find(data,n.left);
}

public int max()
 {
	 int m=max(this.root);
	 return m;
 }
 private int max(Node n)
 {
	 if(n.right==null)
		 return n.data;
	 return max(n.right);
 }
