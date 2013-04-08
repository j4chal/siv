/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.beans;

/**
 *
 * @author Administrador
 */
public class Venta {
    
    private Integer id;
    private String nro_venta;
    private String fecha;
    private Cliente cliente;
    private Usuario vendedor;
    private Double subtotal;
    private Double igv;
    private Double descuento;
    private Double total;
    
    public Venta(){}

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nro_venta
     */
    public String getNro_venta() {
        return nro_venta;
    }

    /**
     * @param nro_venta the nro_venta to set
     */
    public void setNro_venta(String nro_venta) {
        this.nro_venta = nro_venta;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the igv
     */
    public Double getIgv() {
        return igv;
    }

    /**
     * @param igv the igv to set
     */
    public void setIgv(Double igv) {
        this.igv = igv;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the vendedor
     */
    public Usuario getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the descuento
     */
    public Double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
}
