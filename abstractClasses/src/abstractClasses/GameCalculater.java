package abstractClasses;

public abstract class GameCalculater {
	
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun sona erdi!");
	}

}

//abstract kullandigimiz zaman hesapla fonksiyonunu icermek ve override etmek zorunda!