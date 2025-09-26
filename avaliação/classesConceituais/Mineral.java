package classesConceituais;

public class Mineral {
    private String name;
    private Site site;
    private String composition;
    private String brightness;
    private String color;
    private int toxicityLevel;
    private Dureza dureza;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }
    public String getComposition() {
        return composition;
    }
    public void setComposition(String composition) {
        this.composition = composition;
    }
    public String getBrightness() {
        return brightness;
    }
    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getToxicityLevel() {
        return toxicityLevel;
    }
    public void setToxicityLevel(int toxicityLevel) {
        this.toxicityLevel = toxicityLevel;
    }
    public Dureza getDureza() {
        return dureza;
    }
    public void setDureza(Dureza dureza) {
        this.dureza = dureza;
    }
   
}
