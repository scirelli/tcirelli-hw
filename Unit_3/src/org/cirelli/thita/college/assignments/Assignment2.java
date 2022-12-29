package org.cirelli.thita.college.assignments;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.cirelli.thita.college.lib.Assignment;
import org.cirelli.thita.college.lib.Section;

public class Assignment2 extends Assignment{
    public Assignment2() {
        super(1, "B");
        addSection(new BOne());
        addSection(new BTwo());
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
class BThree extends Section {
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