package poc.beanshell;

import java.util.Date;

public class SampleTask implements Task {

    private Integer id;

    private String state;

    private Integer retryCount;

    private Date updated;

    public Object getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public Date getProcessedTime() {
        return updated;
    }
}
