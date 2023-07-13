package org.example.Controlador;

import org.example.model.Record;
import org.example.servicio.RecordServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecordsControlador {
    @Autowired
    private RecordServicio servicio;

    @GetMapping("/records/index")
    public String index(Model model) {

        model.addAttribute("records", servicio.listarRecords());

        return "record/index";
    }

    @GetMapping("/records/create")
    public String create(Model model) {

        Record record = new Record();
        model.addAttribute("record", record);

        return "record/create";
    }

    @PostMapping("/records/store")
    public String store(@ModelAttribute("record") Record record) {

        servicio.agregarRecord(record);

        return "redirect:/records/index";
    }




















}
