import java.util.*;

public class AL_25638_err {

    public static class Node {
        Integer vertex;

        public Node(Integer vertex) {
            this.vertex = vertex;
        }
    }

    public static void queryFunc(Map<Integer, ArrayList<Node>> map, Integer start, Integer u, int[] colors) {
        Queue<Node> q = new LinkedList<>();

        Node qNode;
        ArrayList<Node> nodeList;

        boolean uTrig = false;

        int sum = 0;

        boolean[] visit = new boolean[colors.length];

        visit[start-1] = true;
        q.add(new Node(start));


        while (q.isEmpty()) {
            qNode = q.poll();
            if(visit[qNode.vertex]) {
                continue;
            }
            nodeList = map.get(qNode.vertex);

            for(Node searchNode : nodeList) {

            }
        }
    }


    public static void main(String[] args) {
        Map<Integer, ArrayList<Node>> map = new HashMap<>();

        ArrayList<ArrayList<Node>> graphs = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int gCount = sc.nextInt();

        for(int i=0; i<gCount; i++) {
            graphs.add(new ArrayList<>());
        }

        int[] colors = new int[gCount];

        boolean[] visit = new boolean[gCount];

        for(int i=0; i<gCount; i++) {
            colors[i] = sc.nextInt();
        }

        for(int i=0; i<gCount-1; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            graphs.get(from).add(new Node(to));
            graphs.get(to).add(new Node(from));
        }

        int qCount = sc.nextInt();

        int[] querys = new int[qCount];

        for(int i=0; i<qCount; i++) {
            querys[i] = sc.nextInt();
        }

        for(int i=0; i<gCount-1; i++) {
            map.put(i+1, graphs.get(i+1));
        }


        int a = 0;
        int b = 1;

        boolean c = (b != 0);

    }
}
