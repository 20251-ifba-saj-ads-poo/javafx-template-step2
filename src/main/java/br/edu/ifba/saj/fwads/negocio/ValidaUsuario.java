package br.edu.ifba.saj.fwads.negocio;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.exception.LoginInvalidoException;
import br.edu.ifba.saj.fwads.model.Usuario;

public class ValidaUsuario {


    public Usuario validaLogin(String login, String senha) throws LoginInvalidoException{
        
        for (Usuario usuario : Dados.listaUsuarios) {
            if(usuario.getLogin().equals(login)&&usuario.getSenha().equals(senha)){
                return usuario;
            }
        }

        throw new LoginInvalidoException("Não foi possível localizar o usuario "+login+", ou a senha esta errada");

    }
    
}
