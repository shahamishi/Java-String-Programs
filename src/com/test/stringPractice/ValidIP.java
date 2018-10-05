package stringPractice;
import java.util.*;

/**
 * Created by ashah on 6/20/18.
 */
public class ValidIP {

    public static void main(String args[] ) throws Exception {
        System.out.println("Provide a string of numbers to be converted to a possible list of IP Addresses");
        Scanner s = new Scanner(System.in);
        System.out.print(getValidIPAddresses(s.nextLine()));
    }

    private static List<String>  getValidIPAddresses (String input) {
        List<String> resultList = new ArrayList<String>();
        String result = input;
        int size = input.length();
//  The size of the input has to be between 4 and 12.
        if (size < 4 || size > 12 ) {
            return resultList;
        }
// Try out different combinations of IP addresses by putting dot (.) at various locations in the given string.
// Each dot will add a segment to the result.
// There has to be 4 segments for an IP Address to be a valid one.
// After making 4 segments, validate if its a valid one, if yes, add to the resultList otherwise proceed further with other combination.
        for (int first = 1; first < size - 2; first++)
        {
            for (int second = first + 1; second < size - 1; second++)
            {
                for (int third = second + 1; third < size; third++)
                {
                    result = result.substring(0, third) + "." + result.substring(third);
                    result = result.substring(0, second) + "." + result.substring(second);
                    result = result.substring(0, first) + "." + result.substring(first);

                    if (isValidIP(result))
                    {
                        resultList.add(result);
                    }
                    result = input;
                }
            }
        }
        return resultList;
    }

    /**
     * This method validates if the given IP is a valid IP or not.
     * For an IP to be valid, there should be 4 segments. Each segment should be a number between 0 and 255 both inclusive.
     * Also the segment should not be a value containing more than one zeros or a non-zero value starting with zero.
     * @param ip
     * @return true/false
     */
    private static boolean isValidIP(String ip)
    {
        String array[] = ip.split("\\.");
        int value;
        int length;
        for (String s : array) {
            value = Integer.parseInt(s);
            length = s.length();
            if (length > 3 || value < 0 || value > 255)
            {
                return false;
            }
            if ((length > 1 && value == 0) || (length > 1 && value != 0 && s.charAt(0) == '0'))
                return false;
        }

        return true;
    }
}