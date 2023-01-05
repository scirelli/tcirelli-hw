package org.cirelli.thita.college.lib;

import java.util.ArrayList;

public class Assignment implements IAssignment{
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