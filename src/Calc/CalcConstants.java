package Calc;

public class CalcConstants {
    protected static final int KEY_FUNC_DIGIT = 0;
    protected static final int KEY_FUNC_OPERATION = 1;
    protected static final int KEY_FUNC_CLEAR = 2;
    protected static final int KEY_FUNC_EVALUATE = 3;

    protected static final char[] CALC_KEYS = {
            '7','8','9','+',
            '4','5','6','-',
            '1','2','3','*',
            'C','0','=','/'};

    protected static final int[] CALC_KEY_FUNC = {
            KEY_FUNC_DIGIT, KEY_FUNC_DIGIT, KEY_FUNC_DIGIT, KEY_FUNC_OPERATION,
            KEY_FUNC_DIGIT, KEY_FUNC_DIGIT, KEY_FUNC_DIGIT, KEY_FUNC_OPERATION,
            KEY_FUNC_DIGIT, KEY_FUNC_DIGIT, KEY_FUNC_DIGIT, KEY_FUNC_OPERATION,
            KEY_FUNC_CLEAR, KEY_FUNC_DIGIT, KEY_FUNC_EVALUATE, KEY_FUNC_OPERATION};
}
