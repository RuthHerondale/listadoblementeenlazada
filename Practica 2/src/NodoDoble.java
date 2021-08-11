public class NodoDoble{
    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble anterior;
    /* Object valor;
        NodoDoble siguiente;
        NodoDoble anterior;
        public NodoDoble(Object valor)
        {
            this.valor = valor;
            this.siguiente = null;
        }
        public Object obtenerValor()
        {return valor;
        }
        public void enlazarSiguiente(Nodo n)
        {
            siguiente = n;
        }
        public Nodo obtenerSiguiente()
        {
            return siguiente;
        }
    }*/
   { public class NodoDoble{
       public int dato;
       NodoDoble siguiente, anterior;
       //constructor para cuando aun no hay nodos
       public NodoDoble(int el){
           this(el, null,null);
       }

       public NodoDoble getSiguiente() {
           return siguiente;
       }

       public void setSiguiente(NodoDoble siguiente) {
           this.siguiente = siguiente;
       }

       public NodoDoble getAnterior() {
           return anterior;
       }

       public void setAnterior(NodoDoble anterior) {
           this.anterior = anterior;
       }

       public int getDato() {
           return dato;
       }

       public void setDato(int dato) {
           this.dato = dato;
       }

       // constructor para cuando ya hay nodos
       public NodoDoble(int el, NodoDoble s, NodoDoble a){
           dato = el;
           siguiente =s;
           anterior =a;
       }

   }
   }
}
