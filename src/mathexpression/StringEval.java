package mathexpression;
import java.util.Stack;
public class StringEval {



    public static int evaluate(String expression){
        char[] tokens = expression.toCharArray();
        System.out.println(tokens);
        // two stacks:  for operators and values
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i=0 ; i < tokens.length ; i++ ){
            // skip whitespaces
            if (tokens[i] == ' '){
                continue;
            }

            // if char values are greater  or equal than 0 char value and smaller or equal than 9 char value
            if (tokens[i] >= '0' && tokens[i] <= '9'){
                StringBuilder sbuild = new StringBuilder();
                //a number may have more than one char
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9'){
                    sbuild.append(tokens[i++]);
                }
                values.push(Integer.parseInt(sbuild.toString()));

                //reset i  offset to correct value
                i--;
            }else if (tokens[i] == '('){
                ops.push(tokens[i]);
            }else if (tokens[i] == ')'){
                // closing parenthesis found : all operations inside must be processed
                while (ops.peek() != '('){
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                }
                // flush used op
                ops.pop();
            }else if (tokens[i] == '+' ||
                      tokens[i] == '-' ||
                      tokens[i] == '*' ||
                      tokens[i] == '/'){
                while (!ops.empty() &&
                        hasPrecedence(tokens[i],
                                ops.peek()))
                {
                    values.push(applyOp(ops.pop(),
                            values.pop(),
                            values.pop()));

                }

                ops.push(tokens[i]);

            }
        }

        while (!ops.empty()){
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    // verify precedence
    public  static boolean hasPrecedence(char op1, char op2){
        if (op2 == '(' || op2 == ')'){
            return false;
        }
        return (op1 != '*' && op1 != '/') ||
                (op2 != '+' && op2 != '-');
    }

    public static int applyOp(char op, int b, int a){
        switch (op){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case  '/':
                if (b == 0){
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
}
