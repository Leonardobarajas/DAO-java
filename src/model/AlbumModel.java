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
public class AlbumModel {
    private int albId;
    private int albProductoId;
    private String albFormato;
    private int albNumeroCanciones;

    public AlbumModel(int albId, int albProductoId, String albFormato, int albNumeroCanciones) {
        this.albId = albId;
        this.albProductoId = albProductoId;
        this.albFormato = albFormato;
        this.albNumeroCanciones = albNumeroCanciones;
    }

    /**
     * @return the albId
     */
    public int getAlbId() {
        return albId;
    }

    /**
     * @param albId the albId to set
     */
    public void setAlbId(int albId) {
        this.albId = albId;
    }

    /**
     * @return the albProductoId
     */
    public int getAlbProductoId() {
        return albProductoId;
    }

    /**
     * @param albProductoId the albProductoId to set
     */
    public void setAlbProductoId(int albProductoId) {
        this.albProductoId = albProductoId;
    }

    /**
     * @return the albFormato
     */
    public String getAlbFormato() {
        return albFormato;
    }

    /**
     * @param albFormato the albFormato to set
     */
    public void setAlbFormato(String albFormato) {
        this.albFormato = albFormato;
    }

    /**
     * @return the albNumeroCanciones
     */
    public int getAlbNumeroCanciones() {
        return albNumeroCanciones;
    }

    /**
     * @param albNumeroCanciones the albNumeroCanciones to set
     */
    public void setAlbNumeroCanciones(int albNumeroCanciones) {
        this.albNumeroCanciones = albNumeroCanciones;
    }
    
    
}
