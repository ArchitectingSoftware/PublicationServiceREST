package edu.drexel.services;

import edu.drexel.model.Publications;
import edu.drexel.model.Publication;

import java.util.Collection;


/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/8/13
 * Time: 9:04 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PublicationService {
    Publications getAllPubs();
    Publication getPubsById(int id);
    Publications getSelectedPubs(int[] pubList);
}
