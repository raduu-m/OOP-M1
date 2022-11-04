import poo.util.ListaDeInt;

public class TesteListaDeInt{
    public static void main (String[] args){
        ListaDeInt lista= new ListaDeInt(Integer.valueOf(args[0]));
        lista.afisareElemente();
    }
}