/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.shared.cldr.impl;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "es_PR" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_es_PR extends DateTimeFormatInfoImpl_es_419 {

  @Override
  public String[] ampms() {
    return new String[] {
        "a. m.",
        "p. m."
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d 'de' MMMM 'de' y";
  }

  @Override
  public String dateFormatLong() {
    return "d 'de' MMMM 'de' y";
  }

  @Override
  public String dateFormatMedium() {
    return "MM/dd/y";
  }

  @Override
  public String dateFormatShort() {
    return "MM/dd/yy";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "antes de Cristo",
        "despu??s de Cristo"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "a. C.",
        "d. C."
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 0;
  }

  @Override
  public String formatDay() {
    return "d";
  }

  @Override
  public String formatHour12Minute() {
    return "h:mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss a";
  }

  @Override
  public String formatHour24Minute() {
    return "HH:mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "HH:mm:ss";
  }

  @Override
  public String formatMinuteSecond() {
    return "mm:ss";
  }

  @Override
  public String formatMonthAbbrev() {
    return "LLL";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d MMM";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "d 'de' MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, d 'de' MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "MM/dd";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMMM 'de' y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d 'de' MMMM 'de' y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM 'de' y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d 'de' MMMM 'de' y";
  }

  @Override
  public String formatYearMonthNum() {
    return "MM/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "MM/dd/y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d 'de' MMM 'de' y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ 'de' y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q 'de' y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "enero",
        "febrero",
        "marzo",
        "abril",
        "mayo",
        "junio",
        "julio",
        "agosto",
        "septiembre",
        "octubre",
        "noviembre",
        "diciembre"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "E",
        "F",
        "M",
        "A",
        "M",
        "J",
        "J",
        "A",
        "S",
        "O",
        "N",
        "D"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "ene.",
        "feb.",
        "mar.",
        "abr.",
        "may.",
        "jun.",
        "jul.",
        "ago.",
        "sep.",
        "oct.",
        "nov.",
        "dic."
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1.?? trimestre",
        "2.?? trimestre",
        "3.?? trimestre",
        "4.?? trimestre"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "T1",
        "T2",
        "T3",
        "T4"
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "h:mm:ss a zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "h:mm:ss a z";
  }

  @Override
  public String timeFormatMedium() {
    return "h:mm:ss a";
  }

  @Override
  public String timeFormatShort() {
    return "h:mm a";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "domingo",
        "lunes",
        "martes",
        "mi??rcoles",
        "jueves",
        "viernes",
        "s??bado"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "d",
        "l",
        "m",
        "m",
        "j",
        "v",
        "s"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return new String[] {
        "D",
        "L",
        "M",
        "M",
        "J",
        "V",
        "S"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "dom.",
        "lun.",
        "mar.",
        "mi??.",
        "jue.",
        "vie.",
        "s??b."
    };
  }

  @Override
  public String[] weekdaysShortStandalone() {
    return weekdaysShort();
  }

  @Override
  public int weekendEnd() {
    return 0;
  }

  @Override
  public int weekendStart() {
    return 6;
  }
}
