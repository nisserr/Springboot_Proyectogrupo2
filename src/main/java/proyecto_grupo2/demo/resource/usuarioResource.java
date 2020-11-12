package proyecto_grupo2.demo.resource;

import org.springframework.web.bind.annotation.*;
import proyecto_grupo2.demo.dao.usuarioDao;
import proyecto_grupo2.demo.dto.actualizarDto;
import proyecto_grupo2.demo.dto.usuarioDto;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class usuarioResource {

    @RequestMapping(method = RequestMethod.GET, value = "/usuario")
    public List<usuarioDto> obtenerUsuario () throws SQLException {
        List<usuarioDto> lista2 = new usuarioDao().obtenerUsuarios();
        return lista2;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/usuario{correo}")
    public void borrarUsuario(@PathVariable(name = "correo") String correo) throws SQLException {
        new usuarioDao().borrarUsuario(correo);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/usuario/")
    public void ingresoUsuario(@RequestBody usuarioDto emp ) throws SQLException {
        new usuarioDao().ingresarUsuario(emp.getNombre(), emp.getApellido(), emp.getCorreo(),emp.getFecha_nacimiento(), emp.getRegion(),emp.getComuna(), emp.getGenero(), emp.getContrasenha());
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/usuario/actualizar")
    public void actualizarCorreo(@RequestBody actualizarDto z) throws SQLException {
        new usuarioDao().actualizarCorreo(z.getCorreo(),z.getCorreo2());
    }

}
