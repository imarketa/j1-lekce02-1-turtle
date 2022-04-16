package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;
import java.lang.annotation.Native;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setPenColor(Color.magenta);


        //start přesun k domečku
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350);
        zofka.turnLeft (90);

        NakresliDomecek(zofka);

        //přesun k prasátku
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(110);
        zofka.turnLeft(90);

        NakresliPrasatko(zofka);

        //přesun k domečku II. od prasátka
        zofka.penUp();
        zofka.move(44);
        zofka.turnRight(90);
        zofka.move(220);
        zofka.turnRight(90);

        NakresliDomecek(zofka);

        //přesun k horním domečkům
        zofka.penUp();
        zofka.turnRight(95);
        zofka.move(450);
        zofka.turnLeft(125);

        for (int i = 0; 5 > i; i++) {
            MalyDomecek(zofka);
            zofka.penUp();
            zofka.turnLeft(120);
            zofka.move(250);
            zofka.turnRight(90);
            zofka.penDown();
        }

        //doplnit přesun ke sluníčku a paprsky, jméno!!

        SlunickoSpaprsky(zofka);

    }

    private void SlunickoSpaprsky(Turtle zofka) {
        Slunicko(zofka);
        for (int i = 0; 8 > i; i++) {
        Paprsek(zofka);
        zofka.turnRight(45);
        }
    }

    private void Slunicko(Turtle zofka) {
        for (int i = 0; 50 > i; i++) {
            zofka.move(6);
            zofka.turnLeft(8);
        }
        zofka.turnRight(80);
    }

    private void Paprsek(Turtle zofka) {
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(180);
    }

    private void MalyDomecek(Turtle zofka) {
        //malý domeček horní řada
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(120);
        zofka.move(80);
        zofka.turnLeft(120);
        zofka.move(80);
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
        for (int i = 0; 15 > i; i++) {
            zofka.move(4);
            zofka.turnLeft(8);
        }
        zofka.turnRight(20);

    }


    private void NakresliDomecek(Turtle zofka) {
        zofka.penDown();
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
    }
}


