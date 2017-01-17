package PalindromSecond;

public class Node {
    private boolean enterFirst = true;
    private long firstMul;
    private long secondMul;
    private long productOfMul;

    public Node() {

    }

    public Node(boolean enterFirst, long firstMul, long secondMul, long productOfMul) {
        this.enterFirst = enterFirst;
        this.firstMul = firstMul;
        this.secondMul = secondMul;
        this.productOfMul = productOfMul;
    }

    public boolean isEnterFirst() {
        return enterFirst;
    }

    public void setEnterFirst(boolean enterFirst) {
        this.enterFirst = enterFirst;
    }

    public long getFirstMul() {
        return firstMul;
    }

    public void setFirstMul(long firstMul) {
        this.firstMul = firstMul;
    }

    public long getSecondMul() {
        return secondMul;
    }

    public void setSecondMul(long secondMul) {
        this.secondMul = secondMul;
    }

    public long getProductOfMul() {
        return productOfMul;
    }

    public void setProductOfMul(long productOfMul) {
        this.productOfMul = productOfMul;
    }

    @Override
    public String toString() {
        return "Node{" +
                "enterFirst=" + enterFirst +
                ", firstMul=" + firstMul +
                ", secondMul=" + secondMul +
                ", productOfMul=" + productOfMul +
                '}';
    }
}
