package Modelo;

import ventanas.JFrameMENUD;
import Modelo.Tienda;

public class ProyectoFinalMain {

    public static void main(String[] args) {
        Tienda t=new Tienda();
        JFrameMENUD jfmd=new JFrameMENUD();
        t.listaCategoria.add(0, new Categoria("- Acción"));
        t.listaCategoria.add(1, new Categoria("- Aventura"));
        t.listaCategoria.add(2, new Categoria("- Deporte"));
        t.listaCategoria.add(3, new Categoria("- Mesa"));
        t.listaCategoria.add(4, new Categoria("- Habilidad"));
        t.listaCategoria.add(5, new Categoria("- Carrera"));
        t.listaCategoria.add(6, new Categoria("- Estrategia"));
        jfmd.setVisible(true);
        //menu.music();
    }
    
}
