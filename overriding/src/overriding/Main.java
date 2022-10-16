package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCrediManager[] krediManagers = new BaseCrediManager[] 
				{new OgretmenKrediManager(), new TarimCrediManager(), new OgrenciKrediManager()};
		
		for(BaseCrediManager krediManager : krediManagers) {
			
			System.out.println(krediManager.hesapla(10000));
		}

	}

}
