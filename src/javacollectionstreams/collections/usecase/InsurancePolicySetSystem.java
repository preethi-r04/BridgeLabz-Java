package javacollectionstreams.collections.usecase;
import java.util.*;
import java.time.*;

class Policy implements Comparable<Policy> {
    int policyNumber;
    String policyHolder;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(int policyNumber, String policyHolder, LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    public boolean equals(Object o) {
        Policy p = (Policy) o;
        return this.policyNumber == p.policyNumber;
    }

    public int hashCode() {
        return policyNumber;
    }

    public String toString() {
        return policyNumber + " " + policyHolder + " " + expiryDate + " " + coverageType;
    }
}

public class InsurancePolicySetSystem {

    static void display(Set<Policy> set) {
        for (Policy p : set) System.out.println(p);
        System.out.println();
    }

    static void expiringSoon(Set<Policy> set) {
        LocalDate today = LocalDate.now();
        for (Policy p : set) {
            if (!p.expiryDate.isBefore(today) && p.expiryDate.isBefore(today.plusDays(30)))
                System.out.println(p);
        }
        System.out.println();
    }

    static void byCoverage(Set<Policy> set, String type) {
        for (Policy p : set)
            if (p.coverageType.equals(type))
                System.out.println(p);
        System.out.println();
    }

    static void findDuplicates(List<Policy> list) {
        Set<Integer> seen = new HashSet<>();
        for (Policy p : list) {
            if (!seen.add(p.policyNumber))
                System.out.println(p);
        }
        System.out.println();
    }

    static void performanceTest(Set<Policy> set) {
        long start = System.nanoTime();
        set.add(new Policy(999, "Test", LocalDate.now(), "Health", 5000));
        set.contains(new Policy(999, "Test", LocalDate.now(), "Health", 5000));
        set.remove(new Policy(999, "Test", LocalDate.now(), "Health", 5000));
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    public static void main(String[] args) {

        Policy p1 = new Policy(101, "Alice", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(102, "Bob", LocalDate.now().plusDays(40), "Auto", 8000);
        Policy p3 = new Policy(103, "Carol", LocalDate.now().plusDays(20), "Home", 6000);
        Policy p4 = new Policy(101, "Alice", LocalDate.now().plusDays(10), "Health", 5000);

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Collections.addAll(hashSet, p1, p2, p3);
        Collections.addAll(linkedHashSet, p1, p2, p3);
        Collections.addAll(treeSet, p1, p2, p3);

        display(hashSet);
        display(linkedHashSet);
        display(treeSet);

        expiringSoon(hashSet);
        byCoverage(hashSet, "Health");

        List<Policy> list = Arrays.asList(p1, p2, p3, p4);
        findDuplicates(list);

        performanceTest(new HashSet<>());
        performanceTest(new LinkedHashSet<>());
        performanceTest(new TreeSet<>());
    }
}

