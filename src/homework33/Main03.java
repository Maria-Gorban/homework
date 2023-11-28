package homework33;

import java.util.Scanner;

public class Main03 {

  public static int fibSequence(int n) {

    if (n <= 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    } else {
      return fibSequence(n - 1) + fibSequence(n - 2);
    }
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    do {
      n = scanner.nextInt();
    } while (n < 0);
    System.out.print("Fibonacci sequence: ");
    int[] fib = new int[n];
    for (int i = 0; i < n; i++) {
      fib[i] = fibSequence(i+1);
      System.out.print(fib[i] + " ");

    }
  }
}

/*
public static int[] printFibonacciSequence(int n) {
    int[] fib = new int[n];
    for (int i = 0; i < n; i++) {
      fib[i] = i;
    }
    for (int i = 2; i < n; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib;
  }

  main
    Scanner scanner = new Scanner(System.in);
    int n;
    do {
      n = scanner.nextInt();
    } while (n < 0);
    System.out.print("Fibonacci sequence: ");
    int[] fib = printFibonacciSequence(n);
    for (int i = 0; i < fib.length; i++) {
        System.out.print(fib[i] + " ");
    }
  }
}
    */