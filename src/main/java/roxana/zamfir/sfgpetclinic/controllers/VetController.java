package roxana.zamfir.sfgpetclinic.controllers;

import roxana.zamfir.sfgpetclinic.fauxspring.Model;
import roxana.zamfir.sfgpetclinic.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
