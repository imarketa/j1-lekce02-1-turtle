package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350);

        zofka.setPenColor(Color.magenta);
        zofka.penDown();
        zofka.turnLeft (90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(120);
        zofka.move(150);
        zofka.turnLeft(120);
        zofka.move(150);
        zofka.penUp();

}
}


