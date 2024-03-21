package ejerciciointegrador1;

import javax.swing.JOptionPane;

public class EjercicioIntegrador1 {

    public static void main(String[] args) {
        // solicitar al usuario la cantidad de productos que desea ingresar
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos a ingresar: "));

        // arreglo para almacenar los productos
        Producto[] productos = new Producto[cantidadProductos];

        // se itera para ingresar los datos de cada producto
        for (int i = 0; i < cantidadProductos; i++) {
            String supermercado = JOptionPane.showInputDialog("Ingrese el nombre del supermercado: ");
            String codigoSupermercado = JOptionPane.showInputDialog("Ingrese el codigo del supermercado: ");
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo de producto: ");
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del prodcucto: ");
            String nombreEmpleado = JOptionPane.showInputDialog("Ingrese su nombre (nombre de empleado): ");
            String cedulaEmpleado = JOptionPane.showInputDialog("Ingrese su cedula (cedula de empleado): ");

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto: "));
            double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base del producto: "));

            // solicitar al usuario el tipo de producto como un numero
            int tipoProducto = Integer.parseInt(JOptionPane.showInputDialog("Elija el tipo de producto:\n1- Alimentos\n2- Bebidas\n3- Higiene\n4- Limpieza"));

            // Crear el objeto Producto para almacenarlo en el arreglo
            productos[i] = new Producto(supermercado, codigoSupermercado, codigo, nombreProducto, nombreEmpleado, cedulaEmpleado, cantidad, precioBase, tipoProducto);
        }
    }
}
