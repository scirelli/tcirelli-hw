package org.cirelli.thita.college.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.cirelli.thita.college.lib.Assignment;
import org.cirelli.thita.college.lib.Section;

public class Assignment1 extends Assignment {
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
        private Node<T> root = null;
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

        public List<Node<T>> traverse() {
            return _traverse(root, new ArrayList<Node<T>>());
        }

        private List<Node<T>> _traverse(Node<T> node, List<Node<T>> result) {
            if(node == null) return result;
            _traverse(node.getLeft(), result);
            result.add(node);
            _traverse(node.getRight(), result);

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
        for(Node<Integer> n : bt.traverse()){
            a.add(n.toString());
        }
        output.add(String.join(", ", a));
    }
}