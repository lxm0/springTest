package niuke.offer;

public class LinkNode {
    int value;
    LinkNode next;

    public LinkNode(int value, LinkNode next) {
        this.value = value;
        this.next = next;
    }
    public LinkNode(){}
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
