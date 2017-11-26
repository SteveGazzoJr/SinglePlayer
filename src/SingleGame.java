
public class SingleGame {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		final SinglePlayer PlayerOnly = SinglePlayer.GetInstance();
		
		//first, let's build a software guy!
		
		SinglePlayer.SetStrength(1);
		SinglePlayer.SetPerception(5);
		SinglePlayer.SetEndurance(3);//mentally tough, maybe not so much physically
		SinglePlayer.SetCharisma(1);
		SinglePlayer.SetIntelligence(10);
		SinglePlayer.SetAgility(1);
		SinglePlayer.SetLuck(5);
		SinglePlayer.SetHP(50);
		SinglePlayer.SetXP(10);
		
		//now, to test our singularity a bit
		@SuppressWarnings("unused")
		final SinglePlayer PlayerOther = SinglePlayer.GetInstance();
		
		System.out.println(PlayerOther.GetStrength());
		System.out.println(PlayerOther.GetPerception());
		System.out.println(PlayerOther.GetEndurance());
		System.out.println(PlayerOther.GetCharisma());
		System.out.println(PlayerOther.GetIntelligence());
		System.out.println(PlayerOther.GetAgility());
		System.out.println(PlayerOther.GetLuck());
		System.out.println(PlayerOther.GetHP());
		System.out.println(PlayerOther.GetXP());
		if (PlayerOnly == PlayerOther) {
			System.out.println("We have singularity!");
		}

	}

}
