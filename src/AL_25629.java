import java.util.*;

public class AL_25629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] list = new int[count];

        int even = 0;

        int ans = 1;

        for(int i = 0; i < count; i++) {
            list[i] = sc.nextInt();
        }

        for(int i = 0; i < count; i++) {
            if(list[i]%2 == 0) {
                even++;
            }
        }

        if(even > count/2) {
            ans = 0;
        }

        System.out.println(ans);
    }

}
