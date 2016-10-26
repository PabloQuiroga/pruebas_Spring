package controlador;

import org.springframework.stereotype.Controller;

import formulario.UsuarioForm;

@Controller
public class UsuarioController {

	private static UsuarioForm userForm = new UsuarioForm("Pablo", "1234");
}
