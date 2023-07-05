public class Inventory {

    //Inventory List
    private Boolean hasSword = false;
    private Boolean hasArmour = false;
    private Boolean hasHelmet = false;
    private Boolean hasCape = false;
    private Boolean hasFood = false;
    private Boolean hasBook = false;
    private Boolean hasDagger = false;
    private Boolean hasDrink = false;
    private Boolean hasBling = false;
    private Boolean hasLightArmour = false;
    private Boolean hasMediumArmour = false;
    private Boolean hasHeavyArmour = false;


    //Getters
    public Boolean getHasSword(){
        return hasSword;
    }
    public Boolean getHasArmour(){
        return hasArmour;
    }
    public Boolean getHasHelmet(){
        return hasHelmet;
    }
    public Boolean getHasCape(){
        return hasCape;
    }
    public Boolean getHasFood(){
        return hasFood;
    }
    public Boolean getHasBook(){
        return hasBook;
    }
    public Boolean getHasDagger(){
        return hasDagger;
    }
    public Boolean getHasDrink(){ return hasDrink;}
    public Boolean getHasBling(){ return hasBling;}
    public Boolean getHasLightArmour(){ return hasLightArmour;}
    public Boolean getHasMediumArmour(){ return hasMediumArmour;}
    public Boolean getHasHeavyArmour(){ return hasHeavyArmour;}

    //Setters
    public void setHasSword(Boolean setSword){
        this.hasSword = setSword;
    }
    public void setHasArmour(Boolean setArmour){
        this.hasArmour = setArmour;
    }
    public void setHasHelmet(Boolean setHelmet){
        this.hasHelmet = setHelmet;
    }
    public void setHasCape(Boolean setCape){
        this.hasCape = setCape;
    }
    public void setHasFood(Boolean setFood){
        this.hasFood = setFood;
    }
    public void setHasBook(Boolean setBook){
        this.hasBook = setBook;
    }
    public void setHasDagger(Boolean setDagger){
        this.hasDagger = setDagger;
    }
    public void setHasDrink(Boolean setDrink){this.hasDrink = setDrink;}
    public void setHasBling(Boolean setBling){this.hasBling = setBling;}
    public void setHasLightArmour(Boolean setHasLightArmour){this.hasLightArmour = setHasLightArmour;}
    public void setHasMediumArmour(Boolean setHasMediumArmour){this.hasMediumArmour = setHasMediumArmour;}
    public void setHasHeavyArmour(Boolean setHasHeavyArmour){this.hasHeavyArmour = setHasHeavyArmour;}
}
