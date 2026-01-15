import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TasksTest {

    @Test
    public void SimpleTaskTest() {
        SimpleTask task = new SimpleTask(1, "Привет, как дела?");
        boolean expected = true;
        boolean actual = task.matches("Привет");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotSimpleTaskTest() {
        SimpleTask task = new SimpleTask(1, "Привет, как дела?");
        boolean expected = false;
        boolean actual = task.matches("Privet");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicTaskTest() {
        Epic task = new Epic(1, new String[]{"машина", "мото", "велосипед"});
        boolean expected = true;
        boolean actual = task.matches("мото");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotEpicTaskTest() {
        Epic task = new Epic(1, new String[]{"машина", "мото", "велосипед"});
        boolean expected = false;
        boolean actual = task.matches("коньки");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingTaskTest() {
        Meeting task = new Meeting(1,"Двоичная система", "Переход в другую систему", "10.01.2026");
        boolean expected = true;
        boolean actual = task.matches("система");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingTaskTest2() {
        Meeting task = new Meeting(1,"Двоичная система", "Переход в другую систему", "10.01.2026");
        boolean expected = true;
        boolean actual = task.matches("систему");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotMeetingTaskTest() {
        Meeting task = new Meeting(1,"Двоичная система", "Переход в другую систему", "10.01.2026");
        boolean expected = false;
        boolean actual = task.matches("10");
        Assertions.assertEquals(expected, actual);
    }
}
