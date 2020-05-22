package trees;

import org.junit.Test;


class BinaryTreeTest {
    @Test
    public static void main(String[] args) {

        BinaryTree arbol = new BinaryTree();
        arbol.add(1);
        arbol.add(7);
        arbol.add(6);
        arbol.add(4);
        arbol.add(5);

        arbol.traverseInOrder(arbol.root);
        arbol.search(arbol.root, new Node(6));

        if (arbol.search(arbol.root, new Node (6))==null){
            System.out.println(" no se encuentra el nodo");
        }else{
            System.out.println("Encontrado");
        }


    }
}