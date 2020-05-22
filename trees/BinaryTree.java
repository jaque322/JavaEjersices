package trees;

public class BinaryTree {


    Node root;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    Node nodeToAdd;

    public int getCounter() {
        return counter;
    }

    private int counter = -1;

    public void add(int data) {

        nodeToAdd = new Node(data);
        if (root == null) {
            root = nodeToAdd;
        }
        //if data<node traverse left child, else traverse right chilld until we get to a node that we can traverse... insert a new node
        Node traversingNode = root;

        traverseAndAddNode(traversingNode, nodeToAdd);
    }

    public Node search(Node root, Node node) {
        Node nodeToTraverse = root;
        if (nodeToTraverse == null || node.data == nodeToTraverse.data) {
            return nodeToTraverse;
        }
        else if(node.data<nodeToTraverse.data){
          return   search(nodeToTraverse.leftChild,node);

        }else
        {
            return   search(nodeToTraverse.rightChild,node);
        }

    }

    public boolean deleteNodeTree(Node root, Node nodeToDelete) {
        if (root == null) {
            return false;

        }

        return true;
    }

    private void traverseAndAddNode(Node node, Node nodeToAdd) {
        if (nodeToAdd.data < node.data) {
            if (node.leftChild == null) {
                node.leftChild = nodeToAdd;

            } else {

                traverseAndAddNode(node.leftChild, nodeToAdd);
            }
        } else if (nodeToAdd.data > node.data) {


            if (node.rightChild == null) {
                node.rightChild = nodeToAdd;

            } else {

                traverseAndAddNode(node.rightChild, nodeToAdd);
            }


        }

    }

    public void traverseInOrder(Node node) {
        Node newRoot;
        newRoot = node;

        if (newRoot == null) {
            return;

        }
        traverseInOrder(newRoot.leftChild);
        System.out.println(newRoot.data);
        traverseInOrder(newRoot.rightChild);
        if (newRoot != null) {

            count();
        }
    }

    public int count() {

        ++counter;

        return counter;

    }


}


//
//        if(i == 0) ... //if i = 0 this will work and skip following statement
//        else if(i == 1) ...//if i not equal to 0 and if i = 1 this will work and skip following statement
//        else if(i == 2) ...// if i not equal to 0 or 1 and if i = 2 the statement will execute
//
//
//        if(i == 0) ...//if i = 0 this will work and check the following conditions also
//        if(i == 1) ...//regardless of the i == 0 check, this if condition is checked
//        if(i == 2) ...//regardless of the i == 0 and i == 1 check, this if condition is checked

