import org.cirelli.thita.college.assignments.Assignment1;
import org.cirelli.thita.college.assignments.Assignment2;
import org.cirelli.thita.college.lib.Assignment;

public class App {
    public static void main(String[] args) throws Exception {
        Assignment[] a = {new Assignment1(), new Assignment2()};
        for(Assignment i : a){
            i.run();
        }
    }
}