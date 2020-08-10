

public class TesterPosfixEvaluator{

    public static void main(String[] args){
	PostfixEvaluator avaluator = new PostfixEvaluator();
	int result = avaluator.evaluate("3 4 * 2 5 + - 4 * 2 /");
    System.out.println(result);
    }
    
}
