package com.corporosoft.jugadaganadora.test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.util.stream.Stream;

public class CalcularTotalSorteos {

    public static void main (String [] args){

        // Definir las fechas de inicio
        LocalDate startForSundays = LocalDate.of(1994, 10, 16);
        LocalDate startForWednesdays = LocalDate.of(2004, 5, 19);
        LocalDate end = LocalDate.now(); // Fecha actual

        // Contar domingos y miercoles
        long sundaysCount = countDaysBetween(startForSundays, end, DayOfWeek.SUNDAY);
        long wednesdaysCount = countDaysBetween(startForWednesdays, end, DayOfWeek.WEDNESDAY);

        long totalDays = sundaysCount + wednesdaysCount;

        System.out.println("Numero de domingos desde el " + startForSundays + " hasta el " + end + ": " + sundaysCount);
        System.out.println("Numero de miercoles desde el " + startForWednesdays + " hasta el " + end + ": " + wednesdaysCount);

        System.out.println("Suma total de domingos y miercoles: " + totalDays);

    }

    private static long countDaysBetween(LocalDate start, LocalDate end, DayOfWeek dayOfWeek) {
        return Stream.iterate(start, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(start, end) + 1)
                .filter(date -> date.getDayOfWeek() == dayOfWeek)
                .count();
    }
}
