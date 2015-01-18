package iteratorimpl;


/**
 * Created by misko on 18.1.2015.
 */
public class Main {
    public static void main(String[] args) {


        Main main = new Main();
        Students students = new Students();

        for (Iterator itr = students.getIterator(); itr.hasNext(); ) {
            System.out.println(itr.next());
        }
    }
}
