package PointTest;
import com.csc205.project1.Point;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PointTest_Distance
{
    @Test
    public void testing()
    {
        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        Assertions.assertTrue(a.distance(b) == 5.0);
    }
}
