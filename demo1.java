import java.util.*;
class NestedIfElseExample {
    public static void main(String[] args) {
        int num=10;

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is a positive even number.");
            } else {
                System.out.println(num + " is a positive odd number.");
            }
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }
    }
}