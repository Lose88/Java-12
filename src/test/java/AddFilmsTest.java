import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import ru.netology.Manager;

public class AddFilmsTest {
    @Test
    public void addFilms() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void noAddFilms() {
        Manager manager = new Manager();
        String[] actual = manager.findAll();
        String[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilms() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        String[] actual = manager.findAll();
        String[] expected = {"film1"};
        assertArrayEquals(expected, actual);
    }
}
