/*Implementacion de interfaz stack*/

public class ArrayStack<T> implements Stack<T>{
    private final static int CAPACITY_DEFAULT = 50;

    private int top;
    private T[] stack;

    //Default constructor
    public ArrayStack(){
	this(CAPACITY_DEFAULT);
    }

    //Defining for our.
    public ArrayStack(int capacity){
	stack =(T[])(new Object[capacity]); //No puede inicializar Genericos, por lo tanto usaremos un casteo de Objects.
	top = 0;
    }
    
    //Estos los medodos fundamentales por definicion de la pila.
    //Va agreagar a la pila.
    public void push(T element){
	//Tenemos que fijarnos que no este llena;
	if( size() == stack.length ){
	    //Aumentamos dinamicamente nuestro arreglo, creamos uno nuevo y lo copiamos nuestro contenido
	    expandCapacity();
	}
	stack[top] = element;
	top++;
    }
    
    /*Metodo auxiliar para aumentar la capacidad */
    private void expandCapacity(){
	T[] new_stack = (T[]) (new Object[stack.length*2]);
	for(int i=0; i < stack.length; i++){
	    new_stack[i] = stack[i];
	}
	stack = new_stack;
    }
    
    //Va devolver el elemento de top de la pila.
    public T pop(){
	//Tenemos que verifar que no este vacio la pila.
	if(isEmpty()){
	    //Lanzamos una exepcion al usuario de esta vacio y pones sacar elementos
	    throw new EmptyException("Stack");
	}
	top--;
	T element = stack[top];
	//Asignamos a null ahora el elemento que se fue
	stack[top] = null;
	return element;
    }
    
    //La hojeada de va devolver el top de la pila.
    public T  peek(){
	//Solo va a ver el valor de la pila, no lo remover, tambien tenemos que verificar que no este vacia
	if(isEmpty()){
	    //Generar exepcion
	    throw new EmptyException("Stack");
	}
	return stack[top-1];
    }
    
    //Esto metodos extras para darle mas funciones a la definicion la pila.
    //Indica cuantos elementos hay en pila en el momento que se han ingresado.
    public int size(){
	return top;
    }
    //Indica si esta vacia.
    public boolean isEmpty(){
	return top == 0; //
    }
    //Representa de forma en cadena la pila.
    public String toString(){
	String result= "[";
	for(int i=0; i < size(); i++){
	    result = result + stack[i] + "][";
	}
	result += "]";
	return result;
    }
}
