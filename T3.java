import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        int day,month;
        System.out.print("Masukan Tanggal lahir (contoh: 30 10 untuk tanggal 30 oktober):");
        day = scanner.nextInt();
        month = scanner.nextInt();

        String zodiacSign = determineZodiacSign(day,month);

        if (zodiacSign!= null){
            System.out.println("Isi Zodiac Anda adalah: "+ zodiacSign);
        } else {
            System.out.println("Tanggal lahir Tidak sesuai.");
        }
        scanner.close();
    }

    public static String determineZodiacSign(int day, int month){
        String[] zodiacSigns = {"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius"};
        int[] endDayOfSighs = {20,19,20,19,20,20,22,22,22,22,21,21};

        if (month>= 1 && month<= 12 && day>= 1 && day<= 31){
            if (day<= endDayOfSighs[month -1]){
                return zodiacSigns[month-1];
            }else {
              return zodiacSigns[month % 12];
            }
        }else {
            return null;// Tanggal lahir tidak valid
        }
    }
}
