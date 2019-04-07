package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegisterCommand;

public class RegisterController  extends AbstractWizardFormController{

	@Override  //a11
	public ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		System.out.println("RegisterController::processFinish()");
		RegisterCommand cmd=(RegisterCommand) command;
		return new ModelAndView("result","res",cmd);  //a12
	}
	
	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

System.out.println("RegisterController.processCancel(-,-,-,-)");
return new ModelAndView("welcome");
	}

}
