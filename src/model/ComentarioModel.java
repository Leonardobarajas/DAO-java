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
public class ComentarioModel {
    private int comId;
    private String comDocumentoUsuario;
    private int comProductoId;
    private String comOpinion;

    public ComentarioModel(int comId, String comDocumentoUsuario, int comProductoId, String comOpinion) {
        this.comId = comId;
        this.comDocumentoUsuario = comDocumentoUsuario;
        this.comProductoId = comProductoId;
        this.comOpinion = comOpinion;
    }

    /**
     * @return the comId
     */
    public int getComId() {
        return comId;
    }

    /**
     * @param comId the comId to set
     */
    public void setComId(int comId) {
        this.comId = comId;
    }

    /**
     * @return the comDocumentoUsuario
     */
    public String getComDocumentoUsuario() {
        return comDocumentoUsuario;
    }

    /**
     * @param comDocumentoUsuario the comDocumentoUsuario to set
     */
    public void setComDocumentoUsuario(String comDocumentoUsuario) {
        this.comDocumentoUsuario = comDocumentoUsuario;
    }

    /**
     * @return the comProductoId
     */
    public int getComProductoId() {
        return comProductoId;
    }

    /**
     * @param comProductoId the comProductoId to set
     */
    public void setComProductoId(int comProductoId) {
        this.comProductoId = comProductoId;
    }

    /**
     * @return the comOpinion
     */
    public String getComOpinion() {
        return comOpinion;
    }

    /**
     * @param comOpinion the comOpinion to set
     */
    public void setComOpinion(String comOpinion) {
        this.comOpinion = comOpinion;
    }
    
}
