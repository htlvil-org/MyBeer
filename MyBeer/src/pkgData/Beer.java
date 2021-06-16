package pkgData;

public class Beer {
	private String nameBeer;
	private int quality;
	public String getNameBeer() {
		return nameBeer;
	}
	public void setNameBeer(String nameBeer) {
		this.nameBeer = nameBeer;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public Beer(String nameBeer, int quality) {
		super();
		this.nameBeer = nameBeer;
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Beer [nameBeer=" + nameBeer + ", quality=" + quality + "]";
	}
	
}
