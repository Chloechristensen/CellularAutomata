package CellularAutomata.CellularAutomata;

public class CellClass {
    private int strength = 0;
    public int x;
    public int y;
    public int id;

    public CellClass(int strength, int x, int y, int id) {
    }


    private void Strength(int strength) {
        if(strength > 0) {
            this.strength = strength;
        }
        else {
            this.strength = 0;
        }
    }

    public void setx(int x) {
        if(x > 0) {
            this.x = x;
        }
        else {
            this.x = 0;
        }
    }

    public void sety(int y) {
        this.y = 0;
    }

    public void setid(int id){
        this.id = 0;
    }

    public void interactNeighbours() {
        Array
    }

}