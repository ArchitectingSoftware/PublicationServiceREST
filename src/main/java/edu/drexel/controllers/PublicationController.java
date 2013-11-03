package edu.drexel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/8/13
 * Time: 8:55 AM
 * To change this template use File | Settings | File Templates.
 */


import edu.drexel.model.*;
import edu.drexel.services.PublicationService;


@Controller
@RequestMapping("/publications")
public class PublicationController {

    private final PublicationService pubService;


    @Autowired
    public PublicationController (PublicationService pubService) {
        this.pubService = pubService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Publications getAllPubs() {
        //model.addAttribute("message", "Hello world!");
        return pubService.getAllPubs();
    }

    @RequestMapping(value="bar", method = RequestMethod.GET)
    public @ResponseBody
    String printWelcome2(ModelMap model) {
        model.addAttribute("message", "Hello world2!");
        return "hello2";
    }

    @RequestMapping(value="{id}", method=RequestMethod.GET)
    public @ResponseBody Publication
        getDataInJSON(@PathVariable int id)
    {
        return pubService.getPubsById(id);
    }
}
