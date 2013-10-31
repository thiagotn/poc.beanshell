package poc.beanshell;

import java.util.Date;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;


public class SampleTaskTestSetup {

    public void load() {
        Fixture.of(SampleTask.class).addTemplate("valid", new Rule() {{
            add("id", 1);
            add("state", "OK");
            add("retryCount", 10);
            add("updated", new Date());
        }});
    }
}
