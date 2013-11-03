package edu.drexel.services;

import edu.drexel.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.util.List;
import java.util.Collection;
import java.io.File;
import java.io.InputStream;
import org.springframework.core.io.FileSystemResource;
import javax.servlet.ServletContext;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/8/13
 * Time: 9:08 AM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class PublicationServiceImpl implements PublicationService {


    @Autowired
    ServletContext servletContext;

    @Autowired
    DbMock dbService;

    static HashMap<Integer,Publication> pubDB = null;


    public Publications getAllPubs(){

        Publications pList = new Publications();
        Collection<Publication> pubList = dbService.getAllPubs();
        if(pubList != null) {
            pList.setPublications(pubList);
        }
        else{
            RequestError requestError = new RequestError(400,
                    "Please check server logs, an unexpected error has happened");
            pList.setError(requestError);
        }

        return pList;
    }

    public Publication getPubsById(int id){

        Publication thePub = dbService.getPubById(id);
        if(thePub == null){
            RequestError requestError = new RequestError(400,
                    "The requested index "+id+" is invalid or not in range");
            thePub = new Publication();
            thePub.setError(requestError);
        }

        return thePub;
    }

    public Publications getSelectedPubs(int[] pubList){
        return null;
    }
}
