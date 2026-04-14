package com.example.RapiPapaAPP.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tabla_ventas")

public class Venta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigoVenta;
    private String fecha;
    private Double montoTotal;
    private String metodoPago;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigoVenta() {
        return codigoVenta;
    }
    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Venta(Integer id, String codigoVenta, String fecha, Double montoTotal, String metodoPago) {
        this.id = id;
        this.codigoVenta = codigoVenta;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.metodoPago = metodoPago;
    }

    

    

}
