
public class SinglePlayer {
	
	private static SinglePlayer player = null;
	private static int S=0,P=0,E=0,C=0,I=0,A=0,L=0;
	//Strength, Perception, Endurance, Charisma, Intelligence, Agility, Luck
	//Everyone is SPECIAL!
	private static int HP=0, XP=0;
	
	protected SinglePlayer() {
		// Singleton null constructor
	}
	
	public static SinglePlayer GetInstance() {
		if (player == null) {
			synchronized(SinglePlayer.class) {
			player = new SinglePlayer();
			}
		}	
		return player;
	}
	
	public static void SetStrength(int input) {
		S=input;
	}
	public static int GetStrength() {
		return S;
	}
	
	public static void SetPerception(int input) {
		P=input;
	}
	public static int GetPerception() {
		return P;
	}
	
	public static void SetEndurance(int input) {
		E=input;
	}
	public static int GetEndurance() {
		return E;
	}
	
	public static void SetCharisma(int input) {
		C=input;
	}
	public static int GetCharisma() {
		return C;
	}
	
	public static void SetIntelligence(int input) {
		I=input;
	}
	public static int GetIntelligence() {
		return I;
	}
	
	public static void SetAgility(int input) {
		A=input;
	}
	public static int GetAgility() {
		return A;
	}
	
	public static void SetLuck(int input) {
		L=input;
	}
	public static int GetLuck() {
		return L;
	}
	
	public static void SetHP(int input) {
		HP=input;
	}
	public static int GetHP() {
		return HP;
	}
	public static void SetXP(int input) {
		XP=input;
	}
	public static int GetXP() {
		return XP;
	}
}
