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
public class CancionModel {
    private int canId;
    private int canProductoId;
    private int canDuracion;
    private String canGenero;

    public CancionModel(int canId, int canProductoId, int canDuracion, String canGenero) {
        this.canId = canId;
        this.canProductoId = canProductoId;
        this.canDuracion = canDuracion;
        this.canGenero = canGenero;
    }

    /**
     * @return the canId
     */
    public int getCanId() {
        return canId;
    }

    /**
     * @param canId the canId to set
     */
    public void setCanId(int canId) {
        this.canId = canId;
    }

    /**
     * @return the canProductoId
     */
    public int getCanProductoId() {
        return canProductoId;
    }

    /**
     * @param canProductoId the canProductoId to set
     */
    public void setCanProductoId(int canProductoId) {
        this.canProductoId = canProductoId;
    }

    /**
     * @return the canDuracion
     */
    public int getCanDuracion() {
        return canDuracion;
    }

    /**
     * @param canDuracion the canDuracion to set
     */
    public void setCanDuracion(int canDuracion) {
        this.canDuracion = canDuracion;
    }

    /**
     * @return the canGenero
     */
    public String getCanGenero() {
        return canGenero;
    }

    /**
     * @param canGenero the canGenero to set
     */
    public void setCanGenero(String canGenero) {
        this.canGenero = canGenero;
    }
    
    
    
}
