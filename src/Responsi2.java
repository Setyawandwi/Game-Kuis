import java.util.Scanner;

public class Responsi2 {

    static Scanner in = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);

    static void Kuis() {
        int bonus;
        int bet = 0;
        int skor = 100;

        String soal[] = {
            "2, 3, 5, 7,...,..., 17, ....\n" //1
            + "\n"
            + "A. 9  , 14 , 21 \n"
            + "B. 11 , 13 , 23\n"
            + "C. 9  , 11 , 19\n"
            + "D. 9  , 13 , 21\n",
            "100, 95, 92 ,... , 91 , 89 , 86, 81.\n" //2
            + "\n"
            + "A. 90\n"
            + "B. 92\n"
            + "C. 94\n"
            + "D. 96\n",
            "Dari data 6, 8, 5, 10, 6, 9, 3, 11, 9, 6 maka…\n" //3
            + "A. Modus = 7, jangkauan = 8\n"
            + "B. Rata-rata = 7 1/4, jangkauan = 5\n"
            + "C. Median = 6, rata-rata = 5 1/4\n"
            + "D. Modus = 6, median = 6\n",
            "625 - 1.296 - 25 - 36 - 5 - …….\n" //4
            + "A. 8\n"
            + "B. 4\n"
            + "C. 6\n"
            + "D. 10\n",
            "ACEH : SERAMBI MEKAH =\n" //5
            + "A. Michael Jackson : King of Pop\n"
            + "B. Michael Shumacher : Pembalap\n"
            + "C. Miochael Gorbachev : Pemimpin Soviet\n"
            + "D. Madonna : Seksi\n",
            "FILM : SKENARIO =\n" //6
            + "A. Drama : Panggung\n"
            + "B. Sandiwara : Plot\n"
            + "C. Teater : Acara\n"
            + "D. Resital : Tinjauan\n",
            "Mayoritas orang bersuku Jawa menyukai makanan manis. Zulfa juga bersuku Jawa. Maka\n" //7
            + "A. Zulfa pastilah menyukai makanan manis.\n"
            + "B. Mustahil Zulfa menyukai makanan manis\n"
            + "C. Kemungkinan Zulfa juga menyukai makanan manis adalah sangat kecil\n"
            + "D. KemungkinanZulfa menyukai makanan manis adalah sangat besar.\n",
            "Tidak ada ikan lele yang punya sisik. Ikan lele memiliki sungut.\n" //8
            + "A. Ikan yang tidak bersisik pasti punya sungut\n"
            + "B. Ikan yang bersungut pasti tidak punya sisik\n"
            + "C. Sisik ada hubungannya dengan sungut \n"
            + "D. Tidak bisa ditarik kesimpulan\n",
            "Ivan lebih ringan beratnya daripada Wawan. Andika lebih berat daripada wawan.\n" //9
            + "A. Wawan adalah yang paling ringan dari ketiganya\n"
            + "B. Ivan mungkin saja sama beratnya dengan andika\n"
            + "C. Jika wawan memiliki berat 65 Kg. Mustahil andika memiliki berat lebih dari 65 Kg. \n"
            + "D. Jika andika memiliki berat 65 Kg. Mustahil ivan memiliki berat lebih dari 65 Kg. \n",
            "KITA : SAYA = …..\n" //10
            + "A. Kami : Kamu\n"
            + "B. Kalian : Beliau\n"
            + "C. mereka : dia\n"
            + "D. kalian : kamu\n"};

        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("---------------------------");
            System.out.println("  GAME KUIS               ");
            System.out.println("  NOMOR " + (i + 1) + "    POINT : " + skor + "  ");
            System.out.println("---------------------------");

            if (i == 0) {
                
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }
                
                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 1) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 2) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 3) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 4) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 5) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 6) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 7) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 8) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            } else if (i == 9) {
                System.out.println(soal[i]);
                System.out.print("Masukkan Taruhan : ");
                bet = in.nextInt();
                while (bet > skor) {
                    System.out.println("<< Jumlah Bet melebihi Poin!!! >>");
                    System.out.print("Masukkan Taruhan : ");
                    bet = in.nextInt();
                }

                System.out.print("Jawab :");
                String aa = in.next();
                switch (aa) {
                    case "a":
                    case "A":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "b":
                    case "B":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    case "c":
                    case "C":
                        System.out.println("\nBenar\n");
                        skor += bet;
                        break;
                    case "d":
                    case "D":
                        System.out.println("\nSalah\n");
                        skor -= bet;
                        break;
                    default:
                        System.out.println("Inputan Salah");
                        skor -= bet;
                }
            }
            if (skor == 0) {
                System.out.println("Game Over");
                break;
            }

        }
        System.out.println("-----------------------");
        System.out.println("| Hasil Score : " + skor + " |");
        System.out.println("-----------------------");

        if (skor != 0) {
            System.out.println("Apakah Anda Ingin mengikuti babak bonus??");
            System.out.println("[Soal Bonus berupa essay]\n");

            System.out.println("1.Ikut");
            System.out.println("2.tidak");
            System.out.print("Masukkan Pilihan anda : ");
            bonus = in.nextInt();
            if (bonus == 1) {
                bonus(skor, bet);

            }
        }

    }

    static void bonus(int skor, int bet) {
        System.out.println();
        System.out.println("\n=== SOAL BONUS ===\n");
        System.out.println();
        System.out.println("Berapa jumlah bilangan kelipatan 6 dan habis dibagi 3 yang muncul di antara bilangan 100 sampai 300?");
        System.out.print("Jawab :");
        int aa = in.nextInt();
        if (aa == 6534) {
            System.out.println("Jawaban Anda Benar !!!");
            skor *= 3;
        } else {
            System.out.println("Jawaban Anda Salah !!!");
            skor -= skor;
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println(" SKOR AKHIR : " + skor);
        System.out.println("---------------------");

    }

    static void bantuan() {
        String a[] = {" 1.GAME INI HANYA BERUPA TEKS SOAL DAN PILIHAN JAWABAN",
                      " 2.GAME INI TERDIRI DARI 10 SOAL SAJA ",
                      " 3.ANDA AKAN DIBERIKAN POIN AWAL 100 SEBAGAI SKOR AWAL  ",
                      " 4.APABILA POIN ANDA 0 ANDA DIANGGAP KALAH",
                      " 5.SETELAH MENDAPATKAN SOAL ANDA HARUS MEMASUKAN TARUHAN",
                      " 6.TARUHAN BERDASARKAN SKOR YANG ANDA MILIKI DAN TIDAK BOLEH MELEBIHI DARI SKOR YANG ANDA MILIKI",
                      " 7.APABILA JAWABAN ANDA BENAR POIN AKAN DITAMBAHKAN SESUAI TARUHAN YANG ANDA MASUKAN",
                      " 8.APABILA JAWABAN ANDA SALAH POIN AKAN DIKURANGI SESUAI TARUHAN YANG TELAH ANDA DAPATKAN",
                      " 9.APABILA ANDA BERHASIL MENYELESAIKAN SEMUA SOAL ANDA AKAN DIBERIKAN PILIHAN UNTUK MASUK KE BABAK BONUS ATAU BERHENTI DI SOAL 10",
                      "10.BABAK BONUS ADALAH BABAK DIMANA ANDA HARUS MEMPERTARUHKAN SEMUA POIN ANDA",
                      "11.DIBABAK BONUS ADA 1 SOAL YANG HARUS ANDA JAWAB",
                      "12.APABILA JAWABAN ANDA SALAH MAKA , SEMUA SKOR ANDA AKAN HILANG DAN ANDA AKAN DINYATAKAN KALAH",
                      "13.APABILA JAWABAN ANDA BENAR MAKA , POIN YANG ANDA MILIKI AKAN DIKALI 3 , DAN AKAN MENJADI SKOR AKHIR ANDA\n"};

        System.out.println("PERATURAN DAN BANTUAN :");
        for (int i = 0; i < 11; i++) {
            System.out.println(a[i]);
        }
    }

    static void about() {
        String a[][] = {{"Thegar septiawan khafli", "181111070"}, {"Muhamad ridwan ilyasa", "181111092"}, {"setyawan dwi pradika", "181111084"}};

        System.out.println("JENIS GAME = GAME KUIS");
        System.out.println("NAMA PENCIPTA DAN NRP:");
        System.out.println("============================================");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length;) {
                System.out.println("NAMA :" + a[i][j++]);
                System.out.println("NRP  :" + a[i][j++]);
            }
            System.out.println("======================================\n");
        }
    }

    static int pilih = 0;
    public static void main(String[] args) {

        int back = 1;
        do {
            System.out.println("=================");
            System.out.println("|   GAME KUIS   |");
            System.out.println("=================");
            System.out.println("!! Baca peraturan sebelum bermain !!");
            System.out.println("  >1. Start Game");
            System.out.println("  >2. Bantuan");
            System.out.println("  >3. About");
            System.out.println("  >4. Keluar");
            System.out.print("pilih Menu : ");
            try {
                pilih = input.nextInt();
                System.out.println("");
            } catch (Exception e) {
                System.out.println("Inputan Harus Angka");
                input.next();
                back = 0;
            }
                if (pilih == 1) {
                    do {
                        Kuis();
                        System.out.println("\nApakah Anda Ingin bermain lagi??\n>1.ya\n>0.kembali");
                        System.out.print("Masukkan Pilihan : ");
                        back = in.nextInt();
                        System.out.println("");
                    } while (back == 1);
                } else if (pilih == 2) {
                    System.out.println("\t[  PERATURAN  ]");
                    System.out.println("");
                    bantuan();
                    System.out.println("0.kembali");
                    System.out.print("Masukkan Pilihan : ");
                    back = in.nextInt();
                    System.out.println("");
                } else if (pilih == 3) {
                    System.out.println("\t[  ABOUT  ]");
                    System.out.println("");
                    about();
                    System.out.println("0.kembali");
                    System.out.print("Masukkan Pilihan : ");
                    back = in.nextInt();
                    System.out.println("");
                } else if (pilih == 4) {
                    System.out.println("Terima kasih Telah Bermain");
                    break;
                } else {
                    System.out.println("< Pilihan anda tidak ada dalam menu >");
                    back = 0;
                }
        } while (back == 0);
    }
}
