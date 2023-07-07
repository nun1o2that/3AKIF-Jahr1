
// Adaptiere deine eigene Listenklasse MyListElement so, dass sie das Interface MyList implementiert. Zeichne zuerst das UML-Diagramm. Die Methoden des Interfaces lauten:
//     void add(int value)
//     void add(int value, int index)
//     int get(int index)
//     int remove(int index)
//     int size()

public interface MyList {

    public void add(int value);

    public void add(int value, int index);

    public int get(int index);

    public int remove(int index);

    public int size();
    
}