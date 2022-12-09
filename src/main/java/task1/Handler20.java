package task1;

public class Handler20 extends Handler{
    @Override
    public void process(int price) {
        System.out.println(price/50 + " * 20");
        Handler next = getNext();
        if (next!=null) {
            getNext().process(price%20);
        }
    }
}
