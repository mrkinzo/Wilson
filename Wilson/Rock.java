public class Rock {
    private String name;
    private String type;
    private Dureza dureza;
    private Site site;
    private boolean gem;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dureza getDureza() {
        return dureza;
    }

    public void setDureza(Dureza dureza) {
        this.dureza = dureza;
    }

    public Site getSite() {
        return site;
    }

    public boolean isGem() {
        return gem;
    }

    public void setGem(boolean gem) {
        this.gem = gem;
    }

    public void setSite(Site site) {
        this.site = site;
    }

}
