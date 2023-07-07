import java.util.Stack;

public class Tiefensuche {

    private static Stack<MyNode> stack = new Stack<MyNode>();

    public static MyNode dfs(MyNode start, int goal) {
        if (start.getNumber() == goal) {
            return start;
        }
        else {
            for (MyNode child : start.getChildren()) {
                stack.push(child);
            }
            while (!stack.empty()) {
                start = stack.pop();
                // System.out.println(start.getNumber());
                return dfs(start, goal);
            }
            return new MyNode(0); // "return null" bringt in der main unten fehler 
        }
    }

    public static void main ( String[] args ) {

        MyNode node = new MyNode();
        int numberToSearchFor = 8;
        int foundValue = 0;

        //            1
        //        /   |   \
        //      2     5     9
        //    /     /   \     \
        //   3     6     8    10
        //   |     |
        //   4     7

        node.add(1);

        node.add(2);
        node.getChildren().get(0).add(3);
        node.getChildren().get(0).getChildren().get(0).add(4);

        node.add(5);
        node.getChildren().get(1).add(6);
        node.getChildren().get(1).getChildren().get(0).add(7);
        node.getChildren().get(1).add(8);

        node.add(9);
        node.getChildren().get(2).add(10);

        foundValue = dfs(node, numberToSearchFor).getNumber();
        System.out.println("\n***** Tiefensuche *****");
        System.out.println("numberToSearchFor: " + numberToSearchFor);
        System.out.println( (foundValue == 0) ? "Wert nicht gefunden!" : "dfs(node, numberToSearchFor).getNumber(): " + foundValue );

    }

}