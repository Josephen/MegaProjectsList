package com.company;

public class Main {
    public static void main(String[] args) {
        Graph ob = new Graph(10);
        ob.addEdge(0, 2, 10);
        ob.addEdge(0,3, 12);
        ob.addEdge(4,2,16);
        ob.addEdge(7,2,13);
        ob.addEdge(8,2,26);
        System.out.println(ob);
    }
}
