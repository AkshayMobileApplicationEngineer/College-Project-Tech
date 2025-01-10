import java.util.HashSet;

public class HashSetConcept {
    public static void main(String[] args) {
        // Step 1: Create a HashSet and add initial elements
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // Step 2: Print the HashSet after adding elements
        System.out.println("Initial HashSet: " + set);

        // Step 3: Remove an element from the HashSet
        set.remove(3);
        System.out.println("HashSet after removing 3: " + set);

        // Step 4: Add a new element to update the set
        set.add(6);
        System.out.println("HashSet after adding 6: " + set);

        // Step 5: Remove another element (update step)
        set.remove(1);
        System.out.println("HashSet after removing 1: " + set);

        // Step 6: Loop through the HashSet to print each element
        System.out.println("Elements in the HashSet:");
        for (int element : set) {
            System.out.println(element);
        }
    }
}
