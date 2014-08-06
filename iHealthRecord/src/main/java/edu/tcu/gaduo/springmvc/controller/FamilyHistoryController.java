package edu.tcu.gaduo.springmvc.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.hl7.fhir.instance.model.element.resuorce.FamilyHistory;
import org.hl7.fhir.instance.model.element.resuorce.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.tcu.gaduo.springmvc.service.IService;

@Controller
@SessionAttributes(types = FamilyHistory.class)
@RequestMapping("/FamilyHistory")
public class FamilyHistoryController extends GenericController<FamilyHistory> {
	public static Logger logger = Logger.getLogger(FamilyHistoryController.class);
	private IService<FamilyHistory> service;
	
	@Autowired
    public FamilyHistoryController(IService<FamilyHistory> service) {
        this.service = service;
        super.viewPath = super.viewPath + "/FamilyHistory";
        super.routePath = "/FamilyHistory";
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
    }

    @RequestMapping(value = "/{_id}/", method = RequestMethod.GET)
    @ResponseBody
	@Override
	public FamilyHistory read(@PathVariable("_id") String _id, @RequestParam(value = "_format", required = false) String _format) { 
    	FamilyHistory resources = (FamilyHistory) service.findById(_id, FamilyHistory.class);
    	return resources;
    }
    
    @RequestMapping(value = "/{_id}/_history/{_vid}", method = RequestMethod.GET)
    @ResponseBody
	@Override
	public FamilyHistory vread(@PathVariable("_id") String _id, @PathVariable("_vid") String _vid, @RequestParam(value = "_format", required = false) String _format) { 
    	FamilyHistory resources = (FamilyHistory) service.findById(_id, FamilyHistory.class);
    	return resources;
    }

    

    @RequestMapping(value = "/update/{_id}/", method = RequestMethod.GET)
	public String update(@PathVariable("_id") String _id, Model model) { 
    	FamilyHistory resources = (FamilyHistory) service.findById(_id, FamilyHistory.class);
        model.addAttribute(resources);
		model.addAttribute("isNew", ((_id == null) ? true : false));
		return "FamilyHistory/createOrUpdate";
    }
    
    @RequestMapping(value = "/{_id}/", method = RequestMethod.PUT)
    @ResponseBody
	@Override
	public String update(@PathVariable("_id") String _id, @Valid FamilyHistory resources, @RequestParam(value = "_format", required = false) String _format, Model model, BindingResult result, SessionStatus status) { 
    	service.save(resources);
    	return "FamilyHistory/createOrUpdate";
    }

    
    @RequestMapping(value = "/{_id}/", method = RequestMethod.DELETE)
    @ResponseBody
	@Override
	public boolean delete(@PathVariable("_id") String _id, @RequestParam(value = "_format", required = false) String _format, Model model, BindingResult result, SessionStatus status) { 
    	FamilyHistory resources = (FamilyHistory) service.findById(_id, FamilyHistory.class);
    	service.delete(resources);
    	return false;
    }

    @RequestMapping(value = "/create/", method = RequestMethod.GET)
	public String create(Model model) { 
    	FamilyHistory resources = new FamilyHistory();
        model.addAttribute(resources);
		model.addAttribute("isNew", true);
		return "FamilyHistory/createOrUpdate";
    }

    @RequestMapping(value = "/{_id}/", method = RequestMethod.POST)
    @ResponseBody
	@Override
	public String create(@Valid FamilyHistory resources, @RequestParam(value = "_format", required = false) String _format, Model model, BindingResult result, SessionStatus status) {
    	System.out.println(resources.getNoteSimple());
    	service.save(resources);
    	return "FamilyHistory/createOrUpdate";
	}


    @RequestMapping(value = "/_validate/{_id}/", method = RequestMethod.GET)
    @ResponseBody
	@Override
	public FamilyHistory validate(@PathVariable("_id") String _id) {
		// TODO Auto-generated method stub
		return null;
	}

    
    @RequestMapping(value = "/{_id}/_history/", method = RequestMethod.GET)
    @ResponseBody
	public FamilyHistory history(
			@RequestParam("_id") String _id, 
			@RequestParam("_language") String _language, 
			@RequestParam("subject") Patient subject, 
			@RequestParam(value = "_format", required = false) String _format) { 
    	FamilyHistory resources = (FamilyHistory) service.findById(_id, FamilyHistory.class);
    	return resources;
    }

    @RequestMapping(value = "/_search?", method = RequestMethod.GET)
    @ResponseBody
	public FamilyHistory search(
			@RequestParam("_id") String _id, 
			@RequestParam("_language") String _language, 
			@RequestParam("subject") Patient subject) { 
    	FamilyHistory resources = (FamilyHistory) service.findById(_id, FamilyHistory.class);
    	return resources;
    }
}
