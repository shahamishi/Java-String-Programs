package stringPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ashah on 8/28/18.
 */
public class seperateOutStrings {
    public static String[] solution(String s, String separator) {
        List<String> stringsList = new LinkedList<String>(Arrays.asList(s.split(separator)));
        int i=0;
        for(String string:stringsList){
            if(string.isEmpty()){
                stringsList.remove(i);
            }
            i++;
        }
        return stringsList.toArray(new String[0]);
    }

    public static void main(String[] args){
        String[] result = solution("abcdabcd","c");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
        System.out.println();
        String[] result1 = solution("aabbccdd","c");
        for(int i=0;i<result1.length;i++){
            System.out.print(result1[i]+",");
        }
        System.out.println();
        String[] result2 = solution("abcd","z");
        for(int i=0;i<result2.length;i++){
            System.out.print(result2[i]+",");
        }
    }

}
