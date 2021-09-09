package PointTest;

import com.csc205.project1.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest_ShiftY {
    @Test
    public void testing()
    {
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        b.shiftY(-2);
        Assertions.assertTrue(b.getY() == 3);
    }
}

