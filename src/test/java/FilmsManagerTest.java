
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void ONEtest() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот I");
        manager.addFilm("Вперед II");
        manager.addFilm("Отель Белград III");
        manager.addFilm("Джентельмены IV");
        manager.addFilm("Человек-неведимка V");
        manager.addFilm("Тролли.Мировой тур VI");
        manager.addFilm("Номер один VII");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот I", "Вперед II", "Отель Белград III", "Джентельмены IV", "Человек-неведимка V", "Тролли.Мировой тур VI", "Номер один VII"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TWOtest() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот I");


        String[] actual = manager.findAll();
        String[] expected = {"Бладшот I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ThreeTest() {
        FilmsManager manager = new FilmsManager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FourTest() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот I");
        manager.addFilm("Вперед II");
        manager.addFilm("Отель Белград III");
        manager.addFilm("Джентельмены IV");
        manager.addFilm("Человек-неведимка V");
        manager.addFilm("Тролли.Мировой тур VI");
        manager.addFilm("Номер один VII");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один VII", "Тролли.Мировой тур VI", "Человек-неведимка V", "Джентельмены IV", "Отель Белград III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FiveTest() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот I");
        manager.addFilm("Вперед II");
        manager.addFilm("Отель Белград III");


        String[] actual = manager.findLast();
        String[] expected = {"Отель Белград III", "Вперед II", "Бладшот I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SixTest() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот I");
        manager.addFilm("Вперед II");
        manager.addFilm("Отель Белград III");
        manager.addFilm("Джентельмены IV");
        manager.addFilm("Человек-неведимка V");


        String[] actual = manager.findLast();
        String[] expected = {"Человек-неведимка V", "Джентельмены IV", "Отель Белград III", "Вперед II", "Бладшот I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SevenTest() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот I");
        manager.addFilm("Вперед II");
        manager.addFilm("Отель Белград III");
        manager.addFilm("Джентельмены IV");
        manager.addFilm("Человек-неведимка V");
        manager.addFilm("Тролли.Мировой тур VI");
        manager.addFilm("Номер один VII");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один VII", "Тролли.Мировой тур VI", "Человек-неведимка V", "Джентельмены IV", "Отель Белград III", "Вперед II", "Бладшот I"};
        Assertions.assertArrayEquals(expected, actual);
    }

}
