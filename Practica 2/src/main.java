import jdk.nashorn.internal.runtime.options.Option;

import javax.swing.*;

public class main {
    public main() {
    }

    public static void main(String args [])
    /*{
        Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("Hola");

        primer.enlazarSiguiente(segundo);
        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        System.out.println(primer
                .obtenerSiguiente()
                .obtenerSiguiente()
                .obtenerValor().toString());

    }
}*/
    {
    ListaDoble Listita=new ListaDoble();
    int opcion=0, elemento;
    do {
        try{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un Nodo al Inicio \n"
    +"2. Agregar un Nodo al Final\n"
    +"3. Mostrar la Lista de Inicio a Fin\n"
    +"4. Mostrar la Lista de fin a Inicio\n"
    +"5. Salir\n"
    +"¿Que deseas Hacer?", "Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
switch (opcion){
    case 1:
        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa el elemento del Nodo", "Agregando Nodo al Inicio", JOptionPane.INFORMATION_MESSAGE));
        Listita.agregarAlInicio(elemento);
        break;
    case 2:
        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa el elemento del Nodo", "Agregando Nodo al Final", JOptionPane.INFORMATION_MESSAGE));
        Listita.agregarAlFinal(elemento);
        break;
    case 3:
        if(!Listita.estaVacia()){
            Listita.mostrarListaInicioFin();
        }else{ JOptionPane.showMessageDialog(null, "No hay nodos aun",
                "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);}
        break;
    case 4:
        if(!Listita.estaVacia()){
            Listita.mostrarListaFinInicio();
        }else{ JOptionPane.showMessageDialog(null, "No hay nodos aun",
                "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);}
        break;
    case 5:
        break;
        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada"
        "Fin", JOptionPane.INFORMATION_MESSAGE);
        break;
    default:
        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu"
                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
}
             }
        catch(NumberFormatException n)
            JOptionPane.showMessageDialog(null, "Error "+ n.getMessage());

    }

    } while(Option!=5);


}
