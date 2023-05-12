package main;

public class Meteorite extends CorpsCeleste
{



    public enum meteoriteType{Normal, TueusePlanete};
    private meteoriteType type;



    public meteoriteType getType() {
        return type;
    }

    public void setType(meteoriteType type) {
        this.type = type;
    }

    public Vitesse getVitesse() {
        return vitesse;
    }

    public void setVitesse(Vitesse vitesse) {
        this.vitesse = vitesse;
    }


    private Vitesse vitesse;
    private Position position;



    public Meteorite()
    {
        super();
    }

    public Vitesse ComputeMeteorSpeed(Position start, Position end, double travelTime)
    {
        double distance = Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
        double speed = distance / travelTime;
        double angle = Math.atan2(end.getY() - start.getY(), end.getX() - start.getX());
        double speedX = speed * Math.cos(angle);
        double speedY = speed * Math.sin(angle);

        return new Vitesse(speedX, speedY);
    }

    public boolean HasCollided(CorpsCeleste cc)
    {
        if(this.position == cc.getPosition()) return true;

        return false;
    }

}
