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

    public static void blank(){
        Usuario usuario = new Usuario("qwe", "qwe", "qwe@qwe.com", "qwe");
        usuario.validateAndSave();
        render();
    }

    public static void usersJson(String id){
        try {
            Usuario user = Usuario.find("usuario", id).first();
            if (user.equals(null)){
                notFound();
            }
            renderJSON(user);
        }catch (Exception e){
            notFound();
        }
    }
}
