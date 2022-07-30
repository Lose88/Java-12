import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Manager;

public class ShowAllFilmsTest {
    @Test
    public void showAllFilms() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        String[] actual = manager.findAll();
        String[] expected = {
                "film1",
                "film2",
                "film3",
                "film4",
                "film5",
                "film6",
                "film7",
                "film8",
                "film9",
                "film10",
                "film11",
                "film12",
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}
