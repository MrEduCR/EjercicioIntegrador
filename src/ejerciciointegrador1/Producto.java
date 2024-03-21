package ejerciciointegrador1;

import javax.swing.JOptionPane;

public class Producto {

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(int tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(double gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public String getCodigoSupermercado() {
        return codigoSupermercado;
    }

    public void setCodigoSupermercado(String codigoSupermercado) {
        this.codigoSupermercado = codigoSupermercado;
    }
    private String supermercado;
    private String codigoSupermercado;
    private String codigo;
    private String nombreProducto;
    private String nombreEmpleado;
    private String cedulaEmpleado;
    private int cantidad;
    private double precioBase;
    private int tipoProducto;
    private double precioBruto;
    private double gananciaEsperada;

    public Producto(String supermercado, String codigoSupermercado, String codigo, String nombreProducto, String nombreEmpleado, String cedulaEmpleado, int cantidad, double precioBase, int tipoProducto) {
        this.supermercado = supermercado;
        this.codigoSupermercado = codigoSupermercado;
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipoProducto = tipoProducto;
        String estiloProducto = " ";

        //calcular precio bruto
        if (1 == tipoProducto) {
            estiloProducto = "Alimentos";
            precioBruto = precioBase * 0.20 + precioBase;
        } else if (2 == tipoProducto) {
            estiloProducto = "Bebidas";
            precioBruto = precioBase * 0.30 + precioBase;
        } else if (3 == tipoProducto) {
            precioBruto = precioBase * 0.25 + precioBase + 500;
            estiloProducto = "Higiene";
        } else if (4 == tipoProducto) {
            estiloProducto = "Limpieza";
            precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
        } else {
            precioBruto = precioBase; // x si acaso i el tipo de producto no está definido el precio bruto será igual al precio base
        }

        //calcular la ganancia esperada
        gananciaEsperada = (precioBruto - precioBase) * cantidad;


        // mensaje asi bien ordenado
        String mensaje = "Nombre del super: " + supermercado + "\n"
                + "Codigo del super: " + codigoSupermercado + "\n"
                + "Codigo del producto: " + codigo + "\n"
                + "Nombre del producto: " + nombreProducto + "\n"
                + "Nombre del empleado que agregó el producto: " + nombreEmpleado + "\n"
                + "Cedula del empleado que agregó el producto: " + cedulaEmpleado + "\n"
                + "Cantidad de productos a ingresar: " + cantidad + "\n"
                + "Precio base del producto: " + precioBase + "\n"
                + "Tipo de producto: " + estiloProducto + "\n"
                + "Precio bruto del producto: " + precioBruto + "\n"
                + "Ganancia: " + gananciaEsperada;

        JOptionPane.showMessageDialog(null, mensaje);

    }

}
