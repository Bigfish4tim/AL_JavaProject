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

        public boolean isCorrect() {
            int x = 1;

            for(int i=0; i<size; i++) {
                int temp = (int) last.getData();

                x = x * temp;
            }

            return x == 1;
        }
    }

    public void cycleFunc(merryList<Integer> list) {
        Node<Integer> temp = list.last;
        while (!list.isCorrect()) {
            moveFunc(temp);

            temp = temp.rlink;
        }
    }

    public void moveFunc(Node<Integer> last) {
        if(last.rlink.getData() == 0 && last.llink.getData() != 0) {
            last.pCount--;
            last.rlink.pCount++;
            sum++;
        } else if(last.rlink.getData() != 0 && last.llink.getData() == 0) {
            last.pCount--;
            last.llink.pCount++;
            sum++;
        }
    }

    int sum = 0;

    public static void main(String[] args) {
        merryList<Integer> list = new merryList<>();

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] temps = new int[count];

        for(int i=0; i<count; i++) {
            list.add(sc.nextInt());
        }

        //

        // 1. 단면
        // 2. 양면
        // 2-1. 2 이상의 양면
        // 2-2. 2인 양면
        // 3. 양면이 1 이상

        //
    }
}
