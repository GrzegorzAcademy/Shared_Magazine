package GrzegorzAcademy.sharedMagazine.company.people;

public class Clients {
    public Person personality;
    boolean isPremium = true;

    public boolean isPremium() {
        return isPremium;
    }
    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
