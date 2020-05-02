public class bst {
private class Node{
	int data;
	Node left;
	Node right;
	 
}
private Node root;
bst(int a[])
{
	this.root=construct(a,0,a.length-1);
}
private Node construct(int a[],int lo,int hi)
{
	if(lo>hi)
		return null;
	int mid=(lo+hi)/2;
	 
	Node nn=new Node();
	nn.data=a[mid];
	nn.left=construct(a,lo,mid-1);
    nn.right=construct(a,mid+1,hi);
    return nn;
}
