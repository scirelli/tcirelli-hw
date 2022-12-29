package org.cirelli.thita.college.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Section implements ISection{
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
