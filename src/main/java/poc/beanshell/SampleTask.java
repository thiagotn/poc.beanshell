package poc.beanshell;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SampleTask implements Task {

    private Integer id;

    private String state;

    private Integer retryCount;

    private Date created;

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

    public Date getCreated() {
        return created;
    }

    public Date getProcessedTime() {
        return updated;
    }

    public boolean hasMoreThan3Months() {
        GregorianCalendar moreThan3Months = new GregorianCalendar();
        moreThan3Months.setTime(this.created);
        moreThan3Months.add(Calendar.MONTH, 3);

        GregorianCalendar now = new GregorianCalendar();
        return moreThan3Months.after(now);
    }
}
