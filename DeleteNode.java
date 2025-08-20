/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
// This solution has to be implemented with moving the value from the next node if available to the present and just pointing the next node to be next.next. As we do not have reference for the previous of given node, this is the only possible way to get around deleting the node
class Solution {
    public void deleteNode(Node del_node) {
        // code here
        if(del_node.next==null) {
            del_node=null;
            return;
        }
        del_node.data = del_node.next.data;
        del_node.next=del_node.next.next;
    }
}
