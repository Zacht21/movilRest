package models;

import com.google.code.morphia.annotations.Entity;
import play.data.validation.Required;
import play.data.validation.Unique;
import play.modules.morphia.Blob;
import play.modules.morphia.Model;

import java.io.RandomAccessFile;

/**
 * Created by zacht on 16/12/14.
 */

@Entity
public class BruteForce extends Model {

    @Required
    @Unique
    public String clave;

    @Required
    @Unique
    public String nombre;

    @Required
    public RandomAccessFile tmpFile;

    public BruteForce(String clave, String nombre, RandomAccessFile tmpFile) {
        this.clave = clave;
        this.nombre = nombre;
        this.tmpFile = tmpFile;
    }
}
