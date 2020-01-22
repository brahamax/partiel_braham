package metier;

public class Cours {
private String theme;
private int nbrheures;
public Cours(String theme, int nbrheures) {
	super();
	this.theme = theme;
	this.nbrheures = nbrheures;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
public int getNbrheures() {
	return nbrheures;
}
public void setNbrheures(int nbrheures) {
	this.nbrheures = nbrheures;
}
@Override
public String toString() {
	return "Cours [theme=" + theme + ", nbrheures=" + nbrheures + "]";
}


}
