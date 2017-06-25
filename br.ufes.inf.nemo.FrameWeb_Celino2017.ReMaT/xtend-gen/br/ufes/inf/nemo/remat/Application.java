package br.ufes.inf.nemo.remat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Property;

import frameweb.FramewebModel;
import frameweb.FramewebProject;
import frameweb.impl.DomainAssociationImpl;
import frameweb.impl.DomainAttributeImpl;
import frameweb.impl.DomainClassImpl;
import frameweb.impl.DomainConstraintsImpl;
import frameweb.impl.DomainGeneralizationImpl;
import frameweb.impl.DomainPackageImpl;
import frameweb.impl.DomainPropertyImpl;
import frameweb.impl.EntityModelImpl;

public class Application {

	/**
	 * 
	 * @param args
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<String> parameters = new ArrayList<String>();
		Application ap = new Application();

		ap.upload();
		parameters.add(JOptionPane.showInputDialog("Driver of database?"));
		parameters.add(JOptionPane.showInputDialog("Link of database?"));
		parameters.add(JOptionPane.showInputDialog("user of database?"));
		parameters.add(JOptionPane.showInputDialog("password's user of database?"));

		// JOptionPane.showMessageDialog(null, "Você não respondeu a
		// pergunta.");

		// JOptionPane.showMessageDialog(null, "Seu nome é " + nome);

		List<EObject> lista = new ArrayList<EObject>();
		lista = new RematGenerator().generateCode(
				"/Users/danillo.celino/Documents/runtime-EclipseApplication/Reseacher/model/c2d.frameweb", parameters);
		ap.codeGenerator(lista, parameters);
	}

	public void upload() {
		String pasta = System.getProperty("user.dir") + "/model/";
		String nome = "c2d.frameweb";
		File novoArquivo = new File(pasta + nome);
		FileOutputStream saida = null;
		try {
			saida = new FileOutputStream(novoArquivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream arquivoCarregado = null;
		try {
			arquivoCarregado = new FileInputStream(
					"/Users/danillo.celino/Documents/runtime-EclipseApplication/Reseacher/model/c2d.frameweb");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		copiar(arquivoCarregado, saida);
		try {
			arquivoCarregado.close();
			saida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void copiar(InputStream origem, OutputStream destino) {
		int bite = 0;
		byte[] tamanhoMaximo = new byte[1024 * 800]; // 800KB
		try {
			// enquanto bytes forem sendo lidos
			while ((bite = origem.read(tamanhoMaximo)) >= 0) {
				// pegue o byte lido e escreva no destino
				destino.write(tamanhoMaximo, 0, bite);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "unchecked", "restriction" })
	public void codeGenerator(List<EObject> listModel, ArrayList<String> parameters) {

		ArrayList<FramewebProject> projects = new ArrayList<FramewebProject>();
		projects.addAll((Collection<? extends FramewebProject>) listModel);
		String doc = new String();
		EList<FramewebModel> models = projects.get(0).getCompose();
		String vocab = JOptionPane.showInputDialog("name of vocabulary?");

		for (int w = 0; w < models.size(); w++) {
			if (models.get(w) instanceof EntityModelImpl) {

				for (int i = 0; i < models.get(w).getPackagedElements().size(); i++) {
					if (models.get(w).getPackagedElements().get(i) instanceof DomainPackageImpl) {
						doc = "@prefix map: <" + System.getProperty("user.dir") + "/mapping-" + vocab + ".ttl"
								+ "#> .\n" + "@prefix " + vocab + ": <"
								+ JOptionPane.showInputDialog("URL of vocabulary of your model?") + "> .\n"
								+ "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
								+ "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
								+ "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
								+ "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
								+ "@prefix d2rq: <http://www.wiwiss.fu-berlin.de/suhl/bizer/D2RQ/0.1#> .\n"
								+ "@prefix dc: <http://purl.org/dc/elements/1.1/> .\n"
								+ "@prefix dcterms: <http://purl.org/dc/terms/> .\n"
								+ "@prefix foaf: <http://xmlns.com/foaf/0.1/> .\n"
								+ "@prefix skos: <http://www.w3.org/2004/02/skos/core#> .\n"
								+ "@prefix iswc: <http://annotation.semanticweb.org/iswc/iswc.daml#> .\n"
								+ "@prefix vcard: <http://www.w3.org/2001/vcard-rdf/3.0#> .\n"
								+ "@prefix jdbc: <http://d2rq.org/terms/jdbc/> .\n"
								+ "@prefix dblp: <http://dblp.uni-trier.de/rdf/schema-2015-01-26#> .\n\n"

								+ "map:database a d2rq:Database;\n" + " d2rq:jdbcDSN " + "\"" + parameters.get(1)
								+ "\";\n" + " d2rq:jdbcDriver " + "\"" + parameters.get(0) + "\";\n" + " d2rq:username "
								+ "\"" + parameters.get(2) + "\";\n" + " d2rq:password " + "\"" + parameters.get(3)
								+ "\";\n" + "jdbc:autoReconnect " + "\"" + "true" + "\";\n"
								+ "jdbc:zeroDateTimeBehavior \"convertToNull\";\n" + ".\n\n"

								+ "# Tables\n";
						DomainPackageImpl domainPackage = (DomainPackageImpl) models.get(w).getPackagedElements()
								.get(i);

						for (int j = 0; j < domainPackage.getPackagedElements().size(); j++) {
							if (domainPackage.getPackagedElements().get(j) instanceof DomainClassImpl) {
								doc = codeGeneratorClass((DomainClassImpl) domainPackage.getPackagedElements().get(j),
										doc, domainPackage, vocab);
							}
						}

					}
				}
			}
		}
		File dir = new File(System.getProperty("user.dir") + "/mapping");
		dir.mkdir();

		BufferedWriter buffWrite;
		try {

			buffWrite = new BufferedWriter(
					new FileWriter(System.getProperty("user.dir") + "/mapping/" + "mapping_" + vocab + ".ttl"));
			buffWrite.append(doc + "\n");
			buffWrite.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(doc);

	}

	@SuppressWarnings("restriction")
	public String codeGeneratorClass(DomainClassImpl domainClass, String doc, DomainPackageImpl domainPackage,
			String vocab) {
		String strClass = new String();
		if (!domainClass.isAbstract()) {
			strClass = "\n" + "map:" + domainClass.getName() + " a d2rq:ClassMap;\n"
					+ "d2rq:dataStorage map:database;\n" + "d2rq:class " + vocab + ":" + domainClass.getName() + ";\n"
					+ "d2rq:classDefinitionLabel " + "\"" + domainClass.getName() + "\";\n";
			for (int i = 0; i < domainClass.allOwnedElements().size(); i++) {

				if (domainClass.allOwnedElements().get(i) instanceof DomainGeneralizationImpl) {
					DomainGeneralizationImpl domainGeneralization = (DomainGeneralizationImpl) domainClass
							.allOwnedElements().get(i);
					for (GeneralizationSet gSet : domainGeneralization.getGeneralizationSets()) {
						strClass = strClass.concat("rdfs:subClassOf " + gSet.getPowertype().getName() + ";\n");
					}
				}

				if (domainClass.allOwnedElements().get(i) instanceof DomainPropertyImpl) {
					DomainPropertyImpl domainProperty = (DomainPropertyImpl) domainClass.allOwnedElements().get(i);
					DomainAssociationImpl domainAssociation = (DomainAssociationImpl) domainProperty.getAssociation();
					for (Element e : domainAssociation.allOwnedElements()) {
						if (e instanceof DomainConstraintsImpl) {
							DomainConstraintsImpl domainConstraints = (DomainConstraintsImpl) e;
							strClass = strClass.concat("owl:equivalentClass " + domainConstraints.getName() + ";\n");

						}

					}
				}

			}

			strClass = strClass.concat(".\n");
			DomainAttributeImpl domainAttribute;
			System.out.println(domainClass.getAllAttributes());
			for (Property p : domainClass.getAllAttributes()) {
				if (p instanceof DomainAttributeImpl) {
					domainAttribute = (DomainAttributeImpl) p;
					strClass = strClass.concat("map:" + domainClass.getName() + "_" + domainAttribute.getName()
							+ " a d2rq:PropertyBridge;\n");
					strClass = strClass.concat("d2rq:belongsToClassMap map:" + domainClass.getName() + ";\n");
					strClass = strClass.concat("d2rq:property " + vocab + ":" + domainClass.getName() + "_"
							+ domainAttribute.getName() + ";\n");
					strClass = strClass.concat("d2rq:propertyDefinitionLabel \"" + domainClass.getName() + " "
							+ domainAttribute.getName() + "\";\n");
					if (domainAttribute.getDefaultValue() != null)
						strClass = strClass.concat(
								"owl:equivalentProperty " + domainAttribute.getDefaultValue().stringValue() + ";\n");

					strClass = strClass.concat(
							"d2rq:column \"" + domainClass.getName() + "." + domainAttribute.getName() + "\";\n");
					strClass = strClass.concat(".\n");

				}
			}

			doc = doc.concat(strClass);

		}
		return doc;
	}

}
