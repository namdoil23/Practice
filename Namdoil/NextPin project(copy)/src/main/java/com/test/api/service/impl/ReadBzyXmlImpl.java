package com.test.api.service.impl;

import ch.qos.logback.classic.Logger;
import com.test.api.service.ReadBzyXml;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ReadBzyXmlImpl implements ReadBzyXml {

    private Logger logger = (Logger) LoggerFactory.getLogger(ReadBzyXmlImpl.class);
    private static Element root = null;

    @Override
    public String getKeyName(String keyName) {
        String targetValue = "";
        if(null == root) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            try {
                builder = factory.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                logger.error(e.getMessage());
            }



            try {
                ClassPathResource resource = new ClassPathResource("conf/BzyXmlConfig.xml");
                Path path = Paths.get(resource.getURI());
                File chkFile = new File(path.toFile().getAbsolutePath());
                if(chkFile.exists()) {
                    logger.debug("파일 있음 : " + chkFile.getAbsolutePath());
                }
                Document document = builder.parse(path.toFile().getAbsolutePath());
                logger.debug("BzyXml config loaded");
                root = document.getDocumentElement();
            } catch (SAXException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Element target_el = (Element) root.getElementsByTagName(keyName).item(0);
        Node target_node = target_el.getFirstChild();
        targetValue = target_node.getNodeValue();

        return targetValue;
    }
}
