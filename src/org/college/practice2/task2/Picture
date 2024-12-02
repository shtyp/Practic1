package org.college.practice2.task2;

class Picture {
    public String author;
    public String[] _colors;
    private String _name;
    private short _year;
    String _author;
    String _theme;
    String _category;

    public String[] get_colors() {
        return _colors;
    }

    private String[] colors;
    Size _size;
    boolean _isWithFrames;
    String _canvas;

    public Picture(String name, short year, String author, String theme, String category, String[] colors,
                   Size size, boolean isWithFrames, String canvas) {
        this._name = name;
        this._year = year;
        this._author = author;
        this._theme = theme;
        this._category = category;
        this._colors = colors;
        this._size = size;
        this._isWithFrames = isWithFrames;
        this._canvas = canvas;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public short getYear() {
        return _year;
    }

    public void setYear(short year) {
        this._year = year;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "name='" + _name + '\'' +
                ", year=" + _year +
                ", author='" + _author + '\'' +
                ", theme='" + _theme + '\'' +
                ", category='" + _category + '\'' +
                ", colors=" + String.join(", ", _colors) +
                ", size=" + _size.getHeight() + "x" + _size.getWidth() +
                ", isWithFrames=" + _isWithFrames +
                ", canvas='" + _canvas + '\'' +
                '}';
    }
}

