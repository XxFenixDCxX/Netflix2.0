package es.cuatrovientos.examenev2.models;

import es.cuatrovientos.examenev2.app.MyApplication;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Film extends RealmObject {
    @PrimaryKey
    private  int id;
    private String title, description, creator, cast;
    private int imageResourceId, detailImageResourceId;
    private Boolean continueWatching, popular, myList;

    public Film(){

    }
    public Film(String title, String description, String creator, String cast, int imageResourceId, int detailImageResourceId, Boolean continueWatching, Boolean popular, Boolean myList){
        this.id = MyApplication.filmID.incrementAndGet();
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.cast = cast;
        this.imageResourceId = imageResourceId;
        this.detailImageResourceId = detailImageResourceId;
        this.continueWatching = continueWatching;
        this.popular = popular;
        this.myList = myList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getDetailImageResourceId() {
        return detailImageResourceId;
    }

    public void setDetailImageResourceId(int detailImageResourceId) {
        this.detailImageResourceId = detailImageResourceId;
    }

    public Boolean getContinueWatching() {
        return continueWatching;
    }

    public void setContinueWatching(Boolean continueWatching) {
        this.continueWatching = continueWatching;
    }

    public Boolean getPopular() {
        return popular;
    }

    public void setPopular(Boolean popular) {
        this.popular = popular;
    }

    public Boolean getMyList() {
        return myList;
    }

    public void setMyList(Boolean myList) {
        this.myList = myList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
