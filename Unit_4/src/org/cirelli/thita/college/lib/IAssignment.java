package org.cirelli.thita.college.lib;

public interface IAssignment{
    void run();
    void addSection(ISection s);
    int getNumber();
    String getPart();
}
