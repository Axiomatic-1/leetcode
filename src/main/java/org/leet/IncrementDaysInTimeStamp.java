package org.leet;


import java.sql.Timestamp;
import java.util.Calendar;

public class IncrementDaysInTimeStamp {

  public static void main(String[] args) {
    IncrementDaysInTimeStamp i = new IncrementDaysInTimeStamp();
    System.out.println(
        i.calculateDateEndGuaranteePeriod(30.0));
  }

  private Timestamp calculateDateEndGuaranteePeriod(Double durationGuaranteePeriod) {
    Timestamp ts = new Timestamp(System.currentTimeMillis());
    Calendar cal = Calendar.getInstance();
    cal.setTime(ts);
    cal.add(Calendar.DAY_OF_WEEK, durationGuaranteePeriod.intValue());
    ts.setTime(cal.getTime().getTime());
    ts = new Timestamp(cal.getTime().getTime());
    return ts;
  }

}
