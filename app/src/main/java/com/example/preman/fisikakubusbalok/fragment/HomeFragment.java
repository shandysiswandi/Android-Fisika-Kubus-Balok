package com.example.preman.fisikakubusbalok.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.example.preman.fisikakubusbalok.R;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        WebView mWebView = view.findViewById(R.id.webview);

        mWebView.setWebViewClient(new WebViewClient());

        // Generate an HTML document on the fly:
        String htmlDocument = "<h1>Kubus</h1>\n" +
                "<h3>Sifat-Sifat Kubus</h3>\n" +
                "<p>\n" +
                "  Semua sisi kubus berbentuk persegi. <br />\n" +
                "  Semua rusuk kubus beukuran sama panjang. <br />\n" +
                "  Setiap diagonal bidang pada kubus memiliki ukuran yang sama panjang. <br />\n" +
                "  Setiap diagonal ruang pada kubus memiliki ukuran yang sama panjang. <br />\n" +
                "  Setiap bidang diagonal pada kubus memiliki bentuk persegi panjang. <br />\n" +
                "</p>\n" +
                "\n" +
                "<h2>Unsur-Unsur Kubus</h2>\n" +
                "<ol>\n" +
                "  <li>Sisi atau Bidang Kubus</li>\n" +
                "  <p>\n" +
                "    Sisi atau Bidang Kubus adalah Bidang atau sisi yang membatasi Kubus. Kubus\n" +
                "    memiliki 6 sisi. Perhatikan gambar kubus diatas, yang merupakan sisi atau\n" +
                "    bidang kubus yaitu (ABCD), (EFGH), (ABFE), (DCGH), (BCGF), dan (ADHE).\n" +
                "  </p>\n" +
                "  <li>Rusuk</li>\n" +
                "  <p>\n" +
                "    Rusuk adalah garis potongan antar dua sisi bidang kubus dan terlihat seperti\n" +
                "    kerangka yang menyusun kubus. Kubus mnemiliki 12 rusuk. Perhatikan gambar\n" +
                "    kubus diatas, yang merupakan Rusuk yaitu AB, BC, CD, DA, AE, BF, CG, DH, EF,\n" +
                "    FG, GH, dan HE.\n" +
                "  </p>\n" +
                "  <li>Titik Sudut</li>\n" +
                "  <p>\n" +
                "    Titik sudut adalah titik potong antara dua atau tiga rusuk. Pada gambar\n" +
                "    kubus yang sama yaitu kubus ABCD.EFGH terlihat bahwa kubus tersebut memiliki\n" +
                "    8 sudut, yaitu; A, B, C, D, E, F, G dan H.\n" +
                "  </p>\n" +
                "  <li>Diagonal bidang atau diagonal sisi</li>\n" +
                "  <p>\n" +
                "    Sekali lagi marilah kita perhatikan gambar kubus ABCD.EFGH di atas, jika\n" +
                "    kita menginginkan menarik garis pada masing-masing sudut yang berhadapan\n" +
                "    pada setia sisi atau bidang maka kita akan menemukan garis yang akan\n" +
                "    membentuk segitiga sama kaki, garis tersebut disebut diagonal bidang atau\n" +
                "    diagonal sisi. <br />\n" +
                "    <br />\n" +
                "\n" +
                "    Pada kubus ABCD.EFGH memiliki 12 diagonal bidan atau diagonal sisi yaitu AF,\n" +
                "    BE, BG, FC, CH, DG, AH, DE, BD, AC, EG dan HG.\n" +
                "  </p>\n" +
                "  <li>Diagonal ruang</li>\n" +
                "  <p>\n" +
                "    Diagonal ruang adalah garis yang menghubungkan dua titik sudut yang saling\n" +
                "    berhadapan dalam satu ruang. <br />\n" +
                "    <br />\n" +
                "\n" +
                "    Pada kubus ABCD.EFGH tersebut terdapat 4 diagonal ruang, yaitu garis BH, DF,\n" +
                "    AG, dan EC.\n" +
                "  </p>\n" +
                "  <li>Bidang diagonal</li>\n" +
                "  <p>\n" +
                "    Bidang diagonal adalah bidang yang dibentuk dari dua garis diagonal bidang\n" +
                "    dan dua rusuk kubus yang sejajar. <br />\n" +
                "    <br />\n" +
                "\n" +
                "    Pada kubus ABCD. EFGH tersebut memiliki 4 bidang diagonal, yaitu; bidang\n" +
                "    diagonal ACGE, DBFH, ABGH dan EFCD.\n" +
                "  </p>\n" +
                "</ol>\n" +
                "<br><br>"+
                "<h1>Balok</h1>\n" +
                "<h3>Sifat-Sifat Balok</h3>\n" +
                "<p>\n" +
                "  Sisi-sisi balok berbentuk persegipanjang.<br />\n" +
                "  Rusuk-rusuk yang sejajar memiliki ukuran sama panjang. <br />\n" +
                "  Setiap diagonal bidang pada sisi yang berhadapan memiliki ukuran sama panjang.\n" +
                "  <br />\n" +
                "  Setiap diagonal ruang pada balok memiliki ukuran sama panjang. <br />\n" +
                "  Setiap bidang diagonal pada balok memiliki bentuk persegipanjang. <br />\n" +
                "</p>\n" +
                "\n" +
                "<h2>Unsur-unsur balok</h2>\n" +
                "<h4>\n" +
                "  1.Sisi atau Bidang\n" +
                "</h4>\n" +
                "<p>\n" +
                "  Sisi balok adalah bidang yang membatasi suatu balok. Dari Gambar Di atas,\n" +
                "  terlihat bahwa balok ABCD.EFGH memiliki 6 buah sisi berbentuk persegipanjang.\n" +
                "  Keenam sisi tersebut adalah sebagai berikut;\n" +
                "</p>\n" +
                "<p>\n" +
                "  a. ABCD (sisi bawah),<br />\n" +
                "  b. EFGH (sisi atas),<br />\n" +
                "  c. ABFE (sisi depan),<br />\n" +
                "  d. DCGH (sisi belakang),<br />\n" +
                "  e. BCGF (sisi samping kiri), dan<br />\n" +
                "  f. ADHE (sisi samping kanan).\n" +
                "</p>\n" +
                "<p>\n" +
                "  Sebuah balok memiliki tiga pasang sisi yang berhadapan yang sama bentuk dan\n" +
                "  ukurannya. Ketiga pasang sisi tersebut adalah;\n" +
                "</p>\n" +
                "<p>\n" +
                "  a. Sisi ABFE dengan sisi DCGH,<br />\n" +
                "  b. Sisi ABCD dengan sisi EFGH, dan<br />\n" +
                "  c. Sisi BCGF dengan sisi ADHE.\n" +
                "</p>\n" +
                "<h4>2. Rusuk</h4>\n" +
                "<p>\n" +
                "  Sama seperti dengan kubus, balok ABCD.EFGH memiliki 12 rusuk. Coba perhatikan\n" +
                "  kembali Gambar tersebut secara seksama. Rusuk-rusuk balok ABCD. EFGH adalah\n" +
                "  AB, BC, CD, DA, EF, FG, GH, HE, AE, BF, CG, dan HD.\n" +
                "</p>\n" +
                "<h4>\n" +
                "  3. Titik sudut\n" +
                "</h4>\n" +
                "<p>\n" +
                "  Dari Gambar tersebut di atas, terlihat bahwa balok ABCD.EFGH memiliki 8 titik\n" +
                "  sudut, yaitu A, B, C, D, E, F, G, dan H. Sama halnya dengan kubus, balok pun\n" +
                "  memiliki istilah diagonal bidang, diagonal ruang, dan bidang diagonal. Berikut\n" +
                "  ini adalah uraian mengenai istilah-istilah berikut.\n" +
                "</p>\n" +
                "\n" +
                "<h4>\n" +
                "  4. Diagonal bidang atau diagonal sisi\n" +
                "</h4>\n" +
                "<p>\n" +
                "  Pada gambar balok ABCD.EFGH di atas, &nbsp;Ruas garis AC yang melintang antara\n" +
                "  dua titik sudut yang saling berhadapan pada satu bidang, yaitu titik sudut A\n" +
                "  dan titik sudut C, dinamakan diagonal bidang balok ABCD.EFGH.\n" +
                "</p>\n" +
                "<p>\n" +
                "  Setiap balok memiliki 6 (sisi) dan setiap sisi memiliki 2 (dua) diagonal, maka\n" +
                "  dapat disimpulkan bahwa sebuah balok memiliki 12 diagonal bidang atau diagonal\n" +
                "  sisi.\n" +
                "</p>\n" +
                "<h4>\n" +
                "  5. Diagonal ruang\n" +
                "</h4>\n" +
                "<p>\n" +
                "  Ruas garis CE yang menghubungkan dua titik sudut C dan E pada balok ABCD.EFGH\n" +
                "  seperti pada Gambar tersebut disebut diagonal ruang balok tersebut.\n" +
                "</p>\n" +
                "<p>\n" +
                "  Jadi, diagonal ruang terbentuk dari ruas garis yang menghubungkan dua titik\n" +
                "  sudut yang saling berhadapan di dalam suatu bangun ruang.\n" +
                "</p>\n" +
                "<p>\n" +
                "  Sebagaimana halnya dengan kubus, Pada setiap balok memiliki 4 (empat diagonal\n" +
                "  ruang).\n" +
                "</p>\n" +
                "<h4>\n" +
                "  6. Bidang diagonal\n" +
                "</h4>\n" +
                "<p>\n" +
                "  Sekarang, perhatikan balok ABCD.EFGH pada Gambar tersebut. Dari gambar\n" +
                "  tersebut terlihat dua buah diagonal bidang yang sejajar, yaitu diagonal bidang\n" +
                "  HF dan DB.\n" +
                "</p>\n" +
                "<p>\n" +
                "  Kedua diagonal bidang tersebut beserta dua rusuk balok yang sejajar, yaitu DH\n" +
                "  dan BF membentuk sebuah bidang diagonal. Bidang BDHF adalah salah satu bidang\n" +
                "  diagonal balok ABCD.EFGH.\n" +
                "</p>\n" +
                "<p>\n" +
                "  Sama halnya dengan kubus, pada setiap balok juga memiliki 4 (empat) bidang\n" +
                "  diagonal di dalamnya.\n" +
                "</p>\n";
        mWebView.loadDataWithBaseURL(null, htmlDocument, "text/HTML", "UTF-8", null);


        return view;
    }
}
