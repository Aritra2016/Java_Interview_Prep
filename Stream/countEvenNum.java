package Stream;

import java.util.List;

public class countEvenNum {
    
    public static void main(String[] args) {
        
       
        //Filter Count of Even Number

        List<Integer> numbs= List.of(13, 35, 13, 57, 46, 48);
        long countTime =numbs.stream().filter(number-> number%2==0).count();

        System.out.println("Count of Even Number ==> "+ countTime);

    }
}
