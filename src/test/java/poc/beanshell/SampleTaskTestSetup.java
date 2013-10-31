package poc.beanshell;

import java.text.SimpleDateFormat;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;


public class SampleTaskTestSetup {

    public void load() {
        Fixture.of(SampleTask.class).addTemplate("valid", new Rule() {{
            add("id", random(1, 1000));
            add("state", "OK");
            add("retryCount", random(1, 1000));
            add("updated", afterDate("2012-12-31", new SimpleDateFormat("yyyy-MM-dd")));
        }});

        Fixture.of(SampleTask.class).addTemplate("invalid", new Rule() {{
            add("id", 2);
            add("state", "NOK");
            add("retryCount", random(1, 1000));
            add("updated", beforeDate("2012-12-31", new SimpleDateFormat("yyyy-MM-dd")));
        }});
    }
}
