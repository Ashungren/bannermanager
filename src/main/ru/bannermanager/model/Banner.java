package ru.bannermanager.model;

import java.util.List;

public class Banner {
    private int id;
    private String imgSrc; // путь до файла с изображением
    private int width; // ширина изображения
    private int height; // высота изображения
    private String targetUrl; // целевая ссылка
    private int langId; // идентификатор локали в системе
    private List<String>history;

    public Banner(int id, String imgSrc, int width, int height, String targetUrl, int langId) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.width = width;
        this.height = height;
        this.targetUrl = targetUrl;
        this.langId = langId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public int getLangId() {
        return langId;
    }

    public void setLangId(int langId) {
        this.langId = langId;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }
}