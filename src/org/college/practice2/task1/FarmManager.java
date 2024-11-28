package org.college.practice2.task1;

import java.util.ArrayList;
import java.util.List;

class FarmManager {
    private List<Crop> _crops;
    private String _name;
    private String _description;
    private static FarmManager _instance;

    private FarmManager(String name) {
        this._name = name;
        this._crops = (List<Crop>) new ArrayList();
    }

    // Метод для отримання екземпляру Singleton
    public static FarmManager getInstance(String name) {
        if (_instance == null) {
            _instance = new FarmManager(name);
        }
        return _instance;
    }

    public void addCrop(Crop crop) {
        _crops.add(crop);
    }

    public boolean removeCrop(Crop crop) {
        return _crops.remove(crop);
    }

    public Crop getCrop(String name) {
        for (Crop crop : _crops) {
            if (crop.getName().equals(name)) {
                return crop;
            }
        }
        return null;
    }

    public List<Crop> getCrops() {
        return _crops;
    }

    public int getCropCount() {
        return _crops.size();
    }

    public String getName() {
        return _name;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public String getDescription() {
        return _description;
    }
}

