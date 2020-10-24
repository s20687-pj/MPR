package pl.pjatk.gameplay.model;

public class Player {
    private int id;
    String nickaname;
    int health;
    int attack;

    public Player() {
    }

    public Player(int id, String nickaname, int health, int attack) {
        this.id = id;
        this.nickaname = nickaname;
        this.health = health;
        this.attack = attack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickaname() {
        return nickaname;
    }

    public void setNickaname(String nickaname) {
        this.nickaname = nickaname;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickaname='" + nickaname + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }

}
