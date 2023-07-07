import java.util.ArrayList;

public class MyNode {

    private Integer number;
    private ArrayList<MyNode> children;
    
    public MyNode() {
        this.children = new ArrayList<MyNode>();
    }
    
    public MyNode(final int number) {
        this.children = new ArrayList<MyNode>();
        this.number = number;
    }

    // zusaetlziches if-statement, weil sonst:
    // java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "this.number" is null
    public void add(final int number) {
        if (this.number == null) {
            this.number = number;
        }
        else {
            this.children.add(new MyNode(number));
        }
    }
    
    public void add(final MyNode node) {
        this.children.add(node);
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public ArrayList<MyNode> getChildren() {
        return this.children;
    }

}