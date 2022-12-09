package task1;

public class Handler5 extends Handler{
    @Override
    public void process(int price) {
        System.out.println(price/50 + " * 5");
        Handler next = getNext();
        if (next!=null) {
            getNext().process(price%5);
        }
    }
}
