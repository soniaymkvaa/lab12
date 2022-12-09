package task2;

public class TimedDocument {
    TimedDocument(Document document) {
        final long start = System.currentTimeMillis();
        final long end = System.currentTimeMillis();
        System.out.println("Total time:" + (end-start) + "ms");
    }
}
