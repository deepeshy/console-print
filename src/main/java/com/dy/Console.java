package com.dy;

public class Console {

  public static void main(String[] args) throws InterruptedException {

    int iter = 50;
    for (int i = 0; i < iter; i++) {
      if (i % 2 == 0) {
        printInColor("|    ");
      } else {
        printInColor("-    ");

      }

      for (int j = 0; j < i; j++) {
        printInColor("-");
      }
      Thread.sleep(300);
      if (i != iter - 1) {
        System.out.print("\r");
      }
    }
  }

  private static void printInColor(String str) {
    System.out.print("\u001b[1m" + "\u001b[32m" + str);
  }
}
