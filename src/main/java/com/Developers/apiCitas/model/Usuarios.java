package com.Developers.apiCitas.model;

import jakarta.persistence.*;
import org.springframework.scheduling.config.DelayedTask;

import java.math.BigInteger;

@Entity
@Table(name = "USUARIOS")
public class Usuarios  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String NOMBRE;
    private String APELLIDO_PATERNOAPELLIDO_MATERNO;
    private String TELEFONO_PERSONAL;
    private String NUMERO_EMERGENCIAS;
    private int TIPO_USUARIO;
    private int DELETED;
    private int ESTATUS_USUARIO;
    private String EDAD;

    public String getAPELLIDO_PATERNOAPELLIDO_MATERNO() {
        return APELLIDO_PATERNOAPELLIDO_MATERNO;
    }

    public void setAPELLIDO_PATERNOAPELLIDO_MATERNO(String APELLIDO_PATERNOAPELLIDO_MATERNO) {
        this.APELLIDO_PATERNOAPELLIDO_MATERNO = APELLIDO_PATERNOAPELLIDO_MATERNO;
    }

    public int getDELETED() {
        return DELETED;
    }

    public void setDELETED(int DELETED) {
        this.DELETED = DELETED;
    }

    public String getEDAD() {
        return EDAD;
    }

    public void setEDAD(String EDAD) {
        this.EDAD = EDAD;
    }

    public int getESTATUS_USUARIO() {
        return ESTATUS_USUARIO;
    }

    public void setESTATUS_USUARIO(int ESTATUS_USUARIO) {
        this.ESTATUS_USUARIO = ESTATUS_USUARIO;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getNUMERO_EMERGENCIAS() {
        return NUMERO_EMERGENCIAS;
    }

    public void setNUMERO_EMERGENCIAS(String NUMERO_EMERGENCIAS) {
        this.NUMERO_EMERGENCIAS = NUMERO_EMERGENCIAS;
    }

    public String getTELEFONO_PERSONAL() {
        return TELEFONO_PERSONAL;
    }

    public void setTELEFONO_PERSONAL(String TELEFONO_PERSONAL) {
        this.TELEFONO_PERSONAL = TELEFONO_PERSONAL;
    }

    public int getTIPO_USUARIO() {
        return TIPO_USUARIO;
    }

    public void setTIPO_USUARIO(int TIPO_USUARIO) {
        this.TIPO_USUARIO = TIPO_USUARIO;
    }
}
