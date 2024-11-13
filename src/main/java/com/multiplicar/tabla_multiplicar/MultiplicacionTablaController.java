package com.multiplicar.tabla_multiplicar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplicacionTablaController {

    // Muestra el formulario inicial
    @GetMapping("/")
    public String showForm(Model model) {
        // Se inicializa con una tabla vacía
        model.addAttribute("table", "");
        return "index"; // Carga index.html
    }

    // Maneja la solicitud POST para calcular la tabla de multiplicar
    @PostMapping("/")
    public String getMultiplicationTable(@RequestParam int number, Model model) {
        StringBuilder table = new StringBuilder("<h1>Tabla de multiplicar del " + number + ":</h1><ul>");
        for (int i = 1; i <= 12; i++) {
            table.append("<li>").append(number).append(" x ").append(i).append(" = ").append(number * i).append("</li>");
        }
        table.append("</ul>");
        model.addAttribute("table", table.toString()); // Pasa la tabla generada al modelo
        return "index"; // Devuelve a la misma página
    }
}