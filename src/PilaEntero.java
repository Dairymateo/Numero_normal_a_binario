import java.util.Stack;

public class PilaEntero {
    private Stack <Integer> pila;
    public PilaEntero(){
        pila = new Stack<Integer>();

    }

    public boolean estaVacia(){
        return pila.empty();
    }
    public Integer mirarelementoTop() throws Exception{
        if (pila.empty())
            throw new NullPointerException();
        else
            return pila.peek();
    }
    public Integer apilarElemento(int entero){

        return pila.push(entero);
    }

    public void vaciarPila(){
        while (!pila.isEmpty()) {
            pila.pop();
        }



    }
    public int tamaño(){
        return pila.size();
    }
    @Override
    public String toString(){
        String mensaje="";
        for(int i = pila.size()-1; i>=0; i--){
            mensaje=mensaje + pila.get(i).toString();
        }
        return mensaje;
    }






}
