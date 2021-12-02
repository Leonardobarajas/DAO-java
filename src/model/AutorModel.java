/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class AutorModel {
    
    
    private int autId;
    private String autNombre;
    private String autNacionalidad;
    private int autEdad;
    
    public AutorModel(){
        this.autId = -1;
        this.autNombre = "";
        this.autNacionalidad = "";
        this.autEdad = -1;
    }

    /**
     * @return the autId
     */
    public int getAutId() {
        return autId;
    }
    /**
     * @return the autNombre
     */
    public String getAutNombre() {
        return autNombre;
    }

    /**
     * @return the autNacionalidad
     */
    public String getAutNacionalidad() {
        return autNacionalidad;
    }

    /**
     * @return the autEdad
     */
    public int getAutEdad() {
        return autEdad;
    }

    /**
     * @param autEdad the autEdad to set
     */
    public void setAutId(int autId) {
        this.autId = autId;
    }
    public void setAutEdad(int autEdad) {
        this.autEdad = autEdad;
    }

    /**
     * @param autNombre the autNombre to set
     */
    public void setAutNombre(String autNombre) {
        this.autNombre = autNombre;
    }

    /**
     * @param autNacionalidad the autNacionalidad to set
     */
    public void setAutNacionalidad(String autNacionalidad) {
        this.autNacionalidad = autNacionalidad;
    }
    
}
