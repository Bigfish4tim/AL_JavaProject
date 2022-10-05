import java.util.*;

public class AL_25632 {

    static ArrayList<Integer> prime(int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();

        int[] num = new int[m+1];

        for(int i=2; i<=m; i++) {
            num[i] = i;
        }

        for(int i=2; i<=m; i++) {
            if(num[i] == 0) continue;

            for(int j=2*i; j<=m; j+=i) {
                num[j] = 0;
            }
        }

        for (int j : num) {
            if (j >= n) {
                ans.add(j);
            }
        }

//        for(int i=0; i<num.length; i++) {
//            if(num[i] > n) {
//                ans.add(num[i]);
//            }
//        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yt1 = sc.nextInt();
        int yt2 = sc.nextInt();

        int yj1 = sc.nextInt();
        int yj2 = sc.nextInt();

        ArrayList<Integer> ytlist = prime(yt1, yt2);
        ArrayList<Integer> yjlist = prime(yj1, yj2);

        ArrayList<Integer> same = new ArrayList<>();

        for (Integer integer : ytlist) {
            if (yjlist.contains(integer)) {
                same.add(integer);
            }
        }
        for (Integer integer : same) {
            ytlist.remove(integer);
            yjlist.remove(integer);
        }

        String ans;

        while(true) {
            // yt turn
            if(!same.isEmpty()) {
                same.remove(0);
            } else {
                if(ytlist.isEmpty()) {
                    ans = "yj";
                    break;
                } else {
                    ytlist.remove(0);
                }
            }

            //yj turn
            if(!same.isEmpty()) {
                same.remove(0);
            } else {
                if(yjlist.isEmpty()) {
                    ans = "yt";
                    break;
                } else {
                    yjlist.remove(0);
                }
            }
        }

        System.out.println(ans);
    }
}
