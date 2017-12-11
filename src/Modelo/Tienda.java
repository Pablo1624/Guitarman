package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tienda {
    public static ArrayList<Juego> listajuegos=new ArrayList<Juego>();
    public static ArrayList<Categoria> listaCategoria=new ArrayList<Categoria>();

    public ArrayList<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
    
    public int resta(int a){
        return a-1;
    }
    
    public void agregar(Juego j){
        Juego jueg=buscar(j.getId());
        if (jueg==null) {            
            listajuegos.add(j);
        }
        else{           
            jueg.setStock(jueg.getStock()+j.getStock());

        }
    }
    
    public Juego buscar(int id){
        for (Juego list : listajuegos) {
            if (list.getId()==id) {
                return list;
            }
        }
        return null;
    }
    
    public String cambiarPrecio(int id, String nuevoPrecio){
        for (Juego list : listajuegos) {
            if (list.getId()==id) {
                String x=String.valueOf(JOptionPane.showInputDialog(null, "Ingresar Nuevo precio del juego: "));
                list.setPrecio(x);
                return x;
            }
        }
        return null;
    }

    public ArrayList<Juego> getListajuegos() {
        return listajuegos;
    }

    public void setListajuegos(ArrayList<Juego> listajuegos) {
        this.listajuegos = listajuegos;
    }
    
    public ArrayList<Juego> paso(ArrayList lisnueva){
        return lisnueva=listajuegos;
    }
    
    public Juego buscarCategoria(String Categoria){
        for (Juego list : listajuegos) {
            if (list.getCategoria().equals(Categoria)) {
                return list;
            }
        }
        return null;
    }
    
}
