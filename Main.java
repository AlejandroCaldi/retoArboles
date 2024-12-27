

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
        // BinaryTree bt = new BinaryTree();

        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // root.right.right.left = new Node(8);

        // List<Integer> hojas = new ArrayList<>();

        // List<Integer> leafNodes = bt.detectarHojas(root, hojas);

        // // Resultado para el primer caso. 
        // System.out.println("Hojas encontradas: " + leafNodes);

        // System.out.println("");
        // System.out.println("");
        // System.out.println("");
        // // Probamos con la segunda forma de armaar nodos. 

        // BinaryTree bt2 = new BinaryTree();

        // Node root2 = new Node(1);
        // for (int i = 0; i<=numeros.length-1; i++) {

        //     bt2.add(numeros[i]);
            
        // }

        // List<Integer> hojas2 = new ArrayList<>();
        // List<Integer> hojasEncontradas = bt2.detectarHojas(root2, hojas2);
        // System.out.println("Hojas encontradas en el segundo caso: " + hojasEncontradas);

        Integer[] numeros = {9,10,30,46,52,11,6,12,13,14,15,16,23,45,81};

        Node raiz = new Node(numeros[0]);

        for (int i = 1;i< numeros.length;i++) {
            raiz.setValue(numeros[i]);
        } 

        List<Integer> valores = new ArrayList<>();

        boolean respuesta = raiz.contienteValor(11);

        System.out.println(respuesta);

        System.out.println();

        raiz.recolectarValores(valores);

        valores.forEach(x -> System.out.print(x + ", "));
    }
}