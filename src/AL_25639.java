import java.util.*;

public class AL_25639 {

    static int max = 0;
    static int[] array;

    public static void QueryMaxOutput(int[][] querys) {
        for (int[] query : querys) {
            if(query[0] == 2) {
                max = 0;
                QueryMax(query);
                System.out.println(max);
            } else {
                array[query[1]-1] = query[2];
            }
        }
    }

    public static void QueryMax(int[] querys) {
        int qSize = querys[2] - querys[1];
        if(querys[0] == 2) {
            for(int i=0; i<qSize; i++) {
                for(int j=0; j<i; j++) {
                    int cal = array[querys[1]+i] - array[querys[1]+j];

                    if(cal > 0 && cal > max) {
                        max = cal;
                    }
                }
            }
        } else {
            array[querys[1]-1] = querys[2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        array = new int[count];

        for(int i=0; i<count; i++) {
            array[i] = sc.nextInt();
        }

        int qCount = sc.nextInt();

        int[][] querys = new int[qCount][3];

        for(int i=0; i<qCount; i++) {
            querys[i][0] = sc.nextInt();
            querys[i][1] = sc.nextInt();
            querys[i][2] = sc.nextInt();
        }

        QueryMaxOutput(querys);
    }
}
