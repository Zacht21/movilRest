package controllers;

import models.Usuario;
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

    public static void registrar() {
        Usuario usuario = new Usuario(
                params.get("name"),
                params.get("usuario"),
                params.get("email"),
                params.get("password")
        );
        if (usuario.validateAndSave()) {
            renderJSON(usuario);
        } else {
            renderJSON(-1);
        }
    }
}
