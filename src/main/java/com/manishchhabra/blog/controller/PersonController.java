package com.manishchhabra.blog.controller;

import com.manishchhabra.blog.model.Person;
import com.manishchhabra.blog.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

@Controller    
public class PersonController {  
   
	@Autowired
	private PersonService personService;
	
    @RequestMapping(value = "/person", method = RequestMethod.GET)  
	public String getPersonList(ModelMap model) {  
        model.addAttribute("personList", personService.listPerson());  
        return "output";  
    }  
    
    @RequestMapping(value = "/person/save", method = RequestMethod.POST)
	public View createPerson(
            //@ModelAttribute Person person,
            @RequestParam("name") String name) {

        Person person = new Person(name);
        personService.addPerson(person);
    	return new RedirectView("/person");
    }

    @RequestMapping(value = "/person/delete", method = RequestMethod.GET)
	public View deletePerson(
            //@ModelAttribute Person person,
            @RequestParam ("name") String name) {

        personService.deletePerson(name);
        return new RedirectView("/person");
    }
}
