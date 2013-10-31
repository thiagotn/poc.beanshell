package poc.beanshell;

import java.util.Date;

public interface Task {

    public Object getId();

    public String getState();

    public int getRetryCount();

    public Date getProcessedTime();
}
