package chapter10.foxes;

import java.awt.*;

public interface SimulatorView {
    void setColor(Class cl, Color color);
    boolean isViable(Field field);
    void showStatus(int step, Field field);
}
