package poc.beanshell;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;

public class SampleTaskTest {

    @Before
    public void setUp() {
        new SampleTaskTestSetup().load();
    }

    @After
    public void tearDown() {
        
    }

    @Test
    public void testAnalyzeOk() throws Exception {

        SampleTask task = Fixture.from(SampleTask.class).gimme("valid");

        String condition = "obj.state.equals(\"OK\")";

        assertTrue(new Analyzer().analyze(task, condition));
    }

    @Test
    public void testAnalyzeNOk() throws Exception {

        SampleTask task = Fixture.from(SampleTask.class).gimme("invalid");

        String condition = "obj.state.equals(\"NOK\")";

        assertTrue(new Analyzer().analyze(task, condition));
    }
}