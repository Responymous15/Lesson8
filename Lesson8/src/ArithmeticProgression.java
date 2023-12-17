import javax.lang.model.type.ArrayType;

public class ArithmeticProgression {
    int _firstMember;
    int _difference;

    // Constructors
    public ArithmeticProgression(int firstMember,int difference)
    {
        _firstMember = firstMember;
        _difference = difference;
    }
    public ArithmeticProgression()
    {
        _firstMember = 2;
        _difference = 2;
    }

    public ArithmeticProgression(ArithmeticProgression other)
    {
        _difference = other._difference;
        _firstMember = other._firstMember;
    }


    // Getters
    public int get_firstMember()
    {
        return _firstMember;
    }
    public int get_difference()
    {
        return _difference;
    }

    // Setters
    public void set_firstMember(int firstMember)
    {
        _firstMember = firstMember;
    }
    public void set_difference(int difference)
    {
        _difference = difference;
    }


    // Methods
    public void printGeneralSeries()
    {
        System.out.println("an = fM + (n-1) * diff");
    }
    public int memberCalculation(int n)
    {
        return (_firstMember + (n -1) * _difference);
    }
    public int calculate(int an) {
        float fM = (float) _firstMember;
        float diff = (float) _difference;
        float n = (an - fM + diff) / diff + 1;

        if (n >= 1 && n % 1 == 0)
        {
            return (int) n - 1;
        }
        else
        {
            return 0;
        }
    }

    public boolean equals(ArithmeticProgression other)
    {
        if ((_difference == other._difference) && (_firstMember == other._firstMember))
            return true;
        else
            return false;
    }

    public boolean smallDiff(ArithmeticProgression other)
    {
        if (other._difference < _difference)
            return true;
        else
            return false;
    }

}
