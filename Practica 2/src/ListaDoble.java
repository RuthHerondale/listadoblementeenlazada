import javax.swing.*;

public class ListaDoble {
    private NodoDoble inicio, fin;
    public ListaDoble(){
        inicio=fin=null;
    }

    public NodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    public NodoDoble getFin() {
        return fin;
    }

    public void setFin(NodoDoble fin) {
        this.fin = fin;
    }

    //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }

    public ListaDoble(NodoDoble inicio, NodoDoble fin) {
        this.inicio = inicio;
        this.fin = fin;

    }

    //Metodo para agregar nodos al final
    public void agregarAlFinal (int el){
        if (!estaVacia()){
            fin=new NodoDoble(el, null, fin);
            fin.anterior.siguiente=fin;
        } else{
            inicio=fin=new NodoDoble(el);
        }
    }
    // Metodo para agregar al inicio
    public void agregarAlInicio (int el){
        if (!estaVacia()){
            inicio=new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior=inicio;
        } else{
            inicio=fin=new NodoDoble(el);
        }
    }
    //metodo para mostrar la lista de inicio a fin

    public void mostrarListaInicioFin(){
        if (!estaVacia()){
            String datos="<=>";
            NodoDoble auxiliar = inicio;
            while(auxiliar!=null)
                datos = datos + "["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.siguiente;}
                JOptionPane.showMessageDialog(null, datos,
                        "Mostrando lista de Inicio a Fin",
                        JOptionPane.INFORMATION_MESSAGE);

        }
    }
    //Lista para mostrar la lista de Fin a Inicio
    public void  mostrarListaFinInicio(){
        if (!estaVacia()){
            String datos="<=>";
            NodoDoble auxiliar = fin;
            while(auxiliar!=null)
                datos = datos + "["+auxiliar.datos+"]<=>";
            auxiliar=auxiliar.anterior;}
        JOptionPane.showMessageDialog(null, datos,
                "Mostrando lista de Inicio a Fin",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
