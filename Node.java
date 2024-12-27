import java.util.List;

public class Node {
    Integer value;
    Node left;
    Node right;

   public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public void setValue(int value) {

        if(this.value == value) {

            return;

        }

        if (this.value > value) {

            if (this.left != null) {
                
                this.left.setValue(value);

            } else {

                this.left = new Node(value);

            } 

        } else {

            if (this.right != null) {
                
                this.right.setValue(value);

            } else {

                this.right = new Node(value);

            } 
        }
        return;
    }


    public void recolectarValores(List<Integer> hojas) {
    
        if (this.left!=null) {

            this.left.recolectarValores(hojas);

        } 

        hojas.add(this.value);

        if (this.right!=null) {

            this.right.recolectarValores(hojas);

        } 

    }

    public boolean contienteValor(int value) {

        if (this.value == value) {

            return true;
        }

        if (value > this.value && this.left!=null && this.left.contienteValor(value)) {

            return true;
        }
        
        if (value < this.value && this.right!=null && this.right.contienteValor(value)) {

            return true;
        }

        return false;

    }
}



