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
 * Implementation of DateTimeFormatInfo for the "ii_CN" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_ii_CN extends DateTimeFormatInfoImpl_ii {

  @Override
  public String[] ampms() {
    return new String[] {
        "κΈκ",
        "κ―κ"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "y MMMM d, EEEE";
  }

  @Override
  public String dateFormatLong() {
    return "y MMMM d";
  }

  @Override
  public String dateFormatMedium() {
    return "y MMM d";
  }

  @Override
  public String dateFormatShort() {
    return "y-MM-dd";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
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
        "κκκΏ",
        "κκκ"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "κκκΏ",
        "κκκ"
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
    return "MMM d";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "MMMM d";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "MMMM d, EEEE";
  }

  @Override
  public String formatMonthNumDay() {
    return "MM-dd";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "y MMM";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "y MMM d";
  }

  @Override
  public String formatYearMonthFull() {
    return "y MMMM";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "y MMMM d";
  }

  @Override
  public String formatYearMonthNum() {
    return "y-MM";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "y-MM-dd";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "y MMM d, EEE";
  }

  @Override
  public String formatYearQuarterFull() {
    return "y QQQQ";
  }

  @Override
  public String formatYearQuarterShort() {
    return "y Q";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "κκͺ",
        "κκͺ",
        "κκͺ",
        "κκͺ",
        "κ¬κͺ",
        "κκͺ",
        "κκͺ",
        "κκͺ",
        "κ¬κͺ",
        "κ°κͺ",
        "κ°κͺκͺ",
        "κ°κκͺ"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "κκͺ",
        "κκͺ",
        "κκͺ",
        "κκͺ",
        "κ¬κͺ",
        "κκͺ",
        "κκͺ",
        "κκͺ",
        "κ¬κͺ",
        "κ°κͺ",
        "κ°κͺκͺ",
        "κ°κκͺ"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "κκ",
        "κκΈ",
        "κκ΅",
        "κκ"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "κκ",
        "κκΈ",
        "κκ΅",
        "κκ"
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
        "κ­κκ",
        "κκκ",
        "κκκ",
        "κκκ",
        "κκκ",
        "κκκ¬",
        "κκκ"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "κ",
        "κ",
        "κ",
        "κ",
        "κ",
        "κ¬",
        "κ"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "κ­κ",
        "κκ",
        "κκ",
        "κκ",
        "κκ",
        "κκ¬",
        "κκ"
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
