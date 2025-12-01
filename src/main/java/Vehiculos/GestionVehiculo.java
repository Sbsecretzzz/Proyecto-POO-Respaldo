/*
 * Clase de lógica para gestionar la lista de vehículos
 */
package Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class GestionVehiculo {

    private List<Vehiculo> listaVehiculos;

    public GestionVehiculo() {
        listaVehiculos = new ArrayList<>();
    }

    // Registrar nuevo vehículo
    public boolean registrar(Vehiculo v) {
        if (v == null) {
            return false;
        }
        // Evitar códigos duplicados
        Vehiculo existente = buscarPorCodigo(v.getCodigo());
        if (existente != null) {
            return false;
        }
        listaVehiculos.add(v);
        return true;
    }

    // Actualizar vehículo existente (busca por código)
    public boolean actualizar(Vehiculo v) {
        if (v == null) {
            return false;
        }
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo actual = listaVehiculos.get(i);
            if (actual.getCodigo().equalsIgnoreCase(v.getCodigo())) {
                // Reemplazamos el vehículo en esa posición
                listaVehiculos.set(i, v);
                return true;
            }
        }
        return false;
    }

    // Eliminar vehículo por código
    public boolean eliminar(String codigo) {
        Vehiculo encontrado = buscarPorCodigo(codigo);
        if (encontrado != null) {
            listaVehiculos.remove(encontrado);
            return true;
        }
        return false;
    }

    // Buscar vehículo por código (uso interno)
    private Vehiculo buscarPorCodigo(String codigo) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getCodigo().equalsIgnoreCase(codigo)) {
                return v;
            }
        }
        return null;
    }

   
   
    // al final de la clase GestionVehiculo
  public java.util.List<Vehiculo> getListaVehiculos() {
    return listaVehiculos;
}

}
