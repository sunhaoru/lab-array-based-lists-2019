import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Simple explorations of iterators and list iterators, using Java's friendly ArrayList class.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class ArrayListExperiment {
  // +---------+---------------------------------------------------------
  // | Helpers |
  // +---------+

  /**
   * Add a bunch of strings to the end of an arraylist.
   */
  public static void addStrings(ArrayList<String> list, String[] values) {
    for (String str : values) {
      list.add(str);
    } // for
  } // addStrings(ArrayList<String>, String[])

  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) {
    // Prepare for output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create an ArrayList to use in these experiments.
    ArrayList<String> strings = new ArrayList<String>();

    // Add some initial strings to our list and print it out.
    addStrings(strings, new String[] {"a", "b", "c"});
    pen.println("Initial array: " + strings);
    
    // Create some iterators for the list
    Iterator<String> it = strings.iterator();
    ListIterator<String> lit = strings.listIterator();
    ListIterator<String> lit1 = strings.listIterator();
    ListIterator<String> lit2 = strings.listIterator();
    
    // Check set called after next()
    //lit.set("error");
    pen.println("next() val: " + lit.next());
    lit.set("d");
    pen.println("Set array: " + strings);
    
    // Check set called after previous()
    pen.println("previous() val: " + lit.previous());
    lit.set("e");
    pen.println("Set array: " + strings);
    pen.println("next() val: " + lit.next());
    lit.set("f");
    pen.println("Set array: " + strings);
    // And we're done
    pen.close();
  } // main(String[])

} // class ArrayListExperiment
