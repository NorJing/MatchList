import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestUsingConstructor {

//    private int m1;
//    private int m2;

    private Match match;

//    public ParameterizedTestUsingConstructor(int p1, int p2) {
//        System.out.println("p1=" + p1 + ", p2=" + p2 + " ");
//        m1 = p1;
//        m2 = p2;
//    }

    public ParameterizedTestUsingConstructor(Match match){
        this.match = match;
    }

    // creates the test data
    @Parameters
    public static Collection<Match> data() {
//        Object[][] data = new Object[][] { { 1 , 2 }, { 5, 3 }, { 121, 4 } };

        ArrayList<Match> matches = new ArrayList<Match>();
        matches.add(new Match(3, "home1", "away1", "2013/11/25 18:45:00"));
        return matches;
    }


//    @Test
//    public void testMultiplyException() {
//        MyClass tester = new MyClass();
//        assertEquals("Result", m1 * m2, tester.multiply(m1, m2));
//    }

    @Test
    public void testGetMatchId(){
        MyClass tester = new MyClass();
        assertEquals("Match Id", 3, tester.getMatchId(this.match));
    }

    // class to be tested
    class MyClass {
//        public int multiply(int i, int j) {
//            return i *j;
//        }

        public int getMatchId(Match match){
            return match.getMatchId();
        }
    }

}