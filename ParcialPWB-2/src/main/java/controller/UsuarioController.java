package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

@Controller
public class UsuarioController {

    @GetMapping("/")
    public String mostrarPaginaInicio(@AuthenticationPrincipal Usuario usuario, Model model) {
        // Lógica para cargar vistas según el rol del usuario
    }
}
