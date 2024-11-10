package com.multiplicar.tabla_multiplicar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicacionTablaController {

    @GetMapping("/table/{number}")
    public String getMultiplicationTable(@PathVariable int number) {
        StringBuilder table = new StringBuilder("<h1>Tabla de multiplicar del " + number + ":</h1><ul>");
        for (int i = 1; i <= 10; i++) {
            table.append("<li>").append(number).append(" x ").append(i).append(" = ").append(number * i).append("</li>");
        }
        table.append("</ul>");
        return table.toString();
    }
}