package in.mukeshit.beans;

import java.time.LocalDate;
import java.time.Period;

public class Demo5 {
	public static void main(String[] args) {
		Period period = Period.ofDays(5);
		System.out.println(period.getDays());
		period = Period.ofMonths(3);
		System.out.println(period.getMonths());
		period = Period.ofYears(2);
		System.out.println(period.getYears());
		Period p = Period.between(LocalDate.parse("1997-09-02"), LocalDate.now());
		System.out.println(p);

	}

}
