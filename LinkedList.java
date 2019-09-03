public class LinkedList<T> {
    public Node<T> root;
    public void setRoot(Node<T> root) {
        this.root = root;
    }
    public void addNodeWithData(T element){
        Node<T> newNode = new Node<>();
        newNode.setElement(element);
        newNode.setNext(null);
        if(root == null){
            root = newNode;
        }else{
            Node<T> n = root;
            while(n.getNext() != null){
                n = n.getNext();
            }
            n.setNext(newNode);
        }
    }
    public void addNode(Node<T> node){
        if(root == null){
            root = node;
        }else{
            Node<T> n = root;
            while(n.getNext() != null){
                n = n.getNext();
            }
            n.setNext(node);
        }
    }
    public void disp(){
        if(root == null){
            System.out.println(root.getElement());
        }else{
            Node<T> n = root;
            while(n != null){
                System.out.println(n.getElement());
                n = n.getNext();
            }
        }
    }
}
