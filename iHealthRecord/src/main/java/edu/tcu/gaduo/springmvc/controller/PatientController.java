package edu.tcu.gaduo.springmvc.controller;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.hl7.fhir.instance.model.DateAndTime;
import org.hl7.fhir.instance.model.element.resuorce.Patient;
import org.hl7.fhir.instance.model.element.type.Attachment;
import org.hl7.fhir.instance.model.element.type.Boolean;
import org.hl7.fhir.instance.model.element.type.CodeableConcept;
import org.hl7.fhir.instance.model.element.type.Contact;
import org.hl7.fhir.instance.model.element.type.Contact.ContactSystem;
import org.hl7.fhir.instance.model.element.type.DateTime;
import org.hl7.fhir.instance.model.element.type.Enumeration;
import org.hl7.fhir.instance.model.element.type.HumanName;
import org.hl7.fhir.instance.model.element.type.Identifier;
import org.hl7.fhir.instance.model.element.type.String_;
import org.hl7.fhir.instance.model.element.type.uri.Uri;
import org.hl7.fhir.instance.model.factory.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.tcu.gaduo.springmvc.service.IService;

@Controller
@SessionAttributes(types = Patient.class)
@RequestMapping("/Patient")
public class PatientController extends GenericController<Patient> {
	public static Logger logger = Logger.getLogger(PatientController.class);
	private IService<Patient> service;

	@Autowired
    public PatientController(IService<Patient> service) {
        this.service = service;
        super.viewPath = super.viewPath + "/Patient";
        super.routePath = "/Patient";
    }
	
    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
    }
    
    @RequestMapping(value = {"",  "/", "/index/", "/index", "/Index/", "/Index"}, method = RequestMethod.GET)
	public String index( @RequestParam(value = "_format", required = false) String _format, Model model) {        
    	List<Patient> resources = service.findAll(Patient.class);
    	if(resources != null)
    		model.addAttribute("resources", resources);
	    return viewPath + "/index";
	}
	
	
    @RequestMapping(value = "/{_id}/", method = RequestMethod.GET)
    @ResponseBody
	@Override
	public Patient read(@PathVariable("_id") String _id, @RequestParam(value = "_format", required = false) String _format) {        
    	Patient patient = service.findById(_id, Patient.class);
	    return patient;
	}

    @RequestMapping(value = "/{_id}/_history/{_vid}", method = RequestMethod.GET)
    @ResponseBody
	@Override
	public Patient vread(@PathVariable("_id") String _id, @PathVariable("_vid") String _vid, @RequestParam(value = "_format", required = false) String _format) {
		// TODO Auto-generated method stub
		return null;
	}
	

    @RequestMapping(value = {"/update/{_id}/", "/update/{_id}", "/Update/{_id}/", "/Update/{_id}"}, method = RequestMethod.GET)
	public String update(@PathVariable("_id") String _id, Model model) { 
    	Patient patient = service.findById(_id, Patient.class);
        model.addAttribute(patient);
		return viewPath + "/createOrUpdate";
    }

    @RequestMapping(value = {"/update/{_id}/", "/update/{_id}", "/Update/{_id}/", "/Update/{_id}"}, method = RequestMethod.PUT)
	@Override
	public String update(@PathVariable("_id") String _id, Patient resources, @RequestParam(value = "_format", required = false) String _format, Model model, BindingResult result, SessionStatus status) {
		return null;
	}

    @RequestMapping(value = {"/delete/{_id}/", "/delete/{_id}", "/Delete/{_id}/", "/Delete/{_id}"}, method = RequestMethod.DELETE)
    @ResponseStatus( HttpStatus.OK )
	@Override
	public boolean delete(@PathVariable("_id") String _id, @RequestParam(value = "_format", required = false) String _format, Model model, BindingResult result, SessionStatus status) {
		// TODO Auto-generated method stub
		return false;
	}
	
    @RequestMapping(value = {"/create/", "/create", "/Create/", "/Create"}, method = RequestMethod.GET)
	public String create(Model model) { 
    	Patient patient = sample();
    	
		model.addAttribute("isNew", true);
        model.addAttribute(patient);
		return viewPath + "/createOrUpdate";
    }

    @RequestMapping(value = {"/create/", "/create", "/Create/", "/Create"}, method = RequestMethod.POST)
	public String create(@Valid Patient patient, @RequestParam(value = "_format", required = false) String _format, Model model, BindingResult result, SessionStatus status) {
    	System.out.println(patient);
    	if(result.hasErrors()){
    		model.addAttribute("isNew", true);
            model.addAttribute(patient);
    		return viewPath + "/create/";
    	}else{
        	service.save(patient);
    		status.setComplete();
    		return "redirect:" + routePath + "/index/";
    	}
	}    

	@Override
	public Patient validate(String _id) {
		// TODO Auto-generated method stub
		return null;
	}
	
    
    private Patient sample(){
    	Patient patient = new Patient();
		try {
			Identifier identifier = patient.addIdentifier();
			Uri uri = Factory.newUri("urn:hapitest:mrns");
			identifier.setSystem(uri);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
//		try {
//			File file = new File("L:\\My Documents\\簡裕維重要文件\\5178062.jpg");
//			FileInputStream input = new FileInputStream(file);
//			byte[] data = IOUtils.toByteArray(input);
//			Base64Binary base64 = new Base64Binary();
//			base64.setValue(data);
			Attachment photo = patient.addPhoto();
//			photo.setData(base64);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    	
	    HumanName name = patient.addName();
	    String_ family = name.addFamily();
	    String_ given = name.addGiven();
	    family.setValue("Chien");
	    given.setValue("Gaduo");
	    
		try {
		    DateTime date = new DateTime();
			DateAndTime dt = new DateAndTime("2014-08-02");
			date.setValue(dt);
			patient.setBirthDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/**
		 * 	Include these codes as defined in http://hl7.org/fhir/v3/AdministrativeGender
			Code	Display	Definition
			F	Female	Female
			M	Male	Male
			UN	Undifferentiated	The gender of a person could not be uniquely defined as male or female, such as hermaphrodite.
		 */
		CodeableConcept codeableConcept = new CodeableConcept();
		String_ text = new String_();
		text.setValue("M");
		codeableConcept.setText(text);
	    patient.setGender(codeableConcept);
		
	    /**
	     * 	Include these codes as defined in http://hl7.org/fhir/v3/MaritalStatus
		 *	Code	Display	Definition
			A	Annulled	Marriage contract has been declared null and to not have existed
			D	Divorced	Marriage contract has been declared dissolved and inactive
			I	Interlocutory	Subject to an Interlocutory Decree.
			L	Legally Separated	
			M	Married	A current marriage contract is active
			P	Polygamous	More than 1 current spouse
			S	Never Married	No marriage contract has ever been entered
			T	Domestic partner	Person declares that a domestic partner relationship exists.
			W	Widowed	The spouse has died
	     */
		CodeableConcept ms = new CodeableConcept();
		String_ text02 = new String_();
		text.setValue("M"); //Married
		ms.setText(text02);
		patient.setMaritalStatus(ms );
		
		
		Contact tel01 = patient.addTelecom();
		tel01.setValueSimple("gaduo.fhir@gmail.com");
		tel01.setSystem(new Enumeration<Contact.ContactSystem>(ContactSystem.email));
		
    	Boolean bool = new Boolean();
    	bool.setValue(true);
    	return patient.setActive(bool);
    }
    
}
