import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator{
    
    private Stack<Integer> stack;

    public PostfixEvaluator(){
        stack = new Stack<>();
    }

    public int evaluate(String exp){
	int result=0;
    int op1, op2;
	Scanner parse = new Scanner(exp);
    while(parse.hasNext()){
	    String token = parse.next();
        //Analizar si es un numero o un operando para meterlo en la pila
        if( isOperator(token) ){
            //Hacer la operacion indicada, sacar dos operandos de la pila
            op2 = stack.pop().intValue(); //Esto es una cadena
            op1 = stack.pop().intValue();
            switch(token.charAt(0) ){
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                result = op1 / op2;
                break;
            }
            //System.out.println(op1 + " ope2: " + op2 + " result: " + result );
            stack.push(new Integer(result) );

        }else{
            //Meterlos en la pila
            stack.push(new Integer( Integer.parseInt(token) ) );
        }

	}
    result = stack.pop();
	return result;
    }

    private boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
