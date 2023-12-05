package endterm;
import java.util.*;

public class RuntimePoly {
	public static void main(String[] args)
	{
	Vector <SampleAccount> users = new Vector<SampleAccount>();
	Account Arlan = new Account("Arlan@gmail.com", "Stebas1458522");
	Account Nikita = new Account("Nikita@gmail.com", "Asdgft154845341");
	SampleAccount Aidos = new SampleAccount("Aidos@gmail.com", "Asdafsfsadafs", "AidosHuesos");
	SampleAccount Stas = new SampleAccount("Stas@gmail.com", "Swer_456_Krut", "CTACNK");
	SampleAccount Aral = new SampleAccount("Aral@gmail.com", "MegAsg459", "KaraAral");
	SampleAccount Amanzhol = new SampleAccount("Amanzhol@gmail.com", "WerVC48548@", "AmanZholLO0x");
	
	Aidos.AddSubCount(45);
	Stas.AddSubCount(98);
	Aral.AddSubCount(32);
	Amanzhol.AddSubCount(16);
	
//	users.add(Arlan);
//	users.add(Nikita);
	users.add(Aidos);
	users.add(Stas);
	users.add(Amanzhol);
	users.add(Aral);
	
	users.sort(new AccountComparator());
	
	for(SampleAccount s: users)
	{
		System.out.print(s.nickname + " ");
	}
	
	}
	
}
