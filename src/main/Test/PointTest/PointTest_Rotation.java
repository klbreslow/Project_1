package PointTest;

import com.csc205.project1.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest_Rotation
{
    @Test
    public void testing()
    {
        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        Point p = new Point();
        p = a.rotate(Math.PI / 2.0);
        Assertions.assertTrue(p == p);
    }
}
