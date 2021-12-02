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
public class ProductoModel {
    
    private int prodId;
    private int prodIdAutor;
    private String prodNombre;
    private String prodAnio;
    private int prodReproducciones;

    public ProductoModel(int prodId, int prodIdAutor, String prodNombre, String prodAnio) {
        this.prodId = prodId;
        this.prodIdAutor = prodIdAutor;
        this.prodNombre = prodNombre;
        this.prodAnio = prodAnio;
    }

    /**
     * @return the prodId
     */
    public int getProdId() {
        return prodId;
    }

    /**
     * @param prodId the prodId to set
     */
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    /**
     * @return the prodIdAutor
     */
    public int getProdIdAutor() {
        return prodIdAutor;
    }

    /**
     * @param prodIdAutor the prodIdAutor to set
     */
    public void setProdIdAutor(int prodIdAutor) {
        this.prodIdAutor = prodIdAutor;
    }

    /**
     * @return the prodNombre
     */
    public String getProdNombre() {
        return prodNombre;
    }

    /**
     * @param prodNombre the prodNombre to set
     */
    public void setProdNombre(String prodNombre) {
        this.prodNombre = prodNombre;
    }

    /**
     * @return the prodAnio
     */
    public String getProdAnio() {
        return prodAnio;
    }

    /**
     * @param prodAnio the prodAnio to set
     */
    public void setProdAnio(String prodAnio) {
        this.prodAnio = prodAnio;
    }

    /**
     * @return the prodReproducciones
     */
    public int getProdReproducciones() {
        return prodReproducciones;
    }

    /**
     * @param prodReproducciones the prodReproducciones to set
     */
    public void setProdReproducciones(int prodReproducciones) {
        this.prodReproducciones = prodReproducciones;
    }
    
    
}
