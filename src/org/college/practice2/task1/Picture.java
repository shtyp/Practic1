package org.college.practice2.task1;

public class Picture {
    private String _name;
    private short _year;
    private String _author;

    public Picture(String name, short year, String author) {
        this._name = name;
        this._year = year;
        this._author = author;
    }

    public String getName() {
        return _name;
    }

    public short getYear() {
        return _year;
    }

    public String getAuthor() {
        return _author;
    }

    public String toString() {   return "Picture{name='" + _name +  ", year=" + _year + ", author='" + _author + '\'' + '}';
    }
}
