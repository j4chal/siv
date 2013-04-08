/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.beans;

import org.springframework.stereotype.Service;

/**
 *
 * @author willian
 */
@Service
public class Producto {
    
    private Integer id;
    private String nombre;
    private Categoria categoria;
    private String estado;
    private String marca;
    private String unidad_medida;
    private double stock;
    private double precio_base;
    private double precio_gral;
    private double ganancia;
    
    public Producto(){}

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio_base
     */
    public double getPrecio_base() {
        return precio_base;
    }

    /**
     * @param precio_base the precio_base to set
     */
    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    /**
     * @return the ganancia
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * @param ganancia the ganancia to set
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * @return the unidad_medida
     */
    public String getUnidad_medida() {
        return unidad_medida;
    }

    /**
     * @param unidad_medida the unidad_medida to set
     */
    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    /**
     * @return the activo
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param activo the activo to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the stock
     */
    public double getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(double stock) {
        this.stock = stock;
    }

    /**
     * @return the precio_gral
     */
    public double getPrecio_gral() {
        return precio_gral;
    }

    /**
     * @param precio_gral the precio_gral to set
     */
    public void setPrecio_gral(double precio_gral) {
        this.precio_gral = precio_gral;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
