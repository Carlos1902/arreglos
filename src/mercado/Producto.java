
package mercado;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private int cantidad;

//constructor de la clase producto
    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }
//mÃ©todo de la clase object

    public String toString() {
        return ("Nombre: " + nombre + " Cantidad: " + cantidad);
    }

//mÃ©todos de encapsulamiento
    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int compareTo(Producto o) {
        if (o.getCantidad()>=cantidad) {
            return -1;

        } else if(o.getCantidad()<cantidad){
            return 0;
        }else{
        return 1;
        }
               
    }

}

