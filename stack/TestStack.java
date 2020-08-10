
public class TestStack{
    
    public static void main(String[] args){
	ArrayStack<Integer> stack = new ArrayStack<>();
	String message = "HolaMundo";
	for(int i=0; i < 10; i++){
	    stack.push(i);
	}
	System.out.println("Estado original de la pila" );
	System.out.println(stack);
	Integer num = stack.pop();
	System.out.println("Valor extraido de la pila con un pop: " + num);
	System.out.println(stack);
	System.out.println("Propiedades de la pila");
	System.out.println("Size: " + stack.size());
	System.out.println("Peek: "+  stack.peek()); //Una ojeada, solo estoy viendo el top, seguiria viendose igual
	System.out.println("Empty: " + stack.isEmpty());
	
	
    }
    
}
