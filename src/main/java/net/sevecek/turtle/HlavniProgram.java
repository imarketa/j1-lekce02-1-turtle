package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        NakresliDomecek(zofka);
        NakresliPrasatko(zofka);

    }

    private void NakresliPrasatko(Turtle zofka) {

        //nakresli prasátko
        zofka.penDown();
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(60);
        zofka.penUp();
        //přesun k předním nožičkám
        zofka.turnRight(120);
        zofka.move(60);
        zofka.turnLeft(5);
        //nakresli nozicky
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(45);
        //přesun k zadním nožičkám
        zofka.turnRight(95);
        zofka.move(120);
        zofka.turnLeft(45);
        //prasátko zadní nožičky
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(35);
        //přesun k ocásku
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(90);
        zofka.penDown();
        //prasátko ocásek
        //noinspection StatementWithEmptyBody
        for (int i = 0; 20 > i; i++) {
        }
        zofka.move(5);
        zofka.turnLeft(20);
    }


    private void NakresliDomecek(Turtle zofka) {
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

        //přesun k prasátku
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(110);
        zofka.turnLeft(90);
    }
}


