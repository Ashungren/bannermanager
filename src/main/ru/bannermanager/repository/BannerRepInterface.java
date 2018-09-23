package ru.bannermanager.repository;

import ru.bannermanager.model.Banner;

import java.util.List;

public interface BannerRepInterface {

    void save(Banner banner);

    Banner delete(int id);

    List<Banner> sortedBannersList();
}