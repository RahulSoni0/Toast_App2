package com.example.toastapp.classes;

public class GSONJugaad {
    //jo bhi data string to Json object banega woh yahan aa jayega. GSON banane wale ko pranam _/\_
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GSONJugaad(String title, String url, String source, String outletSlug) {
        this.title = title;
        this.url = url;
        this.source = source;
        this.outletSlug = outletSlug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOutletSlug() {
        return outletSlug;
    }

    public void setOutletSlug(String outletSlug) {
        this.outletSlug = outletSlug;
    }

    String title,url,source,outletSlug;
}
