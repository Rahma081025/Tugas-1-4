# Tugas-1-4
1. Tugas 1 tentang Perulangan
   perulangan for yang menjelaskan menggunakan int dan variabel i adalah 1. Jika i kurang dari 100. maka variabel i ditambah.


   for(int i = 1;i<=100;i++)
   Jika variabel i kurang dari 9 maka akan memunculkan output angka yaitu 1, 2, 3, 4, 5, 6, 7, 8, 9.
	if (i<=9){
    System.out.println(i);
	Jika lebih dari 9 maka akan muncul output Rahma Hidayati Fitrah sampai ke 100
   } else {
    System.out.println("Rahma Hidayati Fitrah");
}

Ini adalah hasil outputnya

![Screenshot 2023-11-04 121253](https://github.com/Rahma081025/Tugas-1-4/assets/147369840/e85d0f68-69bb-4059-85df-81e491494cb4)

3. Tugas 2 tentang if,else,perulangan while
   Membaca input dari pengguna dan penamaan variabel yaitu number menggunakan type data integer

    Scanner scanner = new
        Scanner(System.in);
int number;

    Menampilkan ( Masukkan sebuah  Angka Bilangan Bulat: ) dan menginput variabel number sesuai dengan pengguna input

   System.out.println("Masukkan sebuah Angka Bilangan Bulat:");
number = scanner.nextInt();
   Code ini meminta pengguna memasukkan sebuah angka bilangan bulat, mencetak apakah bilangan tersebut positif atau negatif, dan terus mengulang proses tersebut sampai pengguna memasukkan 0, pada saat itu program akan berhenti dan mencetak "Program selesai."
   while (number !=2){
    if (number >3){
        System.out.println("Bilangan Positif:");
    } else {
        System.out.println("Bilangan Negatif:");
    }

    System.out.print("Anda Kurang Beruntung, ayo coba lagi Masukkan sebuah Bilangan Bulat(atau x untuk keluar):");
    number = scanner.nextInt();{
    }
    System.out.println("Terima kasih Program kamu Sukses.");
    scanner.close();
}
Ini adalah hasil outputnya

![Screenshot 2023-11-04 123229](https://github.com/Rahma081025/Tugas-1-4/assets/147369840/28159b1f-5083-4974-8c62-f17fb4f2ff43)

3. Tugas 3 tentang zodiac
   Kode ini membuat objek Scanner untuk menerima input dari pengguna melalui konsol. Pengguna diminta memasukkan tanggal lahir dalam format "hari bulan" (contoh: 30 10 untuk tanggal 30 Oktober). Input tersebut disimpan dalam variabel day dan month. Selanjutnya, program memanggil fungsi determineZodiacSign(day, month) untuk menentukan zodiak berdasarkan input pengguna. Hasilnya disimpan dalam variabel zodiacSign untuk digunakan selanjutnya.

   Scanner scanner = new
        Scanner(System.in);
int day,month;
System.out.print("Masukan Tanggal lahir (contoh: 30 10 untuk tanggal 30 oktober):");
day = scanner.nextInt();
month = scanner.nextInt();

String zodiacSign = determineZodiacSign(day,month);

Kode ini memeriksa hasil dari fungsi determineZodiacSign(day, month). Jika hasilnya tidak null (tanggal lahir tidak sesuai), program mencetak zodiak pengguna. Jika hasilnya null (tanggal lahir tidak sesuai), program mencetak pesan kesalahan.

   if (zodiacSign!= null){
    System.out.println("Isi Zodiac Anda adalah: "+ zodiacSign);
} else {
    System.out.println("Tanggal lahir Tidak sesuai.");
}
scanner.close();

Kode ini mendefinisikan dua array: zodiacSigns berisi nama-nama zodiak, dan endDayOfSigns berisi tanggal terakhir dari masing-masing zodiak.

String[] zodiacSigns = {"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius"};
int[] endDayOfSighs = {20,19,20,19,20,20,22,22,22,22,21,21};
4.	Kode ini menentukan zodiak berdasarkan input bulan dan tanggal lahir pengguna. Pertama, kode memeriksa apakah input bulan dan tanggal berada dalam rentang yang valid (1-12 untuk bulan, 1-31 untuk tanggal). Jika valid, kode memeriksa apakah tanggal lahir masih dalam rentang zodiak bulan tersebut. Jika ya, zodiak tersebut dikembalikan. Jika tidak, zodiak bulan berikutnya dikembalikan. Jika input tidak valid, fungsi mengembalikan null.
	if (month>= 1 && month<= 12 && day>= 1 && day<= 31){
  if (day<= endDayOfSighs[month -1]){
      return zodiacSigns[month-1];
  }else {
    return zodiacSigns[month % 12];
  }
}else {
    return null;// Tanggal lahir tidak valid
}

Ini adalah hasil output

![Screenshot 2023-11-04 140209](https://github.com/Rahma081025/Tugas-1-4/assets/147369840/4a924e64-2b91-43ca-a1a3-8d9afacb0068)

4. Tugas 4  Data array
   Kode tersebut membuat sebuah array numbers yang berisi bilangan bulat dari 1 hingga 10. Selanjutnya, menggunakan sebuah loop for, program mencetak nilai-nilai dalam array tersebut satu per satu ke layar. Hasilnya adalah mencetak bilangan 1 hingga 10 ke layar.

    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
// Menampilkan semua nilai dalam variabel array menggunakan perulangan for
System.out.println("Nilai Dalam Variabel Array:");
for (int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);
}

   ini adalah hasil output
   
   ![Screenshot 2023-11-04 140543](https://github.com/Rahma081025/Tugas-1-4/assets/147369840/0f345e72-af3d-4e74-87b4-67a5237b35fa)
