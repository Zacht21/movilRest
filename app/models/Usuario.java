package models;

import com.google.code.morphia.annotations.Entity;
import play.data.validation.Required;
import play.modules.morphia.Model;

/**
 * Created by zacht on 22/11/14.
 */

@Entity
public class Usuario extends Model {
    @Required
    public String usuario;
    @Required
    public String nombre;
    @Required
    public String email;
    @Required
    public String password;

    public Usuario(String usuario, String nombre, String email, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }
}
