//First level: Level1: В Китае живет 1 411 778 724 человек, всего в мире 197 стран.
// Сколько бы человек жило на земле, если бы в каждой стране жило население, равное китайскому?
//
//Level2: Феликс прожил 3_011_456_567 секунд. Сколько лет прожил Феликс?
// Посчитать, используя Java, Long-переменные и деление.
// Кто не знает - по какой формуле посчитать - напишите мне, но сначала подумайте

public class HW3 {
    public static void main(String[] args) {

        long chinaPopulation = 141177724L;
        int countries = 197;

        System.out.println(chinaPopulation * countries);

        long felixLive = 301145656;
        int secporear = (((365 * 24) * 60) * 60);

        System.out.println(felixLive / secporear);
    }
}