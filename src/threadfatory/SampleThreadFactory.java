package threadfatory;

import java.util.concurrent.ThreadFactory;

public class SampleThreadFactory implements ThreadFactory {

    private int threadId;
    private String name;

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, "azeem" + this.name);
        return thread;
    }
}
