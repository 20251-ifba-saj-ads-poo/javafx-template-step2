package br.edu.ifba.saj.fwads;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.saj.fwads.model.Autor;
import br.edu.ifba.saj.fwads.model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Dados {
    public static ObservableList<Autor> listaAutores = FXCollections.observableArrayList();
    public static List<Usuario> listaUsuarios = new ArrayList<>();

    static{
        listaUsuarios.add(new Usuario(1, "admin", "admin", "admin@sistema.com"));
    }
   
}
