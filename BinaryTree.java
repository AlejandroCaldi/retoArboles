import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinaryTree {

    Node root;

    // Agerga un nodo recursivamente en función de los valores Int del mismo.
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        } // Esto en caso de que tenga que crear nodo raiz. 
        
        if (value == current.value) {
            return current;
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } 
    
        return current;
    }

    public void add(int value) {
 
        root = addRecursive(root, value);
    }

    public BinaryTree createBinaryTree(int[] numeros) {
        BinaryTree bt = new BinaryTree();
        
        for (int i = 0; i<=numeros.length-1;i++) {

            bt.add(numeros[i]);

        }
    
        return bt;
    }

    public List<Integer> detectarHojas(Node node, List<Integer> hojas) {

        if (node == null) {
            return hojas;
        }

        if (node.left == null && node.right == null) {
            System.out.println(node.value +"," + null + "," + null);
            hojas.add(node.value);
            return hojas;
        }

        String izquierda = "";
        String derecha = "";

        if (node.left == null) {

            izquierda = "null";
        } else {

            izquierda = node.left.value.toString();
        }


        if (node.right == null) {

            derecha = "null";
        } else {

            derecha = node.right.value.toString();
        }

        System.out.println(node.value + ":");
        System.out.println(izquierda + "," + derecha);
        System.out.println("");

        detectarHojas(node.left, hojas);
        detectarHojas(node.right, hojas);

        return hojas;
    }

    // Método inconveniente, precisa de todos los nodos previamente por conocidos y en un array List. 
    // Pero detecta el nodo root.
    public Node esteEsRoot(List<Node> nodes) {
        Set<Node> allNodes = new HashSet<>(nodes);
        Set<Node> childNodes = new HashSet<>();

        // Agrega todos los nodos que no son root
        for (Node node : nodes) {
            if (node.left != null) {
                childNodes.add(node.left);
            }
            if (node.right != null) {
                childNodes.add(node.right);
            }
        }

        // El nodo root va a ser el que no esté en la lista anterior. 
        for (Node node : allNodes) {
            if (!childNodes.contains(node)) {
                return node;
            }
        }

        return null; // Esto no debería pasar nunca. 
    }
}

