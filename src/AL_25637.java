import java.util.*;

public class AL_25637 {

    public static class Node<Integer> {
        public Integer pCount;
        public Node<Integer> rlink;
        public Node<Integer> llink;

        public Node(Integer pCount, Node<Integer> rlink, Node<Integer> llink) {
            this.pCount = pCount;
            this.rlink = rlink;
            this.llink = llink;
        }

        public Integer getData() {
            return pCount;
        }

        public void setData(Integer pCount) {
            this.pCount = pCount;
        }

        public Node<Integer> getRlink() {
            return rlink;
        }

        public void setRlink(Node<Integer> rlink) {
            this.rlink = rlink;
        }

        public Node<Integer> getLlink() {
            return llink;
        }

        public void setLlink(Node<Integer> llink) {
            this.llink = llink;
        }
    }

    public static class merryList<Integer> {
        public Node<Integer> last;
        public int size;

        public merryList() {
            last = null;
            size = 0;
        }

        public void insertAfter(Integer target, Integer pCount) {
            // target 뒤에 삽입
            Node<Integer> newNode = new Node<Integer>(pCount, null, null);

            if(size==0 && target==null) {
                newNode.setLlink(newNode);
                newNode.setRlink(newNode);
                last = newNode;
                size++;
            } else {
                if(search(target)) {
                    Node<Integer> tNode = findNode(target);
                    tNode.getRlink().setLlink(newNode);
                    newNode.setRlink(tNode.getRlink());
                    tNode.setRlink(newNode);
                    newNode.setLlink(tNode);
                    size++;
                } else {
                    System.out.println("Cannot find target : " + target);
                }
            }
        }
        public void insertPrevious(Integer target, Integer pCount) {
//      target 앞에 data를 넣기
            Node<Integer> newNode = new Node<Integer>(pCount, null, null);

            if(size==0 && target==null) {
                newNode.setLlink(newNode);
                newNode.setRlink(newNode);
                last = newNode;
                size++;
            } else {
                if(search(target)) {
                    Node<Integer> tNode = findNode(target);
                    tNode.getLlink().setRlink(newNode);
                    newNode.setLlink(tNode.getLlink());
                    tNode.setLlink(newNode);
                    newNode.setRlink(tNode);
                    size++;
                    if(tNode == last) {
                        last = newNode;
                    }
                } else {
                    System.out.println("Cannot find target : " + target);
                }
            }
        }
        public void add(Integer pCount) {
            Node<Integer> newNode = new Node<Integer>(pCount, null, null);

            if(size==0) {
                last = newNode;
                newNode.setRlink(newNode);
                newNode.setLlink(newNode);
                size++;
            } else {
                newNode.setRlink(last.rlink);
                last.rlink.setLlink(newNode);
                last.setRlink(newNode);
                newNode.setLlink(last);
                size++;
                last=newNode;
            }
        }
        public void removePrevious(Integer target) {
//      target 앞의 Node를 삭제
            if(size==0) {
                System.out.println("No Data!");
            }
        }

        public void removeAfter(Integer target) {
//      target 뒤의 Node를 삭제
            if(size==0) {
                System.out.println("No Data!");
            }
        }

        public boolean search(Integer pCount) {
//      리스트 내 data 존재 여부
            Node<Integer> tNode = last;
            for(int i=0; i<size; i++) {
                if(pCount == tNode.pCount) {
                    return true;
                }
                tNode = tNode.getRlink();
            }
            return false;
        }
        public Node<Integer> findNode(Integer target) {
//      리스트 내 target 찾기
            Node<Integer> tNode = last;
            for(int i=0; i<size; i++) {
                if(target == tNode.pCount) {
                    return tNode;
                }
                tNode = tNode.getRlink();
            }
            return tNode;
        }
        public void printAll() {
//      리스트를 출력
        }
    }

    public static void main(String[] args) {
        merryList<Integer> list = new merryList<>();

        int ones = 1;

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        boolean trig = false;

        int[] temps = new int[count];

        for(int i=0; i<count; i++) {
            int temp = sc.nextInt();
            temps[i] = temp;
            ones = ones * temp;
        }

        int odd = 0;
        int even = 0;

        for(int i=0; i<count; i++) {
            if(i%2 == 1) {
                odd = odd + temps[i];
            } else {
                even = even + temps[i];
            }
        }

        if(odd * even == 0) {
            trig = true;
        }

        if(ones == 1) {
            System.out.println(0);
        } else {
            int sumcount = 0;
        }



        //

        // 1. 해당 값이 1 이하인 경우 제외
        // 2. 해당 값의 양 옆 노드의 값이 0인 경우 제외
        // 3. 해당 값의 양 옆 노드의 값이 0이 아닌 경우
        // 4. 해당 값의 양 옆 노드 중 하나만 0인 경우


        //
    }
}
