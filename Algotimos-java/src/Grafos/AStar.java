package Grafos;

import java.util.*;

/**
 * Algoritmo A* (A-Star)
 * Encontra o menor caminho em um grafo utilizando uma heurística (distância estimada até o objetivo).
 */

public class AStar {

    static class Node {
        String name;
        Map<Node, Integer> neighbors = new HashMap<>();
        int g; // custo do início até o nó
        int h; // heurística (estimativa até o fim)
        int f; // f = g + h
        Node parent;

        Node(String name) {
            this.name = name;
        }
    }

    public static List<Node> aStar(Node start, Node goal) {
        Set<Node> closedSet = new HashSet<>();
        Set<Node> openSet = new HashSet<>();
        openSet.add(start);

        start.g = 0;
        start.f = start.h;

        while (!openSet.isEmpty()) {
            Node current = openSet.stream().min(Comparator.comparingInt(n -> n.f)).get();

            if (current.equals(goal)) {
                return reconstructPath(current);
            }

            openSet.remove(current);
            closedSet.add(current);

            for (Map.Entry<Node, Integer> entry : current.neighbors.entrySet()) {
                Node neighbor = entry.getKey();
                int cost = entry.getValue();

                if (closedSet.contains(neighbor)) continue;

                int tentativeG = current.g + cost;

                if (!openSet.contains(neighbor) || tentativeG < neighbor.g) {
                    neighbor.parent = current;
                    neighbor.g = tentativeG;
                    neighbor.f = neighbor.g + neighbor.h;
                    openSet.add(neighbor);
                }
            }
        }
        return Collections.emptyList();
    }

    private static List<Node> reconstructPath(Node current) {
        List<Node> path = new ArrayList<>();
        while (current != null) {
            path.add(current);
            current = current.parent;
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        // Definição das conexões
        a.neighbors.put(b, 1);
        a.neighbors.put(c, 4);
        b.neighbors.put(d, 2);
        c.neighbors.put(e, 5);
        d.neighbors.put(e, 1);

        // Heurística (estimativa de custo até o objetivo)
        a.h = 7;
        b.h = 6;
        c.h = 2;
        d.h = 1;
        e.h = 0;

        List<Node> path = aStar(a, e);
        System.out.print("Caminho encontrado: ");
        for (Node n : path) System.out.print(n.name + " ");
    }
}
