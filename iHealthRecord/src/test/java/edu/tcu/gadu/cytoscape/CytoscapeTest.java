package edu.tcu.gadu.cytoscape;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class CytoscapeTest {
	Map<ResourcePOJO, ResourcePOJO[]> map = new TreeMap<ResourcePOJO, ResourcePOJO[]>();
	
	@Test
	public void test099() throws IOException{
		File file = new File("C:\\Users\\Gaduo\\Desktop\\new  772.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file))) ;
		
		String tmp = null;
		while((tmp = br.readLine()) != null){
			System.out.println("<li><a href=\"\\" + tmp + "\\\">" + tmp + "</a></li>");
		}
		
		br.close();
	}
	
	
	
//	@Before
	public void init(){

		ResourcePOJO General = new ResourcePOJO(-1, "General");
		ResourcePOJO Medications = new ResourcePOJO(-2, "Medications");
		ResourcePOJO Diagnostics = new ResourcePOJO(-3, "Diagnostics");
		ResourcePOJO DeviceInteractions = new ResourcePOJO(-4, "DeviceInteractions");
		ResourcePOJO Attribution = new ResourcePOJO(-5, "Attribution");
		ResourcePOJO Entities = new ResourcePOJO(-6, "Entities");
		ResourcePOJO WorkflowManagement = new ResourcePOJO(-7, "WorkflowManagement");
		ResourcePOJO Support = new ResourcePOJO(-8, "Support");
		ResourcePOJO DocumentHandling = new ResourcePOJO(-9, "DocumentHandling");
		ResourcePOJO Exchange = new ResourcePOJO(-10, "Exchange");
		ResourcePOJO ConformanceGroup = new ResourcePOJO(-11, "Conformance");
		
		
		ResourcePOJO AdverseReaction = new ResourcePOJO(1, "AdverseReaction", General);
		ResourcePOJO AllergyIntolerance = new ResourcePOJO(2, "AllergyIntolerance", General);
		ResourcePOJO CarePlan = new ResourcePOJO(3, "CarePlan", General);
		ResourcePOJO Condition = new ResourcePOJO(4, "Condition", General);
		ResourcePOJO FamilyHistory = new ResourcePOJO(5, "FamilyHistory", General);
		ResourcePOJO Procedure = new ResourcePOJO(6, "Procedure", General);
		ResourcePOJO Questionnaire = new ResourcePOJO(7, "Questionnaire", General);
		ResourcePOJO Medication = new ResourcePOJO(8, "Medication", Medications);
		ResourcePOJO MedicationPrescription = new ResourcePOJO(9, "MedicationPrescription", Medications);
		ResourcePOJO MedicationAdministration = new ResourcePOJO(10, "MedicationAdministration", Medications);
		ResourcePOJO MedicationDispense = new ResourcePOJO(11, "MedicationDispense", Medications);
		ResourcePOJO MedicationStatement = new ResourcePOJO(12, "MedicationStatement", Medications);
		ResourcePOJO Immunization = new ResourcePOJO(13, "Immunization", Medications);
		ResourcePOJO ImmunizationRecommendation = new ResourcePOJO(14, "ImmunizationRecommendation", Medications);
		ResourcePOJO Observation = new ResourcePOJO(15, "Observation", Diagnostics);
		ResourcePOJO DiagnosticReport = new ResourcePOJO(16, "DiagnosticReport", Diagnostics);
		ResourcePOJO DiagnosticOrder = new ResourcePOJO(17, "DiagnosticOrder", Diagnostics);
		ResourcePOJO ImagingStudy = new ResourcePOJO(18, "ImagingStudy", Diagnostics);
		ResourcePOJO Specimen = new ResourcePOJO(19, "Specimen", Diagnostics);
		ResourcePOJO DeviceObservationReport = new ResourcePOJO(20, "DeviceObservationReport", DeviceInteractions);
		ResourcePOJO Patient = new ResourcePOJO(21, "Patient", Attribution);
		ResourcePOJO RelatedPerson = new ResourcePOJO(22, "RelatedPerson", Attribution);
		ResourcePOJO Practitioner = new ResourcePOJO(23, "Practitioner", Attribution);
		ResourcePOJO Organization = new ResourcePOJO(24, "Organization", Attribution);
		ResourcePOJO Device = new ResourcePOJO(25, "Device", Entities);
		ResourcePOJO Location = new ResourcePOJO(26, "Location", Entities);
		ResourcePOJO Substance = new ResourcePOJO(27, "Substance", Entities);
		ResourcePOJO Group = new ResourcePOJO(28, "Group", Entities);
		ResourcePOJO Encounter = new ResourcePOJO(29, "Encounter", WorkflowManagement);
		ResourcePOJO Alert = new ResourcePOJO(30, "Alert", WorkflowManagement);
		ResourcePOJO Supply = new ResourcePOJO(31, "Supply", WorkflowManagement);
		ResourcePOJO Order = new ResourcePOJO(32, "Order", WorkflowManagement);
		ResourcePOJO OrderResponse = new ResourcePOJO(33, "OrderResponse", WorkflowManagement);
		ResourcePOJO List = new ResourcePOJO(34, "List", Support);
		ResourcePOJO Media = new ResourcePOJO(35, "Media", Support);
		ResourcePOJO Other = new ResourcePOJO(36, "Other", Support);
		ResourcePOJO Provenance = new ResourcePOJO(37, "Provenance", Support);
		ResourcePOJO SecurityEvent = new ResourcePOJO(38, "SecurityEvent", Support);
		

		ResourcePOJO Composition = new ResourcePOJO(39, "Composition", DocumentHandling);
		ResourcePOJO DocumentReference = new ResourcePOJO(40, "DocumentReference", DocumentHandling);
		ResourcePOJO DocumentManifest = new ResourcePOJO(41, "DocumentManifest", DocumentHandling);
		
		ResourcePOJO MessageHeader = new ResourcePOJO(42, "MessageHeader", Exchange);
		ResourcePOJO OperationOutcome = new ResourcePOJO(43, "OperationOutcome", Exchange);
		ResourcePOJO Query = new ResourcePOJO(44, "Query", Exchange);
		
		ResourcePOJO Conformance = new ResourcePOJO(45, "Conformance", ConformanceGroup);
		ResourcePOJO ValueSet = new ResourcePOJO(46, "ValueSet", ConformanceGroup);
		ResourcePOJO Profile = new ResourcePOJO(47, "Profile", ConformanceGroup);
		ResourcePOJO ConceptMap = new ResourcePOJO(48, "ConceptMap", ConformanceGroup);	
		
		map.put(General, new ResourcePOJO[]{});
		map.put(Medications, new ResourcePOJO[]{});
		map.put(Diagnostics, new ResourcePOJO[]{});
		map.put(DeviceInteractions, new ResourcePOJO[]{});
		map.put(Attribution, new ResourcePOJO[]{});
		map.put(Entities, new ResourcePOJO[]{});
		map.put(WorkflowManagement, new ResourcePOJO[]{});
		map.put(Support, new ResourcePOJO[]{});
		map.put(DocumentHandling, new ResourcePOJO[]{});
		map.put(Exchange, new ResourcePOJO[]{});
		map.put(ConformanceGroup, new ResourcePOJO[]{});
		map.put(AdverseReaction, new ResourcePOJO[]{AllergyIntolerance, Immunization, ImmunizationRecommendation, Procedure});
		map.put(AllergyIntolerance, new ResourcePOJO[]{ImmunizationRecommendation, Procedure});
		map.put(CarePlan, new ResourcePOJO[]{Procedure});
		map.put(Condition, new ResourcePOJO[]{CarePlan, MedicationPrescription,Procedure});
		map.put(FamilyHistory, new ResourcePOJO[]{Procedure});
		map.put(Procedure, new ResourcePOJO[]{CarePlan, Condition});
		map.put(Questionnaire, new ResourcePOJO[]{});
		map.put(Medication, new ResourcePOJO[]{CarePlan, Group, MedicationAdministration, MedicationDispense, MedicationPrescription, MedicationStatement, Supply});
		map.put(MedicationPrescription, new ResourcePOJO[]{CarePlan, MedicationAdministration, MedicationDispense, Procedure});
		map.put(MedicationAdministration, new ResourcePOJO[]{Condition, Procedure});
		map.put(MedicationDispense, new ResourcePOJO[]{Procedure});
		map.put(MedicationStatement, new ResourcePOJO[]{Condition, Procedure});
		map.put(Immunization, new ResourcePOJO[]{Condition, ImmunizationRecommendation, Procedure});
		map.put(ImmunizationRecommendation, new ResourcePOJO[]{Procedure});
		map.put(Observation, new ResourcePOJO[]{AllergyIntolerance, DeviceObservationReport, DiagnosticReport, Immunization, ImmunizationRecommendation, Procedure});
		map.put(DiagnosticReport, new ResourcePOJO[]{Procedure});
		map.put(DiagnosticOrder, new ResourcePOJO[]{CarePlan, DiagnosticReport, ImagingStudy});
		map.put(ImagingStudy, new ResourcePOJO[]{DiagnosticReport, Procedure});
		map.put(Specimen, new ResourcePOJO[]{DiagnosticOrder, DiagnosticReport, Media, Observation});
		map.put(DeviceObservationReport, new ResourcePOJO[]{Procedure});
		map.put(Patient, new ResourcePOJO[]{AdverseReaction, Alert, AllergyIntolerance, CarePlan, Composition, Condition, Device, DeviceObservationReport, DiagnosticOrder, DiagnosticReport, DocumentManifest, DocumentReference, Encounter, FamilyHistory, Group, ImagingStudy, Immunization, ImmunizationRecommendation, List, Media, MedicationAdministration, MedicationDispense, MedicationPrescription, MedicationStatement, Observation, Order, Other, Procedure, Questionnaire, RelatedPerson, SecurityEvent, Specimen, Supply});
		map.put(RelatedPerson, new ResourcePOJO[]{CarePlan, Composition, DocumentManifest, DocumentReference, Encounter, Other, Questionnaire});
		map.put(Practitioner, new ResourcePOJO[]{AdverseReaction, Alert, AllergyIntolerance, CarePlan, Composition, Condition, DiagnosticOrder, DiagnosticReport, DocumentManifest, DocumentReference, Encounter, Group, ImagingStudy, Immunization, List, Media, MedicationAdministration, MedicationDispense, MedicationPrescription, MessageHeader, Observation, Order, OrderResponse, Other, Patient, Procedure, Questionnaire, SecurityEvent, Specimen, Supply});
		map.put(Organization, new ResourcePOJO[]{CarePlan, Composition, Device, DiagnosticReport, DocumentManifest, DocumentReference, Encounter, Immunization, ImmunizationRecommendation, Location, Medication, MessageHeader, Observation, Order, OrderResponse, Patient, Practitioner});
		map.put(Device, new ResourcePOJO[]{Alert, Composition, DeviceObservationReport, DiagnosticOrder, DiagnosticReport, DocumentManifest, DocumentReference, Group, List, Media, MedicationAdministration, MedicationStatement, MessageHeader, Observation, Order, OrderResponse, SecurityEvent, Specimen, Supply});
		map.put(Location, new ResourcePOJO[]{CarePlan, Composition, Device, DeviceObservationReport, DiagnosticOrder, DiagnosticReport, Encounter, Immunization, List, MedicationDispense, Observation, Organization, Practitioner, Provenance, Supply});
		map.put(Substance, new ResourcePOJO[]{AdverseReaction, AllergyIntolerance, CarePlan, Group, Medication, Specimen, Supply});
		map.put(Group, new ResourcePOJO[]{Composition, DiagnosticOrder, DiagnosticReport, DocumentManifest, DocumentReference, List, Media, Observation, Specimen});
		map.put(Encounter, new ResourcePOJO[]{CarePlan, Composition, Condition, DiagnosticOrder, MedicationAdministration, MedicationPrescription, Procedure, Questionnaire});
		map.put(Alert, new ResourcePOJO[]{});
		map.put(Supply, new ResourcePOJO[]{});
		map.put(Order, new ResourcePOJO[]{OrderResponse});
		map.put(OrderResponse, new ResourcePOJO[]{});
		map.put(List, new ResourcePOJO[]{});
		map.put(Media, new ResourcePOJO[]{DiagnosticReport, DocumentManifest});
		map.put(Other, new ResourcePOJO[]{});
		map.put(DocumentReference, new ResourcePOJO[]{DocumentManifest});
		map.put(DocumentManifest, new ResourcePOJO[]{});
		map.put(Provenance, new ResourcePOJO[]{});
		map.put(SecurityEvent, new ResourcePOJO[]{});
		map.put(Composition, new ResourcePOJO[]{});
		map.put(MessageHeader, new ResourcePOJO[]{});
		map.put(OperationOutcome, new ResourcePOJO[]{MessageHeader});
		map.put(Query, new ResourcePOJO[]{});
		map.put(Conformance, new ResourcePOJO[]{});
		map.put(ValueSet, new ResourcePOJO[]{ConceptMap, Profile, Questionnaire});
		map.put(Profile, new ResourcePOJO[]{Conformance});
		map.put(ConceptMap, new ResourcePOJO[]{});

	}

//	@Test
	public void test() {
		System.out.println("\telements: {");
		System.out.println("\t\tnodes: [");

		Set<ResourcePOJO> keys = map.keySet();
		{
			Iterator<ResourcePOJO> iterator = keys.iterator();
			while(iterator.hasNext()){
				ResourcePOJO target = iterator.next();
				ResourcePOJO[] sources = map.get(target);
				float score = score(target.id, sources.length);
				String node_type;
				if(score > 0.8){
					node_type = "query";
				}else{
					node_type = "result";
				}
				System.out.println("\t\t\t{ data: { id: \"" + target.id + "\", name: \"" + target.name + "\", \"node_type\":\"" + node_type + "\", score:" + score + ", parent:" + target.getGroupId() + "  } },");
			}
		}

		System.out.println("\t\t],");
		System.out.println("\t\tedges: [");
		{
			Iterator<ResourcePOJO> iterator = keys.iterator();
			while(iterator.hasNext()){
				ResourcePOJO target = iterator.next();
				ResourcePOJO[] sources = map.get(target);
				for(ResourcePOJO s : sources){
					System.out.println("\t\t\t { data: { source: \"" + s.id + "\", target: \"" + target.id + "\" } },");
				}
			}
		}
		System.out.println("\t\t]");
		System.out.println("\t},");
	}

	public float score(int id, int number) {
		return ((float)(2 * id + 100 * number + id * number + 50));
	}


	public void test2() {
		System.out.println("{");
		System.out.println("\t\"nodes\": [");

		Set<ResourcePOJO> keys = map.keySet();
		{
			Iterator<ResourcePOJO> iterator = keys.iterator();
			while(iterator.hasNext()){
				ResourcePOJO target = iterator.next();
				ResourcePOJO[] sources = map.get(target);
				System.out.println("\t\t{ " +
							"\"id\": \"" + target.id + "\", " +
							"\"name\": \"" + target.name + "\", " +
							"\"artist\": \"" + target.group.name + "\", " +
							"\"match\": 0, " +
							"\"playcount\": " + sources.length + 
						"},");
			}
		}

		System.out.println("\t],");
		System.out.println("\t\"links\": [");
		{
			Iterator<ResourcePOJO> iterator = keys.iterator();
			while(iterator.hasNext()){
				ResourcePOJO target = iterator.next();
				ResourcePOJO[] sources = map.get(target);
				for(ResourcePOJO s : sources){
					System.out.println("\t\t { \"source\": \"" + s.id + "\", \"target\": \"" + target.id + "\" },");
				}
			}
		}
		System.out.println("\t]");
		System.out.println("}");
	}
	
//	@Test
	public void random(){
		Random ran = new Random();
		
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toHexString(ran.nextInt(255)));
		if (sb.length() < 2) {
		    sb.insert(0, '0'); // pad with leading zero if needed
		}
		String hex = sb.toString();
		
		System.out.print(hex);
	}
	
//	@Test
	public void style(){
		Random ran = new Random();
		for(int i = 10 ; i < 48+10; i++){
			StringBuilder sb = new StringBuilder();
			sb.append(Integer.toHexString(ran.nextInt(255)));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			sb.append(Integer.toHexString(ran.nextInt(255)));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			sb.append(Integer.toHexString(ran.nextInt(255)));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			
			System.out.println(".selector('edge[target = \"" + (i-9) + "\"]')");
			System.out.println(".css({");
			System.out.println("\t'line-color': '#" + sb.toString() + "'");
			System.out.println("})");
		}
		
	}
	

//	@Test
	public void style2(){
		Random ran = new Random();
		for(int i = 0 ; i < 48; i++){
			StringBuilder sb = new StringBuilder();
			sb.append(Integer.toHexString(ran.nextInt(255)));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			sb.append(Integer.toHexString(ran.nextInt(255)));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			sb.append(Integer.toHexString(ran.nextInt(255)));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}



			System.out.println("{selector: 'edge[target = \"" + (i+1) + "\"]', css:{'line-color': '#" + sb.toString() + "'}},");

			System.out.println("{selector: 'node[id = \"" + (i+1) + "\"]', css:{'background-color': '#" + sb.toString() + "', 'text-outline-color': '#" + sb.toString() + "'}},");
			
		}
	}
}
