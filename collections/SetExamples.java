package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> setAdd = new HashSet<>();
        setAdd.add("Java");
        setAdd.add("Python");

        Set<String> setAddAll = new HashSet<>();
        setAddAll.addAll(Arrays.asList("Java", "Python", "C++"));
        
        Set<String> setRemove = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        setRemove.remove("Python");
        

        Set<String> setRemoveAll = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        setRemoveAll.removeAll(Arrays.asList("Python", "C++"));
        
        Set<String> setRetainAll = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        setRetainAll.retainAll(Arrays.asList("Python"));
        
        Set<String> setClear = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        setClear.clear();
        
        Set<String> setSize = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        int size = setSize.size();
        System.out.println("Size: " + size);
        
        Set<String> setIsEmpty = new HashSet<>();
        boolean isEmpty = setIsEmpty.isEmpty();
        System.out.println("Is empty: " + isEmpty);
        
        Set<String> setContains = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        boolean contains = setContains.contains("Python");
        System.out.println("Contains Python: " + contains);
        
        Set<String> setIterator = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        
        Iterator<String> iterator = setIterator.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
