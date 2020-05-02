//ADD A NODE
public void add(int item)
{
	add(item,this.root,null,false);
}
private void add(int item,Node n,Node parent,boolean ch)
{
	if(n==null)
	{
		Node nn=new Node();
		nn.data=item;
		if(ch)
			parent.left=nn;
		else
			parent.right=nn;
		return;
	}
	 if(n.data<=item)
		  add(item,n.right,n,false);
	 else
		 add(item,n.left,n,true);
}




//REMOVE A NODE
public void remove(int item)
 {
	 remove(item,this.root,null,false);
 }
private void remove(int item,Node n,Node parent,boolean lor)
 {
	 if(item>n.data)
		 remove(item,n.right,n,false);
	 else if(item<n.data)
		 remove(item,n.left,n,true);
	 else
	 {
		 if(n.right==null && n.left==null)
		 {
			 if(lor)
				 parent.left=null;
			 else
				 parent.right=null;
		 }
		 else if(n.right==null & n.left!=null)
		 {
			 if(lor)
				 parent.left=n.left;
			 else
				 parent.right=n.left;
		 }
		 else if(n.right!=null & n.left==null)
		 {
			 if(lor)
				 parent.left=n.right;
			 else
				 parent.right=n.right;
		 }
		 else
		 {
			 int data=max(n.left);
			 n.data=data;
			 remove(data,n.left,n,true);
		 }
	 }
 }
