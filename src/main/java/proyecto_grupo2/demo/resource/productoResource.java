package proyecto_grupo2.demo.resource;

import org.springframework.web.bind.annotation.*;
import proyecto_grupo2.demo.dao.productoDao;
import proyecto_grupo2.demo.dao.usuarioDao;
import proyecto_grupo2.demo.dto.Actualizardescripcion;
import proyecto_grupo2.demo.dto.actualizarDto;
import proyecto_grupo2.demo.dto.producto;
import proyecto_grupo2.demo.dto.usuarioDto;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class productoResource {

    @RequestMapping(method = RequestMethod.GET, value = "/producto")
    public List<producto> obtenerproductos () throws SQLException {
        List<producto> lista2 = new productoDao().obtenerProductos();
        return lista2;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/producto{id}")
    public void borrarProducto(@PathVariable(name = "id") int id) throws SQLException {
        new productoDao().borrarProducto(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/producto/")
    public void ingresoProducto(@RequestBody producto emp ) throws SQLException {
        new productoDao().ingresarProducto(emp.getEstado_prod(), emp.getDescripcion(), emp.getNombre_prod(), emp.getUsuario());
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/producto/actualizar")
    public void actualizarDescripcion(@RequestBody Actualizardescripcion z) throws SQLException {
        new productoDao().actualizarDescripcion(z.getId(), z.getDescripcion());
    }

}
