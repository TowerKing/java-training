package towerking.geektime;

public class PalindromicNumber {

    public static void main(String[] args) {
        NodeList nodeList = new NodeList("abcdefghjklmn");
        NodeList.Node temp = nodeList.head;
        while (temp != null) {
            System.out.print(temp.letter);
            temp = temp.next;
        }

    }

}



class NodeList {
    Node head;

    public NodeList() {

    }

    public NodeList(String source) {
        this();

        if (source == null || source.length() == 0) {
            head = null;
            return;
        }

        for (char letter : source.toCharArray()) {
            addNode(letter);
        }
    }

    public void addNode(char letter) {
        Node newNode = new Node(letter);
        if (head == null) {
            head = newNode;
            return;
        }

        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;
    }

    class Node {
        char letter;
        Node next;

        Node(char letter) {
            this.letter = letter;
        }

        Node(char letter, Node next) {
            this.letter = letter;
            this.next = next;
        }

    }
}


