/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.beans;

/**
 *
 * @author Administrador
 */
public class Movimiento {
    
    private Integer id;
    private String fecha;
    private TipoDocumento id_tipodocumento;
    private String nro_documento;
    private Producto id_producto;
    private Double cantidad;
    private Double precio_base;
    private Double precio_gral;
    private Double utilidad;
    private String marca;
    private Categoria id_categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public TipoDocumento getId_tipodocumento() {
        return id_tipodocumento;
    }

    public void setId_tipodocumento(TipoDocumento id_tipodocumento) {
        this.id_tipodocumento = id_tipodocumento;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(Double precio_base) {
        this.precio_base = precio_base;
    }

    public Double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Double utilidad) {
        this.utilidad = utilidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Double getPrecio_gral() {
        return precio_gral;
    }

    public void setPrecio_gral(Double precio_gral) {
        this.precio_gral = precio_gral;
    }

    public Movimiento() {
    }
    
}
