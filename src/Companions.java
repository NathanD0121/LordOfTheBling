public class Companions {

    //Characters
    //1 - Player (Human), 2 - Dumbledore the Grey (Human Wizard), 3 - Armulas (Elf Ranger), 4 - Varic (Dwarf Melee Axe), 5 - Lydia (Human Rouge), 6 - Fengir (Elf Melee 2 Swords), 7- Cirilla (Human Melee Sword + Shield)

    private String companionName;
    private String companionClass;
    private String companionRace;
    private int companionPlayerOpinion = 0;
    private int opinionDumbledore;
    private int opinionArmulas;
    private int opinionVaric;
    private int opinionLydia;
    private int opinionFengir;
    private int opinionCirilla;

    //Could use something like this
    private Object DumbledoreTheGrey() {
        companionName = "Dumbledore the Grey";
        companionClass = "Wizard";
        companionRace = "Human";
        companionPlayerOpinion = 2;

        return DumbledoreTheGrey();
    }

    public int getOpinionDumbledore(){return opinionDumbledore;}
    public int getOpinionArmulas(){return opinionArmulas;}
    public int getOpinionVaric(){return opinionVaric;}
    public int getOpinionLydia(){return opinionLydia;}
    public int getOpinionFengir(){return opinionFengir;}
    public int getOpinionCirilla(){return opinionCirilla;}

    public void setOpinionDumbledore(int setOpinion){this.opinionDumbledore = setOpinion;}
    public void setOpinionArmulas(int setOpinion){this.opinionArmulas = setOpinion;}
    public void setOpinionVaric(int setOpinion){this.opinionVaric = setOpinion;}
    public void setOpinionLydia(int setOpinion){this.opinionLydia = setOpinion;}
    public void setOpinionFengir(int setOpinion){this.opinionFengir = setOpinion;}
    public void setOpinionCirilla(int setOpinion){this.opinionCirilla = setOpinion;}
}
