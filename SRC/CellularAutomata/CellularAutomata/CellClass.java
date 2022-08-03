package CellularAutomata.CellularAutomata;

public class CellClass {
    public int strength;
    int x;
    int y;
    int id;

    public void setStrength(int Strength){ // methods or functions
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

    public CellClass() {
        this.strength = 0; //when you set it there are no input values becasue this is the default constructor
        this.id = 0;
        int x = 0;
        int y = 0;
    }

    public CellClass(int strength, int id, int x, int y) { // this is a constructor because it has the same name as the class
        this.strength = strength; // this one takes input values becasue it is not a default and has to take versions of the instance variables that are altered.
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public void interactNeighbours(ArrayList<Cell> neighbours) {
    }
}