import java.util.*;

public class AL_25643 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int size = sc.nextInt();

        String[] block = new String[count];

        for(int i = 0; i < count; i++) {
            block[i] = sc.next();
        }

        int ans = 1;

        int errCnt = 0;

        for(int i = 0; i < count-1; i++) {
            for(int j = 1; j <= size; j++) {

                String x = block[i].substring(0, j);
                String y = block[i+1].substring(size-j, size);

                String rx = block[i].substring(size-j,size);
                String ry = block[i+1].substring(0, j);

                if(!x.equals(y)) {
                    errCnt++;
                }
                if(!rx.equals(ry)) {
                    errCnt++;
                }
            }
            if(errCnt == 2*size) {
                ans = 0;
                break;
            }
        }
        System.out.println(ans);
    }
}
