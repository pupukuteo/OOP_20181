package btl.oop.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.TreeModel;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.QueryEvaluationException;
import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;

import btl.oop.entity.Country;
import btl.oop.entity.Event;
import btl.oop.entity.Location;
import btl.oop.entity.Organization;
import btl.oop.entity.Person;
import btl.oop.entity.Relationship;
import btl.oop.genentity.GenGeneral;

public class ExecuteQuery {
	private static int i = 1;
	private static String namespace = "http://google.com/";
	private static ValueFactory vf = ConnectDatabase.conn.getValueFactory();	
	// add Entity vào cơ sở dữ liệu
	public static void addEntityRelationship(){
		// Thêm p1 và p2 vào CSDL
		for(Person p : GenGeneral.listPerson){
            add(p);
        }
		for(Country c : GenGeneral.listCountry){
			add(c);
		}
		for(Event e : GenGeneral.listEvent){
			add(e);
		}
		for(Location l : GenGeneral.listLocation){
			add(l);
		}
		for(Organization o : GenGeneral.listOrganization){
			add(o);
		}
		for(Relationship r : GenGeneral.listRelationship){
			add(r);
		}
	}
	public static void add(Person p){
		// tạo S
		IRI person = vf.createIRI(namespace, p.getId());		
		// tạo các P
		IRI id = vf.createIRI(namespace, "id");
		IRI name = vf.createIRI(namespace, "name");
		IRI description = vf.createIRI(namespace, "description");
		IRI source = vf.createIRI(namespace, "source");
		IRI job = vf.createIRI(namespace, "job");		
		//tạo O
		Literal ID = vf.createLiteral(p.getId());
		Literal NAME = vf.createLiteral(p.getName());
		Literal DESCRIPTION = vf.createLiteral(p.getDescription());
		Literal SOURCE = vf.createLiteral(p.getSourceExtracted().toString());
		Literal JOB = vf.createLiteral(p.getJob());
		//Sinh Model
		Model model = new TreeModel();	
		model.add(person, id, ID);
		model.add(person,  name, NAME);
		model.add(person, description, DESCRIPTION);
		model.add(person, source, SOURCE);
		model.add(person, job, JOB);
		// add Model vào cơ sở dữ liệu
		ConnectDatabase.conn.add(model);
		
			
	}
	
	public static void add(Country c){		
		IRI country = vf.createIRI(namespace, c.getId());
		
		IRI id = vf.createIRI(namespace, "id");
		IRI name = vf.createIRI(namespace, "name");
		IRI description = vf.createIRI(namespace, "description");
		IRI source = vf.createIRI(namespace, "source");
		IRI continent = vf.createIRI(namespace, "continent");
		
		Literal ID = vf.createLiteral(c.getId());
		Literal NAME = vf.createLiteral(c.getName());
		Literal DESCRIPTION = vf.createLiteral(c.getDescription());
		Literal SOURCE = vf.createLiteral(c.getSourceExtracted().toString());
		Literal CONTINENT = vf.createLiteral(c.getContinent());	
		
		Model model = new TreeModel();	
		model.add(country, id, ID);
		model.add(country,  name, NAME);
		model.add(country, description, DESCRIPTION);
		model.add(country, source, SOURCE);
		model.add(country, continent, CONTINENT);
	    
		ConnectDatabase.conn.add(model);
		
		
	}
	public static void add(Event e){
		IRI event = vf.createIRI(namespace, e.getId());
		
		IRI id = vf.createIRI(namespace, "id");
		IRI name = vf.createIRI(namespace, "name");
		IRI description = vf.createIRI(namespace, "description");
		IRI source  = vf.createIRI(namespace, "source");
		
		Literal ID = vf.createLiteral(e.getId());
		Literal NAME = vf.createLiteral(e.getName());
		Literal DESCRIPTION  = vf.createLiteral(e.getDescription());
		Literal SOURCE = vf.createLiteral(e.getSourceExtracted().toString());
		
		Model model = new TreeModel();
		
		model.add(event, id, ID);
		model.add(event, name, NAME);
		model.add(event, description, DESCRIPTION);
		model.add(event, source, SOURCE);
		
		ConnectDatabase.conn.add(model);
		
		
		
	}
	public static void add(Location l){
		IRI location = vf.createIRI(namespace, l.getId());
		
		IRI id = vf.createIRI(namespace, "id");
		IRI name = vf.createIRI(namespace, "name");
		IRI description = vf.createIRI(namespace, "description");
		IRI source = vf.createIRI(namespace, "source");
		
		Literal ID = vf.createLiteral(l.getId());
		Literal NAME = vf.createLiteral(l.getName());
		Literal DESCRIPTION = vf.createLiteral(l.getDescription());
		Literal SOURCE = vf.createLiteral(l.getSourceExtracted().toString());
		
		Model model = new TreeModel();
		
		model.add(location, id, ID);
		model.add(location, name, NAME);
		model.add(location, description, DESCRIPTION);
		model.add(location, source, SOURCE);
		
		ConnectDatabase.conn.add(model);
	}
	public static void add(Organization o){
		IRI organization = vf.createIRI(namespace, o.getId());
		
		IRI id = vf.createIRI(namespace, "id");
		IRI name = vf.createIRI(namespace, "name");
		IRI description = vf.createIRI(namespace, "description");
		IRI source = vf.createIRI(namespace, "source");
		IRI headOffice = vf.createIRI(namespace, "headOffice");
		
		Literal ID = vf.createLiteral(o.getId());
		Literal NAME = vf.createLiteral(o.getName());
		Literal DESCRIPTION = vf.createLiteral(o.getDescription());
		Literal SOURCE = vf.createLiteral(o.getSourceExtracted().toString());
		Literal HEADOFFICE = vf.createLiteral(o.getHeadOffice());
		
		Model model = new TreeModel();
		
		model.add(organization, id, ID);
		model.add(organization, name, NAME);
		model.add(organization, description, DESCRIPTION);
		model.add(organization, source, SOURCE);
		model.add(organization, headOffice, HEADOFFICE);
		
		ConnectDatabase.conn.add(model);
	}
	public static void add(Relationship r){
		IRI relationship = vf.createIRI(namespace, "relationship" + i);
		i++;
		
		IRI entity1 = vf.createIRI(namespace, "entity1");
		IRI nameRelationship = vf.createIRI(namespace, "nameRelationship");
		IRI entity2 = vf.createIRI(namespace, "entity2");
		IRI time = vf.createIRI(namespace, "time");
		
		Literal ENTITY1 = vf.createLiteral(r.getEntity1().getId());
		Literal NAMERELATIONSHIP = vf.createLiteral(r.getNameRelationship());
		Literal ENTITY2 = vf.createLiteral(r.getEntity2().getId());
		Literal TIME = vf.createLiteral(r.getTime());
		
		Model model = new TreeModel();
		
		model.add(relationship, entity1, ENTITY1);
		model.add(relationship, nameRelationship, NAMERELATIONSHIP);
		model.add(relationship, entity2, ENTITY2);
		model.add(relationship, time, TIME);
		
		
		ConnectDatabase.conn.add(model);
		
	}
	
	public static void executeQuery(String query){
		TupleQuery tupleQuery = ConnectDatabase.conn.prepareTupleQuery(QueryLanguage.SPARQL, query);
	    try {
	    	long startTime = System.currentTimeMillis();
			TupleQueryResult result = tupleQuery.evaluate();
			long time = System.currentTimeMillis() - startTime;
			while (result.hasNext()) {
		    	   BindingSet bindingSet = result.next();
		    	   Value v = bindingSet.getValue("o");
		    	   Value s = bindingSet.getValue("s");
		    	   if(s != null){
		    		   System.out.println(s.stringValue());
		    	   }
		    	   System.out.print(v.stringValue());
		    	   System.out.println();
			}
			System.out.println("Thời gian thực thi câu truy vấn là: " + time + " ms");
	    }catch (QueryEvaluationException e) {			
			e.printStackTrace();
	    } 
	}
}
