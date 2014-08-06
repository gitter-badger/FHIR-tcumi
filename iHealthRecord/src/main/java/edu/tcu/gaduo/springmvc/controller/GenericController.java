package edu.tcu.gaduo.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

public abstract class GenericController<T> {
	protected String routePath = "";
	protected String viewPath = "/fhir";
	
	public abstract T read(String _id, String _format);

	public abstract T vread(String _id, String _vid, String _format);

	public abstract String update(String _id, T resources, String _format, Model model, BindingResult result, SessionStatus status);

	public abstract boolean delete(String _id, String _format, Model model, BindingResult result, SessionStatus status);

	public abstract String create(T resources, String _format, Model model, BindingResult result, SessionStatus status);

	public abstract T validate(String _id);


}
