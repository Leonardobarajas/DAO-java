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
public class UsuarioModel {
    private String usuDocumento;
    private String usuCorreo;
    private String usuNombre;
    private String usuApellido;
    private String usuTipoDocumento;

    public UsuarioModel(String usuDocumento, String usuCorreo, String usuNombre, String usuApellido, String usuTipoDocumento) {
        this.usuDocumento = usuDocumento;
        this.usuCorreo = usuCorreo;
        this.usuNombre = usuNombre;
        this.usuApellido = usuApellido;
        this.usuTipoDocumento = usuTipoDocumento;
    }

    /**
     * @return the usuDocumento
     */
    public String getUsuDocumento() {
        return usuDocumento;
    }

    /**
     * @param usuDocumento the usuDocumento to set
     */
    public void setUsuDocumento(String usuDocumento) {
        this.usuDocumento = usuDocumento;
    }

    /**
     * @return the usuCorreo
     */
    public String getUsuCorreo() {
        return usuCorreo;
    }

    /**
     * @param usuCorreo the usuCorreo to set
     */
    public void setUsuCorreo(String usuCorreo) {
        this.usuCorreo = usuCorreo;
    }

    /**
     * @return the usuNombre
     */
    public String getUsuNombre() {
        return usuNombre;
    }

    /**
     * @param usuNombre the usuNombre to set
     */
    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    /**
     * @return the usuApellido
     */
    public String getUsuApellido() {
        return usuApellido;
    }

    /**
     * @param usuApellido the usuApellido to set
     */
    public void setUsuApellido(String usuApellido) {
        this.usuApellido = usuApellido;
    }

    /**
     * @return the usuTipoDocumento
     */
    public String getUsuTipoDocumento() {
        return usuTipoDocumento;
    }

    /**
     * @param usuTipoDocumento the usuTipoDocumento to set
     */
    public void setUsuTipoDocumento(String usuTipoDocumento) {
        this.usuTipoDocumento = usuTipoDocumento;
    }
    
}
