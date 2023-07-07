import java.util.Queue;
import java.util.LinkedList;

public class Breitensuche {

    // queue ist ein interface, dass nicht direkt instanziert werden kann -> stattdessen z.b LinkedList
    private static Queue<MyNode> queue = new LinkedList<MyNode>();    
    
    public static MyNode bfs(MyNode start, int goal) {
        queue.add(start);
        boolean found = false;

        while (!queue.isEmpty()) {
            start = queue.remove();
            // System.out.println(start.getNumber());
            if (start.getNumber() == goal) {
                found = true;
                break;
            }

            for (MyNode child : start.getChildren()) {
                queue.add(child);
            }
        }
        if (found) {
            return start;
        }
        else {
            return new MyNode(0); // "return null" bringt in der main unten fehler 
        }
    }

    public static void main ( String[] args  ) {

        MyNode node = new MyNode();
        int numberToSearchFor = 5;
        int foundValue = 0;

        //            1
        //        /   |   \
        //      2     3     4
        //    /     /   \     \
        //   5     6     7     8
        //   |     |
        //   9    10

        node.add(1);

        node.add(2);
        node.getChildren().get(0).add(5);
        node.getChildren().get(0).getChildren().get(0).add(9);

        node.add(3);
        node.getChildren().get(1).add(6);
        node.getChildren().get(1).getChildren().get(0).add(10);
        node.getChildren().get(1).add(7);

        node.add(4);
        node.getChildren().get(2).add(8);

        foundValue = bfs(node, numberToSearchFor).getNumber();
        System.out.println("\n***** Breitensuche *****");
        System.out.println("numberToSearchFor: " + numberToSearchFor);
        System.out.println( (foundValue == 0) ? "Wert nicht gefunden!" : "bfs(node, numberToSearchFor).getNumber(): " + foundValue );

    }

}