//KELAS MONSTER
//Dewi Nurbuaty -- 18213039
//April 2015

public class Monster {
	//atribut yang dimiliki oleh monster
	private String namaMonster;
	private int atk; //
	private double hp; //
	private int money;
	private int posisix=0;
	private int posisiy=0;
	private int incLevel;
	
	//konsruktor
	public Monster (String namaMonster, int atk, int hp, int money, int incLevel){//,int posisix, int posisiy){
		this.namaMonster=namaMonster;
		this.atk=atk;
		this.hp=hp;
		this.money=money;
		this.incLevel=incLevel;	
		//this.posisix=posisix;
		//this.posisiy=posisiy;
	}
	
	//setter
	public void setNama(String namaMonster){
		this.namaMonster=namaMonster;
	}
	
	public void setHP(double hp){
		this.hp=hp;
	}
	
	public void setATK(int atk){
		this.atk=atk;
	}
	
	public void setMoney(int money){
		this.money=money;
	}
	
	public void setPosisix(int x){
		posisix=x;
	}
	
	public void setPosisiy(int y){
		posisiy=y;
	}
	
	//getter
	public String getNama(){
		return namaMonster;
	}
	
	public double getHP(){
		return hp;
	}
	
	public int getATK(){
		return atk;
	}
	
	public int getMoney(){
		return money;
	}
	
	public int getPosisix(){
		return posisix;
	}
	
	public int getPosisiy(){
		return posisiy;
	}
	
	public int getincLevel(){
		return incLevel;
	}
	
	public void printStatusMonster(){
		System.out.println("Nama Monster\t: " +namaMonster);
		System.out.println("ATK\t\t: "+atk);
		System.out.println("HP\t\t: "+hp);
		System.out.println("Posisi\t\t: (" +posisix+","+posisiy+")");
		System.out.println("Harga\t\t: " +money);
		System.out.println("incLevel\t: " +incLevel);
		System.out.println("\n");
	}
	
	public double turunHP(double hpberkurang){
		if (hp-hpberkurang >= 0){
			return hp-hpberkurang;
		}
		else
		{
			return 0;
		}

	}
	
	public void attackedby (Karakter K) {
		//mengurangi hp monster jika monster diserang oleh karakter
		//penguragan hp tergantung karakter yang melawannya (hero, mage, atau pirate)
		this.printStatusMonster();
		
		if (K instanceof Hero) {
			
			Hero hero = ((Hero) K);
			double atkhero = (hero.getSTR())*2; //besarnya kekuatan serangan karakter dalam mengurangi HP pemain
			this.setHP(turunHP(atkhero));	//ngeset HP monster yang baru setelah menerima serangan
			System.out.println(this.getNama()+ " diserang oleh " +hero.getNamaKarakter());
			System.out.println("HP "+this.getNama()+" berkurang sebesar " +atkhero);		
			
		}
		
		else if (K instanceof Mage) {
			Mage mage = ((Mage) K);
			double atkmage = (mage.getSTR())*2;
			this.setHP(turunHP(atkmage));
			System.out.println(this.getNama()+ " diserang oleh " +mage.getNamaKarakter());
			System.out.println("HP "+this.getNama()+" berkurang sebesar " +atkmage);			
			
		}
		
		else if (K instanceof Pirate){
			Pirate pirate = ((Pirate) K);
			double atkpirate = (pirate.getSTR())*2;
			this.setHP(turunHP(atkpirate));
			System.out.println(this.getNama()+ " diserang oleh " +pirate.getNamaKarakter());
			System.out.println("HP "+this.getNama()+" berkurang sebesar " +atkpirate);
			
		}
			
		this.printStatusMonster();
		
	}
	
	public void spelledby(Karakter K){
	//mengurangi hp monster
		if (K instanceof Hero) {
			
			Hero hero = ((Hero) K);
			double atkhero = (hero.getSTR())*2; //besarnya kekuatan serangan karakter dalam mengurangi HP pemain
			this.setHP(turunHP(atkhero));	//ngeset HP monster yang baru setelah menerima serangan
			hero.setMP((hero.getMP())-10);
			System.out.println(this.getNama()+ " disihir oleh " +hero.getNamaKarakter());
			System.out.println("HP "+this.getNama()+" berkurang sebesar " +atkhero);
			System.out.println("\n---------------------------------------------------------\n");
			
		}
		
		else if (K instanceof Mage) {
			Mage mage = ((Mage) K);
			double atkmage = (mage.getSTR())*2;
			this.setHP(turunHP(atkmage));
			mage.setMP((mage.getMP())-10);
			System.out.println(this.getNama()+ " disihir oleh " +mage.getNamaKarakter());
			System.out.println("HP "+this.getNama()+" berkurang sebesar " +atkmage);
			System.out.println("\n---------------------------------------------------------\n");			
			
		}
		
		else if (K instanceof Pirate){
			Pirate pirate = ((Pirate) K);
			double atkpirate = (pirate.getSTR())*2;
			this.setHP(turunHP(atkpirate));
			pirate.setMP((pirate.getMP())-10);
			System.out.println(this.getNama()+ " disihir oleh " +pirate.getNamaKarakter());
			System.out.println("HP "+this.getNama()+" berkurang sebesar " +atkpirate);
			System.out.println("\n---------------------------------------------------------\n");
		}
			
		this.printStatusMonster();
		
	}
	
	//public void dikasih au ah :(
	
	
	
	
	
}
