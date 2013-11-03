package edu.drexel.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/7/13
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Publications {

    private Collection<Publication> publications = null;
    private RequestError error;

    public RequestError getError() {
        return error;
    }

    public void setError(RequestError error) {
        this.error = error;
    }

    public Collection<Publication> getPublications() {
        return publications;
    }

    public void setPublications(Collection<Publication> publications) {
        this.publications = publications;
    }
}
