import java.util.*;

public class AL_25638 {
    static int[] colors;
    static int sum = 0;

    static void qDFS(int start, int nodeIndex, int[][] graph, boolean[] visit, int u, boolean uTrig) {
        visit[nodeIndex-1] = true;
        boolean subTrig = false;
//
//        if(uTrig) {
//            subTrig = true;
//        }

        for(int i=0; i<graph[nodeIndex-1].length; i++) {
            if(!visit[i] && graph[nodeIndex-1][i]==1) {
                boolean[] visitClone = visit.clone();
//                if(i == u-1) {
//                    uTrig = true;
//                }
//                subTrig = uTrig;
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
//                qDFS(start, i+1, graph, visitClone, u, subTrig);
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        int gCount = sc.nextInt();
        int gCount = 5;

        colors = new int[gCount];

        boolean[] visit = new boolean[gCount];

//        for(int i=0; i<gCount; i++) {
//            colors[i] = sc.nextInt();
//        }

        colors = new int[]{1, 1, 1, 0, 0};

        int[][] map = new int[gCount][gCount];

        for(int i=0; i<gCount; i++) {
            Arrays.fill(map[i], 0);
        }

//        for(int i=0; i<gCount-1; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            map[x][y] = 1;
//            map[y][x] = 1;
//        }

//        int qCount = sc.nextInt();

//        int[] querys = new int[qCount];

//        for(int i=0; i<qCount; i++) {
//            querys[i] = sc.nextInt();
//        }

        map[0][2] = 1;
        map[2][0] = 1;
        map[2][1] = 1;
        map[1][2] = 1;
        map[2][3] = 1;
        map[3][2] = 1;
        map[2][4] = 1;
        map[4][2] = 1;

        qDFS(1,1, map, visit,3,false);

        System.out.println(sum);
    }
}
