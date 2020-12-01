import java.util.List;

/**
 * 
 * @author User
 */
public class Card {

	public enum Color {
		RED,
		BLUE,
		YELLOW,
		GREEN
	}

	public enum Size {
		SMALL,
		LARGE
	}
	
	public enum Style {
		EMTPY,
		LARGE_SMALL,
		TWO_HALF,
		THREE_PART,
		FULL
	}

	private Color color;
	private Size size;
	private Style style;
	private List<String> labels;
}
