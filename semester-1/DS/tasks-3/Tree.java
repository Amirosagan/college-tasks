
class Node {
  int val;
  Node left;
  Node right;

  Node() {
    this.val = 0;
    left = right = null;
  }

  Node(int value) {
    this.val = value;
    left = right = null;
  }

}

public class Tree {

  Node root;

  Tree() {
    root = null;
  }

  private void inorder(Node node) {
    if (node == null)
      return;

    inorder(node.left);

    System.out.print(node.val + ", ");

    inorder(node.right);
  }

  private void preorder(Node node) {
    if (node == null)
      return;

    System.out.print(node.val + ", ");

    preorder(node.left);

    preorder(node.right);
  }

  private void postorder(Node node) {
    if (node == null)
      return;
    postorder(node.left);

    postorder(node.right);

    System.out.print(node.val + ", ");
  }

  public void deleteNode(int value, Node node) {
    if (node == null)
      return;
    if (node.val == value) {
      node = null;
      return;
    }

    deleteNode(value, node.left);

    deleteNode(value, node.right);

  }

  public void inorder() {
    this.inorder(root);
  }

  public void preorder() {
    this.preorder(root);
  }

  public void postorder() {
    this.postorder(root);
  }

  public void deleteNode(int value) {
    this.deleteNode(value, root);
  }

  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    tree.inorder();
    System.out.println();
    tree.preorder();
    System.out.println();
    tree.postorder();
  }

}
