package edu.drexel.model;

import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/7/13
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Publication {

    private Integer id;
    private String title;
    private String cite;
    private String slides;
    private String link;
    private String url;
    private Date pubDate;
    private String abstractText;
    private RequestError error;

    public Publication() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getCite() {
        return cite;
    }

    public void setCite(String cite) {
        this.cite = cite;
    }

    public String getSlides() {
        return slides;
    }

    public void setSlides(String slides) {
        this.slides = slides;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public RequestError getError() {
        return error;
    }

    public void setError(RequestError error) {
        this.error = error;
    }

    public String getAbstract()
    { return abstractText;}

    public void setAbstract(String abs)
    { abstractText = abs;}



}
