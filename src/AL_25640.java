import java.util.*;

public class AL_25640 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jinho = sc.next();

        int count = sc.nextInt();

        String[] mbti_list = new String[count];
        int samecount = 0;

        for(int i = 0; i < count; i++) {
            mbti_list[i] = sc.next();

            if(Objects.equals(mbti_list[i], jinho)) {
                samecount++;
            }
        }

        System.out.println(samecount);

    }
}
