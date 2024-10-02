// 12S035-JOSUA SIANTURI
// 12S24058-AIRENE SITUMORANG

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn;
        String judul;
        String penulis;
        int tahun;
        String penerbit;
        String formatbuku;
        double harga;
        double margin;
        int stok;
        double rating;
        String kategori;
        int hasil;
        String status;
        String tub;

        do {
            isbn = input.nextLine();
            if (isbn.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahun = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatbuku = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                kategori = "Average";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
                hasil = margin / harga * -1 * 100;
                if (hasil == 40) {
                    status = "once in a life";
                } else {
                    if (hasil == 20 && hasil < 40) {
                        status = "never come twice";
                    } else {
                        status = "no regret";
                    }
                }
            }
            if (rating >= 4.7 && hasil > 40) {
                tub = "The ultimate best";
            } else {
                tub = "---";
            }
            System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + formatbuku + "|" + harga + "|" + margin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + status + "|" + tub);
        } while (!isbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
