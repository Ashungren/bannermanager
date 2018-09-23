package ru.bannermanager.repository;

import ru.bannermanager.model.Banner;

import java.util.HashMap;
import java.util.List;

public class BannerRepository implements BannerRepInterface {
    private HashMap<Integer, Banner> banners;

    public BannerRepository() {
        banners = new HashMap<>();
    }

    @Override
    public void save(Banner banner) {
        int id = banner.getId();
        banners.put(banner.getId(),banner);
    }

    @Override
    public Banner delete(int id) {
        return banners.remove(id);
    }

    @Override
    public List<Banner> sortedBannersList() {
        return null;
    }
}