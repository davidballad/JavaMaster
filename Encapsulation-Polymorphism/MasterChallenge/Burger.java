import java.io.*;

public class Burger{
  private Bread bread;
  private Meat meat;
  private boolean lettuce;
  private boolean tomato;
  private boolean salt;
  private boolean onions;

	public Burger(Bread bread, Meat meat, boolean lettuce, boolean tomato, boolean salt, boolean onions) {
		this.bread = bread;
		this.meat = meat;
		this.lettuce = lettuce;
		this.tomato = tomato;
		this.salt = salt;
		this.onions = onions;
	}

	public Bread getBread() {
		return bread;
	}

	public Meat getMeat() {
		return meat;
	}

	public boolean isLettuce() {
		return lettuce;
	}

	public boolean isTomato() {
		return tomato;
	}

	public boolean isSalt() {
		return salt;
	}

	public boolean isOnions() {
		return onions;
	}

	public void extraPrice(double amount) {
    System.out.println(amount = bread.getBreadCost());

  }


}
