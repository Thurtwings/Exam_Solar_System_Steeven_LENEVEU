package main;

import java.util.Random;

public class LanceurMeteorite
{
    public Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }



    public Meteorite LaunchMeteorite(boolean meteoriteType, String name, CorpsCeleste target)
    {
        Meteorite meteorite = new Meteorite();
        meteorite.setPosition(position);
        meteorite.setName(name);
        meteorite.setType(meteoriteType? Meteorite.meteoriteType.Normal: Meteorite.meteoriteType.TueusePlanete);
        meteorite.setVitesse(meteorite.ComputeMeteorSpeed(position, target.getPosition(), 1));
        return meteorite;
    }
    public Meteorite LaunchMeteorite(boolean meteoriteType, String name)
    {
        Meteorite meteorite = new Meteorite();
        meteorite.setName(name);
        meteorite.setPosition(position);
        meteorite.setType(meteoriteType? Meteorite.meteoriteType.Normal: Meteorite.meteoriteType.TueusePlanete);
        meteorite.setVitesse(meteorite.ComputeMeteorSpeed(position, new Position(position.getX() * -1, position.getY() * -1) , 1));
        return meteorite;
    }


}
