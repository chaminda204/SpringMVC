/**
 * 
 */
package com.chaminda.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.chaminda.model.Student;

/**
 * @author chaminda
 *         <p/>
 *         date 05/12/2013
 */
@Controller
@SessionAttributes
public class StudentController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "student", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@Valid Student student, BindingResult result, ModelMap model) {
		String page = null;

		if (result.hasErrors()) {
			page = "student";
		} else {
			// call the service and save the student
			model.addAttribute("firstName", student.getFirstName());
			model.addAttribute("lastName", student.getLastName());
			model.addAttribute("id", student.getId());
			page = "result";
		}

		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

}
