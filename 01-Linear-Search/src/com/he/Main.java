package com.he;

public class Main {
  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int target = 5;
    int index = LinearSearch.search(arr, target);
    System.out.println(index);

    target = 11;
    index = LinearSearch.search(arr, target);
    System.out.println(index);

    Student[] student = { new Student("Alice"),
        new Student("Bob"),
        new Student("Charlie") };
    Student targetStudent = new Student("Bob");
    index = LinearSearch.search(student, targetStudent);
    System.out.println(index);
  }
}
