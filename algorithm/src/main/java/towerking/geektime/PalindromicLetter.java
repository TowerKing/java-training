package towerking.geektime;

public class PalindromicLetter {

    public static void main(String[] args) {
        System.out.println(isPalindromicNumber("a"));
        System.out.println(isPalindromicNumber("ab"));
        System.out.println(isPalindromicNumber("aa"));
        System.out.println(isPalindromicNumber("aba"));
        System.out.println(isPalindromicNumber("abc"));
        System.out.println(isPalindromicNumber("abba"));
        System.out.println(isPalindromicNumber("abcab"));
        System.out.println(isPalindromicNumber("abcba"));


    }

    private static boolean isPalindromicNumber(String source) {
        if (source == null || source.length() == 0) {
            System.out.println("这是一个空串");
            return false;
        }

        NodeList nodeList = new NodeList(source);
        NodeList.Node fast = nodeList.head;
        NodeList.Node slow = nodeList.head;

        NodeList preHalfNodeList = new NodeList();
        preHalfNodeList.addTailNode(slow.letter);
        while(true) {

            // 奇数链表
            if (fast.next == null) {
                break;
            }

            fast = fast.next.next;
            slow = slow.next;
            // 偶数链表
            if (fast == null) {
                break;
            }
            preHalfNodeList.addTailNode(slow.letter);


        }

        NodeList.Node preHalfNode = preHalfNodeList.head;
        while(slow != null) {

            if (slow.letter != preHalfNode.letter) {
                return false;
            }
            slow = slow.next;
            preHalfNode = preHalfNode.next;
        }



        return true;
    }

}



class NodeList {
    Node head;

    NodeList() {

    }

    NodeList(String source) {
        this();

        if (source == null || source.length() == 0) {
            head = null;
            return;
        }

        for (char letter : source.toCharArray()) {
            addNode(letter);
        }
    }

    void addNode(char letter) {
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

    void addTailNode(char letter) {
        Node newNode = new Node(letter);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    class Node {
        char letter;
        Node next;

        Node(char letter) {
            this.letter = letter;
        }

    }
}


