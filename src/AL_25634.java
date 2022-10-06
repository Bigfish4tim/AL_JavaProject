import java.util.*;

public class AL_25634 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] ai = new int[count];
        int[] bi = new int[count];
        int[] ci;

        for(int i=0; i<count; i++) {
            ai[i] = sc.nextInt();
        }

        for(int i=0; i<count; i++) {
            bi[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;

        for(int i=0; i<count; i++) {
            ci = bi.clone();
            for(int j=i; j<count; j++) {
                if(bi[j] == 1) {
                    ci[j] = 0;
                } else {
                    ci[j] = 1;
                }
                for(int k=0; k<count; k++) {
                    sum = sum + ai[k]*ci[k];
                }
                if(sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }

        System.out.println(max);
    }
}
