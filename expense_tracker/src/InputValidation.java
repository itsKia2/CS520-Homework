
/**
 * InputValidation class checks whether the input is in correct format
 * and within correct ranges
 */
public class InputValidation {

	/**
	 * Validates the amount
	 * The amount must be greater than 0 and less than 1000.
	 *
	 * @param input The amount to validate.
	 * @return true if the amount is valid
	 */
	public static boolean validateAmt(double input) {
		if (input > 0 && input < 1000) {
			return true;
		}
		return false;
	}

	/**
	 * Validates the category entered by the user
	 * The category must be one of:
	 * "food", "travel", "bills", "entertainment", or "other".
	 *
	 * @param input The category to validate.
	 * @return true if the category matches an option
	 */
	public static boolean validateCategory(String input) {
		if (input.equals("food")) {
			return true;
		} else if (input.equals("travel")) {
			return true;
		} else if (input.equals("bills")) {
			return true;
		} else if (input.equals("entertainment")) {
			return true;
		} else if (input.equals("other")) {
			return true;
		}
		return false;
	}
}
