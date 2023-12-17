public class Point {
    private int _x;
    private int _y;

    public Point(int x, int y)
    {
        _x = x;
        _y = y;
    }

    public Point(Point other)
    {
        _x = other._x;
        _y = other._y;
    }

    public Point(int x)
    {
        _x = x;
    }

    public int get_x()
    {
        return _x;
    }

    public int get_y()
    {
        return _y;
    }

    public void set_x(int x)
    {
        _x = x;
    }

    public void set_y(int y)
    {
        _y = y;
    }

    public boolean equals(Point other)
    {
        if ((_x == other._x) && (_y == other._y))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
