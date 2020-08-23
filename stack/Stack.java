/** Interfaz Stack **/
public interface Stack<T>{

    //Estos los metodos fundamentales por definicion de la pila.
    //Va agreagar a la pila.
    public void push(T element);
    //Va devolver el elemento de top de la pila.
    public T pop();
    //La hojeada de va devolver el top de la pila.
    public T peek();
    //Esto metodos extras para darle mas funciones la definicion de la pila;
    //Indica cuantos elementos hay en pila.
    public int size();
    //Indica si esta vacia.
    public boolean isEmpty();
    //Representa de forma en cadena la pila.
    public String toString();
}
