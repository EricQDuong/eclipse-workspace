
public class Tester {

	public static void main(String[] args) {
		//the first integer in the tree is used to create the object
		BST bstObj = new BST(50);
		bstObj.addNode(56);
		bstObj.addNode(52);
		bstObj.addNode(25);
		bstObj.addNode(74);
		bstObj.addNode(54);
		bstObj.traverseAndPrint(bstObj.rootNode);
	}

}
