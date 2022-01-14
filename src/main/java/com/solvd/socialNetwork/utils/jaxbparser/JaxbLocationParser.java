package com.solvd.socialNetwork.utils.jaxbparser;

import com.solvd.socialNetwork.Main;
import com.solvd.socialNetwork.binary.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;
import java.util.List;

public class JaxbLocationParser {
    private static final Logger log = LogManager.getLogger(Main.class);

    public void writeAXmlLocationFile(LocationList locations) throws JAXBException {

        File file = new File("src/main/resources/parsers/location.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(LocationList.class);
        Marshaller marsh = jaxbContext.createMarshaller();
        marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marsh.marshal(locations, file);
    }

    public LocationList readXmlLocationFile() throws JAXBException {
        LocationList locations;

        File file = new File("src/main/resources/parsers/location.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(LocationList.class);
        locations = (LocationList) jaxbContext.createUnmarshaller().unmarshal(file);
        return  locations;
    }
}
