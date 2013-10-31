package poc.beanshell;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import bsh.Interpreter;

public class SampleTaskTest {

    @Before
    public void setUp() {
        new SampleTaskTestSetup().load();
    }

    @After
    public void tearDown() {
        
    }

    @Test
    public void testName() throws Exception {

        SampleTask st = Fixture.from(SampleTask.class).gimme("valid");

        String condition = "obj.retryCount==10 || obj.state.equals(\"OK\")";

        Interpreter bsh = new Interpreter();
        bsh.set("obj", st);
        bsh.eval(String.format("result = (%s)", condition));
        boolean result = (Boolean) bsh.get("result"); 

        assertTrue(result);
    }
}