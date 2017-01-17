package PalindromSecond;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Palindrome {

    private Comparator<Node> comparator = new NodeComparator();

    private PriorityQueue<Node> queue = new PriorityQueue<>(comparator);

    Palindrome() {

    }

    public boolean checkPalindrome(Long number) {
        String s = number.toString();
        if (s.length() > 1) {
            return s.equals((new StringBuilder(s)).reverse().toString());
        } else {
            return false;
        }
    }

    public void findMax(int n) {
        long number = (long) Math.pow(10, n) - 1;

        queue.add(new Node(true, number, number, number * number));

        long operation = 0;


        while (!checkPalindrome(queue.peek().getProductOfMul())) {

            Node temp = queue.poll();

            temp.setSecondMul(temp.getSecondMul() - 1);

            temp.setProductOfMul(temp.getFirstMul() * temp.getSecondMul());


            if (temp.isEnterFirst()) {
                if ((temp.getFirstMul() - temp.getSecondMul() == 2)) {
                    temp.setEnterFirst(false);
                    queue.add(new Node(true, temp.getFirstMul() - 1, temp.getFirstMul() - 1, (temp.getFirstMul() - 1) * (temp.getFirstMul() - 1)));
                }
            }
            queue.add(temp);
        }
        System.out.println(queue.peek().getProductOfMul());
        System.out.println(queue.peek().getFirstMul() + " " + queue.peek().getSecondMul());
    }
}
