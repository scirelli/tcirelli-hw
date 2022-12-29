import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class AppAllInOne {
    public static void main(String[] args) throws Exception {
        Assignment[] a = {new Assignment1(), new Assignment2()};
        for(Assignment i : a){
            i.run();
        }
    }
}

interface IAssignment{
    void run();
    void addSection(ISection s);
    int getNumber();
    String getPart();
}

interface ISection{
    int getNumber();
    void run();
}

class Assignment implements IAssignment{
    private ArrayList<ISection> sections;
    private int number = 0;
    private String part = "";

    public Assignment(int n, String p) {
        sections = new ArrayList<ISection>();
        number = n;
        part = p;
    }

   public void run() {
        System.out.println(toString());
        for (ISection s : sections) {
            s.run();
            System.out.println(s.toString());
        }
    }

    public void addSection(ISection s){
        sections.add(s);
    }

    public int getNumber() {
        return number;
    }

    public String getPart() {
        return part;
    }
 
    @Override
    public String toString() {
        String s = "Assignment " + getNumber() + ", Part " + getPart() + ", \n";
        String p = "*".repeat(s.length()) + "\n";
        return "\n\n" + p + s + p;
    }
}

abstract class Section implements ISection{
    protected List<String> output;

    public Section(){
        output = new ArrayList<>(Arrays.asList(
            "\n*********** Section: " + getNumber() + " ***********"
        ));
    }

    @Override
    public String toString() {
        return String.join("\n", output);
    }
}


//*********************************************************
//****Assignment 1, Part A,
//*********************************************************
class Assignment1 extends Assignment {
    public Assignment1() {
        super(1, "A");
        addSection(new One());
        addSection(new Two());
        addSection(new Three());
    }
}

//*********************************************************
//****Assignment 1, Part A, Section 1
//*********************************************************
class One extends Section {
    private static String[] professionNames = {"Software Engineer", "Programmer", "Database Admin", "Network Admin", "Web Developer", "Program Manager"};

    @Override
    public int getNumber() {
        return 1;
    }

    @Override
    public void run() {
        Set<String> professionNameSet = new HashSet<String>(Arrays.asList(professionNames));
        SortedSet<String> sortedProfessionNames = new TreeSet<String>();

        for(String s : professionNameSet) {
            sortedProfessionNames.add(s);
        }

        output.add("Original List:");
        output.add(String.join(", ", professionNameSet));
        output.add("Sorted List:");
        output.add(String.join(", ", sortedProfessionNames));
    }
}

//*********************************************************
//****Assignment 1, Part A, Section 2
//*********************************************************
class Two extends Section {
    private static String[] titles = {"To Kill a Mockingbird", "Huckleberry Finn", "Pride and Prejudice", "Brave New World", "Lord of the Flies", "Alice in Wonderland", "The Old Man and the Sea", "Atlas Shrugged"};
    private LinkedList<String> titleList = new LinkedList<String>(Arrays.asList(titles));

    @Override
    public int getNumber() {
        return 2;
    }

    @Override
    public void run() {
        output.add("Original List:");
        output.add(String.join(", ", titleList));
        output.add("Sorted Book List:");
        titleList.sort(Comparator.naturalOrder());
        output.add(String.join(", ", titleList));
        titleList.remove(1);
        titleList.removeFirst();
        titleList.removeLast();
        output.add("Book List After Deletions:");
        output.add(String.join(", ", titleList));
        output.add("The number of items in my book list is:" + titleList.size());
        if(titleList.contains("Brave New World")){
            output.add("Brave New World is in the list.");
        }
    }
}

//*********************************************************
//****Assignment 1, Part A, Section 3
//*********************************************************
class Three extends Section{
    static class Node<T>{
        private T value;
        private Node<T> left = null;
        private Node<T> right = null;

        public Node(T v){
            value = v;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T v) {
            value = v;
        }

        public void setLeft(Three.Node<T> n) {
            left = n;
        }

        public Three.Node<T> getLeft() {
            return left;
        }

        public void setRight(Three.Node<T> n) {
            right = n;
        }

        public Three.Node<T> getRight() {
            return right;
        }

        @Override
        public String toString(){
            return value.toString();
        }
    }

    static class BinaryTree<T> {
        protected Node<T> root = null;
        private Comparator<T> comparer;

        public BinaryTree(Comparator<T> compr){
            setCompare(compr);
        }

        public void setCompare(Comparator<T> c){
            comparer = c;
        }

        public void insert(Iterable<T> a){
            for(T t : a){
                insert(t);
            }
        }

        public void insert(T value) {
            Node<T> node = new Node<T>(value);
            if(root == null){
                 root = node;
                 return;
            }

            Node<T> nextNode = root;
            while(nextNode != null) {
                if(comparer.compare(nextNode.getValue(), node.getValue()) > 0){
                    if(nextNode.getLeft() == null){
                        nextNode.setLeft(node);
                        break;
                    }else{
                        nextNode = nextNode.getLeft();
                    }
                }else{
                    if(nextNode.getRight() == null){
                        nextNode.setRight(node);
                        break;
                    }else{
                        nextNode = nextNode.getRight();
                    }
                }
            }
        }

        public List<Node<T>> inOrderTraverse() {
            return _inOrderTraverse(root, new ArrayList<Node<T>>());
        }

        private List<Node<T>> _inOrderTraverse(Node<T> node, List<Node<T>> result) {
            if(node == null) return result;
            _inOrderTraverse(node.getLeft(), result);
            result.add(node);
            _inOrderTraverse(node.getRight(), result);

            return result;
        }
    }

    @Override
    public int getNumber() {
        return 3;
    }

    @Override
    public void run() {
        BinaryTree<Integer> bt = new BinaryTree<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        bt.insert(Arrays.asList(new Integer[]{50, 30, 45,12, 29}));

        output.add("The contents of the binary tree are:");
        ArrayList<String> a = new ArrayList<>();
        for(Node<Integer> n : bt.inOrderTraverse()){
            a.add(n.toString());
        }
        output.add(String.join(", ", a));
    }
}



//*********************************************************
//****Assignment 1, Part B
//*********************************************************
class Assignment2 extends Assignment{
    public Assignment2() {
        super(1, "B");
        addSection(new BOne());
        addSection(new BTwo());
        addSection(new BThree());
    }
}

//*********************************************************
//****Assignment 1, Part B, Section 1
//*********************************************************
class BOne extends Section {
    private static String[] mammals = {"Bear,", "Gorilla,", "Tiger,", "Polar Bear,", "Lion,", "Monkey."};

    @Override
    public int getNumber() {
        return 1;
    }

    @Override
    public void run() {
        Set<String> setMammals = new HashSet<String>(Arrays.asList(mammals));
        SortedSet<String> sortedMammals = new TreeSet<String>();

        for(String s : setMammals) {
            sortedMammals.add(s);
        }
        output.add("\nContents of the set are:");
        output.add(String.join(", ", setMammals));
        output.add("\nContents of the sorted set are:");
        output.add(String.join(", ", sortedMammals));
        output.add("\nThe first item in the set is:");
        output.add(sortedMammals.first());
        output.add("\nThe last item in the set is:");
        output.add(sortedMammals.last());
    }
}

//*********************************************************
//****Assignment 1, Part B, Section 2
//*********************************************************
class BTwo extends Section {
    private static String[] myFriendsArray = {"Fred 602-299-3300", "Ann 602-555-4949", "Grace 520-544-9898", "Sam 602-343-8723", "Dorothy 520-689-9745", "Susan 520-981-8745", "Bill 520-456-9823", "Mary 520-788-3457"};
    private LinkedList<String> myFriends = new LinkedList<String>(Arrays.asList(myFriendsArray));

    @Override
    public int getNumber() {
        return 2;
    }

    @Override
    public void run() {
        output.add("\nThe contents of my friends list:");
        output.add(String.join("\n", myFriends));
        myFriends.remove(6);
        myFriends.sort(Comparator.naturalOrder());
        myFriends.removeFirst();
        myFriends.removeLast();
        myFriends.set(myFriends.indexOf("Mary 520-788-3457"), "Mary 520-897-4567");
        output.add("\nThe updated contents of my friends list:");
        output.add(String.join("\n", myFriends));
        output.add("\nThe number of friends in my list is: " + myFriends.size());
    }
}

//*********************************************************
//****Assignment 1, Part B, Section 3
//*********************************************************
class BThree extends Section{
    static class BinaryTree<T> extends Three.BinaryTree<T> {
        public BinaryTree(Comparator<T> compr) {
            super(compr);
        }

        public List<Three.Node<T>> preOrderTraverse() {
            return _preOrderTraverse(root, new ArrayList<Three.Node<T>>());
        }
        
        private List<Three.Node<T>> _preOrderTraverse(Three.Node<T> node, List<Three.Node<T>> result) {
            if(node == null) return result;

            result.add(node);
            _preOrderTraverse(node.getLeft(), result);
            _preOrderTraverse(node.getRight(), result);

            return result;
        }

        public List<Three.Node<T>> postOrderTraverse() {
            return _postOrderTraverse(root, new ArrayList<Three.Node<T>>());
        }
        
        private List<Three.Node<T>> _postOrderTraverse(Three.Node<T> node, List<Three.Node<T>> result) {
            if(node == null) return result;

            _postOrderTraverse(node.getLeft(), result);
            _postOrderTraverse(node.getRight(), result);
            result.add(node);

            return result;
        }
    }

    @Override
    public int getNumber() {
        return 3;
    }

    @Override
    public void run() {
        BinaryTree<Integer> bt = new BinaryTree<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        bt.insert(Arrays.asList(new Integer[]{50, 30, 45,12, 29}));
        //bt.insert(Arrays.asList(new Integer[]{2,1,3}));

        output.add("Traversing the binary tree in order:");
        ArrayList<String> a = new ArrayList<>();
        for(Three.Node<Integer> n : bt.inOrderTraverse()){
            a.add(n.toString());
        }
        output.add(String.join(", ", a));

        output.add("Traversing the binary tree in pre-order: ");
        a = new ArrayList<>();
        for(Three.Node<Integer> n : bt.preOrderTraverse()){
            a.add(n.toString());
        }
        output.add(String.join(", ", a));

        output.add("Traversing the binary tree in post-order: ");
        a = new ArrayList<>();
        for(Three.Node<Integer> n : bt.postOrderTraverse()){
            a.add(n.toString());
        }
        output.add(String.join(", ", a));
    }
}