package com.solvd.socialNetwork.utils.xsdValidator;

import com.solvd.socialNetwork.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XsdValidator {
    private static final Logger log = LogManager.getLogger(Main.class);

    public  boolean validateXMLSchema(String xsdPath, String xmlPath){
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException e){
            log.info("Exception: "+e.getMessage());
            return false;
        }catch(SAXException e1){
            log.info("SAX Exception: "+e1.getMessage());
            return false;
        }

        return true;

    }
}
