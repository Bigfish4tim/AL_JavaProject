import java.util.*;

public class AL_25638 {
    static int[] colors;
    static int sum = 0;

    static void qDFS(int start, int nodeIndex, int[][] graph, boolean[] visit, int u, boolean uTrig) {
        visit[nodeIndex-1] = true;
        boolean subTrig = false;

        for(int i=0; i<graph[nodeIndex-1].length; i++) {
            if(!visit[i] && graph[nodeIndex-1][i]==1) {
                boolean[] visitClone = visit.clone();

                if(uTrig) {
                    if(colors[start-1] != colors[i]) {
                        sum++;
                    }
                }
                if(uTrig) {
                    qDFS(start, i+1, graph, visitClone, u, true);
                } else {
                    qDFS(start, i+1, graph, visitClone, u, i == u - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gCount = sc.nextInt();

        colors = new int[gCount];

        boolean[] visit = new boolean[gCount];

        for(int i=0; i<gCount; i++) {
            colors[i] = sc.nextInt();
        }

        int[][] map = new int[gCount][gCount];

        for(int i=0; i<gCount; i++) {
            Arrays.fill(map[i], 0);
        }

        for(int i=0; i<gCount-1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            map[x-1][y-1] = 1;
            map[y-1][x-1] = 1;
        }

        int qCount = sc.nextInt();

        int[] querys = new int[qCount];

        for(int i=0; i<qCount; i++) {
            querys[i] = sc.nextInt();
        }

        for (int query : querys) {
            for (int j = 0; j < gCount; j++) {
                boolean[] visitClone = visit.clone();
                qDFS(j + 1, j + 1, map, visitClone, query, false);
            }
            System.out.println(sum/2);
            sum = 0;
        }
    }
}
