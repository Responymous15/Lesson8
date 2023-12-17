public class Point {
    private int _x;
    private int _y;

    // Constructors
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

    // Getters
    public int get_x()
    {
        return _x;
    }
    public int get_y()
    {
        return _y;
    }

    // Setters
    public void set_x(int x)
    {
        _x = x;
    }
    public void set_y(int y)
    {
        _y = y;
    }

    // Methods
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

    public void move (int deltaX, int deltaY)
    {
        _x += deltaX;
        _y += deltaY;
    }
}
