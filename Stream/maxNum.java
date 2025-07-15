package Stream;

import java.util.List;

public class maxNum {
    
    public static void main(String[] args) {
        
        List<Integer> numbers= List.of(13, 45, 36, 68, 70);

        int maximum =numbers.stream().max(Integer::compare).orElseThrow();

        System.out.println(" maximum --> "+ maximum);
    }
}
