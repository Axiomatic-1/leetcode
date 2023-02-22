package org.leet;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

//9:15 9:45
//9:30 10:30
//10:15 10:45
// найти в какое время было максиммальное количество людей в банке
public class TimeIntersectionInBank {

    public static void main(String[] args) {
        TimeIntersectionInBank bank = new TimeIntersectionInBank();
        List<VisitTime> visiters = List.of(
                new VisitTime(
                        LocalDateTime.of(2022, Month.JANUARY, 1, 1, 22),
                        LocalDateTime.of(2022, Month.JANUARY, 1, 2, 22)),
                new VisitTime(
                        LocalDateTime.of(2022, Month.JANUARY, 1, 4, 33),
                        LocalDateTime.of(2022, Month.JANUARY, 1, 5, 33)),
                new VisitTime(
                        LocalDateTime.of(2022, Month.JANUARY, 1, 1, 23),
                        LocalDateTime.of(2022, Month.JANUARY, 1, 2, 33)),
                new VisitTime(
                        LocalDateTime.of(2022, Month.JANUARY, 1, 2, 15),
                        LocalDateTime.of(2022, Month.JANUARY, 1, 2, 56))
        );
        System.out.println(bank.findMaxClientsAtTheSameTime(visiters));

    }

    public int findMaxClientsAtTheSameTime(List<VisitTime> visiters) {
        int counter = 1;
        int result = 0;
        for (int i = 0; i < visiters.size(); i++) {
            VisitTime visitTime = visiters.get(i);
            for (int j = 0; j < visiters.size(); j++) {
                if (i != j) {
                    VisitTime otherVisiter = visiters.get(j);
                    //сравниваем когда пришли
                    if (visitTime.getFrom().compareTo(otherVisiter.getFrom()) < 0) {
                        //если второй пришел позже, проверяем не ушел ли первый клиент до этого
                        if (visitTime.getTo().compareTo(otherVisiter.getFrom()) >= 0) {
                            counter++;
                        }
                        //если второй клиент пришел раньше, проверяем пересекся ли он с первым
                    } else if (otherVisiter.getTo().compareTo(visitTime.getFrom()) >= 0) {
                        counter++;
                    }
                }
                result = Math.max(result, counter);
            }
            counter = 1;
        }
        return result;
    }

    private static class VisitTime {
        private LocalDateTime from;
        private LocalDateTime to;

        public VisitTime(LocalDateTime from, LocalDateTime to) {
            this.from = from;
            this.to = to;
        }

        public LocalDateTime getFrom() {
            return from;
        }

        public LocalDateTime getTo() {
            return to;
        }
    }


}
