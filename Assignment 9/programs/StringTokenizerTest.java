
/*2. Write a JAVA program to reverse the following string containing days of a week.Suppose, String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday"; Using the methods of String class manipulate the string days in such a way that when we print the string days it should display Sunday Saturday Friday Thursday Wednesday Tuesday Monday */
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String strReverse;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            sb.insert(0, st.nextToken());
            if (st.hasMoreTokens()) {
                sb.insert(0, " ");
            }
        }

        System.out.println(sb);
    }
}
