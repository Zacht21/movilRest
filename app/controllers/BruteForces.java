package controllers;

import models.BruteForce;

import java.io.RandomAccessFile;

/**
 * Created by zacht on 16/12/14.
 */

@CRUD.For(BruteForce.class)
public class BruteForces extends CRUD {

    public static void ninjaStorm(){
        int i = 0;
        try {
            while (true) {
                RandomAccessFile f = new RandomAccessFile("t", "rw");
                f.setLength(1024 * 1024 * 1024);
                BruteForce bruteForce = new BruteForce(
                        "Nombre[" + i + "]", "Clave[" + i + "]", f
                );
                bruteForce.validateAndSave();
                i++;
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
