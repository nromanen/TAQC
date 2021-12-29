package kata.impl.VolodimirD;

import kata.SixthKata;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixthKataImpl implements SixthKata {

	@Override
	public String balance(String book) {

		Double money = 0.0;

		Pattern forManey1 = Pattern.compile("(\\d+\\.\\d+)");
		Matcher matcherM = forManey1.matcher(book);
		matcherM.find();
		money = Double.parseDouble(matcherM.group());

		ArrayList<String> chek = new ArrayList<>();
		ArrayList<String> chekOvnerName = new ArrayList<>();
		ArrayList<Double> price = new ArrayList<>();

		while (matcherM.find()) {
			price.add(Double.parseDouble(matcherM.group()));
		}

		Pattern forName = Pattern.compile("[a-zA-Z]{2,}");
		Matcher matcherN = forName.matcher(book);

		while (matcherN.find()) {
			chekOvnerName.add(matcherN.group());
		}

		Pattern forchek = Pattern.compile("[ |:|\\n]([0-9]+)[ |:|[\\n]]");
		Matcher matcherC = forchek.matcher(book);

		while (matcherC.find()) {
			chek.add(matcherC.group());
		}

		String result = new String();

		result += ("Original Balance: ") + money;

		for (int i = 0; i < chek.size(); i++) {

			DecimalFormat decimalFormat = new DecimalFormat("#.##");
			String okr = decimalFormat.format(money - price.get(i));

			result += (chek.get(i)) + (chekOvnerName.get(i)) + (" " + price.get(i).toString()) + (" " + okr);
			money = money - price.get(i);
		}

		double sum = 0;
		for (int i = 0; i < price.size(); i++) {
			sum += price.get(i);
		}

		result = result.concat("\r\nTotal expense " + Math.round(sum * 100) / 100D);

		sum = sum / price.size();

		result = result.concat("\r\nAverage expense " + Math.round(sum * 100) / 100D);

		return result;

	}

	@Override
	public long findNb(long m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double f(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mean(String town, String strng) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double variance(String town, String strng) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String nbaCup(String resultSheet, String toFind) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		// TODO Auto-generated method stub
		return null;
	}

}
