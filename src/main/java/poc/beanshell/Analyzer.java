package poc.beanshell;

import bsh.EvalError;
import bsh.Interpreter;

public class Analyzer {

    public boolean analyze(Object obj, String condition) throws EvalError {
        Interpreter bsh = new Interpreter();
        bsh.set("obj", obj);
        bsh.eval(String.format("result = (%s)", condition));
        return (Boolean) bsh.get("result"); 
    }
}
