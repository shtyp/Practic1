package org.college.practice2.task1;

class Crop {
    private String _name;
    private int _yearPlanted;
    private String _type;

    // Конструктор
    private Crop(String name, int yearPlanted, String type) {
        this._name = name;
        this._yearPlanted = yearPlanted;
        this._type = type;
    }

    // Методи доступу
    public String getName() {
        return _name;
    }

    public int getYearPlanted() {
        return _yearPlanted;
    }

    public String getType() {
        return _type;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "name='" + _name + '\'' +
                ", yearPlanted=" + _yearPlanted +
                ", type='" + _type + '\'' +
                '}';
    }

    public static Crop create(String name, int yearPlanted, String type) {
        return new Crop(name, yearPlanted, type);
    }
}
