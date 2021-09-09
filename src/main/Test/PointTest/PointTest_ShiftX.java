package PointTest;

import com.csc205.project1.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest_ShiftX {
    @Test
    public void testing()
    {
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        b.shiftX(4);
        Assertions.assertTrue(b.getX() == 10);
    }
}
