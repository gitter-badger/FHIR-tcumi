package edu.tcu.gaduo.springmvc.controller.administrative_entities;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.hl7.fhir.instance.model.element.Narrative;
import org.hl7.fhir.instance.model.element.Narrative.NarrativeStatus;
import org.hl7.fhir.instance.model.element.resuorce.Location;
import org.hl7.fhir.instance.model.element.resuorce.Location.LocationPositionComponent;
import org.hl7.fhir.instance.model.element.resuorce.Location.LocationStatus;
import org.hl7.fhir.instance.model.element.type.Address;
import org.hl7.fhir.instance.model.element.type.Address.AddressUse;
import org.hl7.fhir.instance.model.element.type.Code;
import org.hl7.fhir.instance.model.element.type.CodeableConcept;
import org.hl7.fhir.instance.model.element.type.Coding;
import org.hl7.fhir.instance.model.element.type.Contact;
import org.hl7.fhir.instance.model.element.type.Contact.ContactSystem;
import org.hl7.fhir.instance.model.element.type.Contact.ContactUse;
import org.hl7.fhir.instance.model.element.type.Decimal;
import org.hl7.fhir.instance.model.element.type.Enumeration;
import org.hl7.fhir.instance.model.element.type.Identifier;
import org.hl7.fhir.instance.model.element.type.ResourceReference;
import org.hl7.fhir.instance.model.element.type.String_;
import org.hl7.fhir.instance.model.element.type.uri.Uri;
import org.hl7.fhir.utilities.xhtml.XhtmlNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * 
||xml|json|
|:--|:--|:--|
|Resource|application/xml+fhir|application/json+fhir|
|Bundle|application/atom+xml|application/json+fhir|
|TagList|application/xml+fhir|application/json+fhir|
 * 
 * */

@Controller
@RequestMapping("/Location")
public class LocationController {
	public static Logger logger = Logger.getLogger(LocationController.class);

    @RequestMapping(value = "/{_id}/", method = RequestMethod.GET)
    @ResponseBody
	public Location read(@PathVariable("_id") String _id, @RequestParam(value = "_format", required = false) String _format) {   
    	
		XhtmlNode div = new XhtmlNode();
    	div.setContent("<div>Burgers UMC, South Wing, second floor</div>");
    	Narrative text = new Narrative();
    	text.setStatus(new Enumeration<Narrative.NarrativeStatus>(NarrativeStatus.generated));
    	text.setDiv(div);
    	
    	Identifier identifier = new Identifier();
    	{
	    	String_ value = new String_();
	    	value.setValue("B1-S.F2");
			identifier.setValue(value );
    	}
    	
    	String_ name = new String_();
    	name.setValue("South Wing, second floor");

		String_ description = new String_();
		description.setValue("Second floor of the Old South Wing, formerly in use by Psychiatry");
    	
    	Location location = new Location();
		location.setText(text);	
		location.setIdentifier(identifier);
		location.setName(name);
		location.setName(description);
		location.addTelecom();
		location.addTelecom();
		location.addTelecom();
		location.addTelecom();
		Contact contact_0 = location.getTelecom().get(0);
		contact_0.setSystem(new Enumeration<Contact.ContactSystem>(ContactSystem.phone));
		contact_0.setUse(new Enumeration<Contact.ContactUse>(ContactUse.work));
		{
			String_ value = new String_();
			value.setValue("2328");
			contact_0.setValue(value);
		}
		
		Contact contact_1 = location.getTelecom().get(1);
		contact_1.setSystem(new Enumeration<Contact.ContactSystem>(ContactSystem.fax));
		contact_1.setUse(new Enumeration<Contact.ContactUse>(ContactUse.work));
		{
			String_ value = new String_();
			value.setValue("2329");
			contact_1.setValue(value);
		}
		
		Contact contact_2 = location.getTelecom().get(2);
		contact_2.setSystem(new Enumeration<Contact.ContactSystem>(ContactSystem.email));
		contact_2.setUse(new Enumeration<Contact.ContactUse>(ContactUse.work));
		{
			String_ value = new String_();
			value.setValue("second wing admissions");
			contact_2.setValue(value);
		}
		
		Contact contact_3 = location.getTelecom().get(3);
		contact_3.setSystem(new Enumeration<Contact.ContactSystem>(ContactSystem.url));
		contact_3.setUse(new Enumeration<Contact.ContactUse>(ContactUse.work));
		{
			String_ value = new String_();
			value.setValue("http://sampleorg.com/southwing");
			contact_3.setValue(value);
		}
		
		Address address = new Address();
		address.setUse(new Enumeration<Address.AddressUse>(AddressUse.work));
		
		address.addLine();
		String_ line0 = address.getLine().get(0);
		line0.setValue("Galapagosweg 91, Building A");
		
		String_ city= new String_();
		city.setValue("Den Burg");
		address.setCity(city);
		
		String_ zip= new String_();
		zip.setValue("9105 PZ");
		address.setZip(zip);
		
		String_ country= new String_();
		country.setValue("9105 PZ");
		address.setCountry(country);
		
		location.setAddress(address);
		
		CodeableConcept physicalType = new CodeableConcept();
		physicalType.addCoding();
		Coding coding = physicalType.getCoding().get(0);
		Uri system = new Uri();
		system.setValue("http://hl7.org/fhir/location-physical-type");
		coding.setSystem(system);
		Code code = new Code();
		code.setValue("wi");
		coding.setCode(code);
		String_ display = new String_();
		display.setValue("Wing");
		coding.setDisplay(display);
		location.setPhysicalType(physicalType);
		
		
		LocationPositionComponent position = new LocationPositionComponent();
		Decimal longitude = new Decimal();
		longitude.setValue(new BigDecimal(4.844614000123024));
		position.setLongitude(longitude);
		
		Decimal latitude = new Decimal();
		longitude.setValue(new BigDecimal(52.37799399970903));
		position.setLatitude(latitude);
		
		Decimal altitude = new Decimal();
		altitude.setValue(new BigDecimal(0));
		position.setAltitude(altitude);
		
		location.setPosition(position );
		ResourceReference rreference = new ResourceReference();
		String_ reference = new String_();
		reference.setValue("Organization/f001");
		rreference.setReference(reference );
		location.setManagingOrganization(rreference);
		
		location.setStatus(new Enumeration<Location.LocationStatus>(LocationStatus.active));
    	
	    return location;
	}
    
    @RequestMapping(value = "/_search/", method = RequestMethod.GET)
    @ResponseBody
	public Location search(
			@RequestParam("_id") String _id,
			@RequestParam("address") Address address,
			@RequestParam("identifier") Identifier identifier,
			@RequestParam(value = "_format", required = false) String _format) {   
    	Location location = new Location();
    	
	    return location;
	}
}
