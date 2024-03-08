package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MessyComported {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>(); // nao garante a ordem de sessao.
        
        nums.add(35);
        nums.add(12);
        nums.add(32);
        nums.add(5);
        nums.add(4);
        nums.add(4);
        
        for (Integer num : nums) {
            System.out.println(num);
        }

        Set<String> people = new TreeSet<>();
        
        people.add("Ana");
        people.add("Carlos");
        people.add("Lucas");
        people.add("Pedro");
        people.add("Pedro");
        
        for (String person : people) {
            System.out.println(person);
        }
    }
}
