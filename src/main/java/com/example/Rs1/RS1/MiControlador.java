package com.example.Rs1.RS1;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping ("/c")
public class MiControlador {
    @GetMapping("/user/{id}/{nombre}")
    @ResponseBody
    public String Usuario(@PathVariable Map<String, String> pathVarsMap) {
        String id = pathVarsMap.get("id");
        String nombre = pathVarsMap.get("nombre");
        if (id != null && nombre != null) {
            return pathVarsMap.toString();
        } else {
            return "Sin parametros";
        }
    }
}
