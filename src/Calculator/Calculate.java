package Calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculate {

    private ScriptEngine engine;

    public Calculate(ScriptEngine engine) {
        this.engine = engine;
    }


    public String evaluate(String expression) {
        if (expression.isBlank()) return "";
        expression += ';';
        String value ="";
        try {
            value = engine.eval(expression).toString();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return value;
    }


}
