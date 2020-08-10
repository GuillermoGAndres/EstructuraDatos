
/**
 Representa una exception de vacio, puede ser utilzada en esas situaciones
*/
public class EmptyException extends RuntimeException{
    public EmptyException(String s){
	super("The " + s + " is empty.");
    }
}
