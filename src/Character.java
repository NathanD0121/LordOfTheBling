public class Character {
    //Player Character

    //Name
    private String playerName;

    //Class
    private String playerClass;
    private Boolean isMeleeSwordAndShield = false;
    private Boolean isMeleeDuelSword = false;
    private Boolean isMeleeAxe = false;
    private Boolean isMeleeSpear = false;
    private Boolean isRangerBow = false;
    private Boolean isRangerCrossbow = false;
    private Boolean isRouge = false;
    private Boolean isWizard = false;

    //Romance
    private String romanceCharacterName;

    //Getters
    public String getPlayerName(){return playerName;}
    public String getPlayerClass(){return playerClass;}
    public Boolean getIsMeleeSwordAndShield(){return isMeleeSwordAndShield;}
    public Boolean getIsMeleeDuelSword(){return isMeleeDuelSword;}
    public Boolean getIsMeleeAxe(){return isMeleeAxe;}
    public Boolean getIsMeleeSpear(){return isMeleeSpear;}
    public Boolean getIsRangerBow(){return isRangerBow;}
    public Boolean getIsRangerCrossbow(){return isRangerCrossbow;}
    public Boolean getIsRouge(){return isRouge;}
    public Boolean getIsWizard(){return isWizard;}
    public String getRomanceCharacterName(){return romanceCharacterName;}

    //Setters
    public void setPlayerName(String setName){this.playerName = setName;}
    public void setPlayerClass(String setClass){this.playerClass = setClass;}
    public void setIsMeleeSwordAndShield(Boolean setClass){this.isMeleeSwordAndShield = setClass;}
    public void setIsMeleeDuelSword(Boolean setClass){this.isMeleeDuelSword = setClass;}
    public void setIsMeleeAxe(Boolean setClass){this.isMeleeAxe = setClass;}
    public void setIsMeleeSpear(Boolean setClass){this.isMeleeSpear = setClass;}
    public void setIsRangerBow(Boolean setClass){this.isRangerBow = setClass;}
    public void setIsRangerCrossbow(Boolean setClass){this.isRangerCrossbow = setClass;}
    public void setIsRouge(Boolean setClass){this.isRouge = setClass;}
    public void setIsWizard(Boolean setClass){this.isWizard = setClass;}
    public void setRomanceCharacterName(String setRomance){this.romanceCharacterName = setRomance;}
}
