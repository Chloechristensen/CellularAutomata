package CellularAutomata.CellularAutomata;

public class CellClass {
    public int strength;
    int x;
    int y;
    int id;

    public void setStrength(int Strength){
        if(Strength > 0) {
            this.strength = Strength;
        }
        else {
            this.strength = 0;
        }
    }

    public int getStrength(){
        return this.strength;
    }

    public void setId(){
        if(id > 0){
            this.id = id;
        }
        else {
            this.id = 0;
        }
    }

    public int getId(){
        return this.id;
    }

    public void setx(){
        if(x > 0) {
            this.x = x;
        }
        else {
            this.x = 0;
        }
    }

    public int getx(){
        return this.x;
    }

    public void sety(){
        if(y > 0){
            this.y = y;
        }
        else{
            this.y = 0;
        }
    }

    public CellClass(int strength, int x, int y, int id) {
        int strength = 0;
        int id = 0;
        int x = 0;
        int y = 0;
    }

    public static void CellClass(String[] args) {
        CellClass Cas = new CellClass(setStrength(),setId(),setx(),sety());
        System.out.println(Cas);

    public void interactNeighbours(ArrayList<Cell> neighbours) {
    }
}