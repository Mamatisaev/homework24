package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> visited = new HashSet<>();
        visited.add("Indiana State ");
        visited.add("Connecticut State ");
        visited.add("Minnesota State ");
        System.out.println("First group: ");
        visited.forEach(System.out::print);

        Set<String> dreaming = new HashSet<>();
        dreaming.add("Arkansas State ");
        dreaming.add("Indiana State ");
        dreaming.add("Connecticut State ");
        System.out.println("\nSecond group: ");
        dreaming.forEach(System.out::print);

        System.out.println("\nThe answer is:");
        symmetricDifference(visited, dreaming);
    }

        public static void symmetricDifference(Set<String> visited, Set<String> dreaming) {
        Set <String> reality = new HashSet<>(visited);
        reality.removeAll(dreaming);
        dreaming.removeAll(visited);
        reality.addAll(dreaming);
        reality.forEach(System.out::print);

              }
    }
