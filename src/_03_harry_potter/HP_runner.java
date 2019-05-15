package _03_harry_potter;

public class HP_runner {
public static void main(String[] args) {
	HarryPotter h = new HarryPotter();
	h.makeInvisible(true);
	h.spyOnSnape();
	h.makeInvisible(false);
	h.castSpell("stupify");
}
}
