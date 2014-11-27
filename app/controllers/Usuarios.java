package controllers;

import models.Usuario;
import play.db.jpa.Model;
import play.modules.paginate.ValuePaginator;

import java.util.List;

/**
 * Created by zacht on 22/11/14.
 */

@CRUD.For(Usuario.class)
public class Usuarios extends CRUD {

    public static void list() {
        List<Usuario> usuarioList = Usuario.findAll();
        ValuePaginator usuarios = new ValuePaginator(usuarioList);
        render(usuarios);
    }

    /*public static String login(String usuario, String password){
        try {
            Usuario user = Usuario.find("usuario, password", usuario, password).first();
            return user.nombre;
        }catch (Exception e){
            render();
        }
        return
    }*/
}
