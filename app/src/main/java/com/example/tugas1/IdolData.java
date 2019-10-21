package com.example.tugas1;

import java.util.ArrayList;

public class IdolData {
    private static String[] idolNames = {
            "Bangchan",
            "Changbin",
            "Dongpyo",
            "Felix",
            "Han",
            "Hyunjin",
            "IN",
            "Lee Know",
            "Seungmin",
            "Seungwoo",
            "Woojin"
    };

    private static String[] idolDetails = {
            "Bangchan lahir besar di Sydney, Australia lahir pada 3 Oktober 1997. Golongan darah O.",
            "Seo Changbin lahir di Yongin pada 11 Agustus 1999. Golongan darah O.",
            "Son Dongpyo dari Yeongdeok-gun lahir pada 9 September 2002. Golongan darah O.",
            "Lee Felix lahir di Sydney Australia pada 15 September 2000. Golongan darah AB.",
            "Han Jisung lahir di Incheon pada 14 September 2000. Golongan darah B.",
            "Hwang Hyunjin lahir di Seoul pada 20 Maret 2000. Golongan darah B.",
            "Yang Jeongin lahir di Busan pada 8 Februari 2001. Golongan darah A.",
            "Lee Minho nama asli Lee Know lahir di Gimpo pada 25 Oktober 1998. Golongan darah O.",
            "Kim Seungmin lahir di Seoul pada 22 September 2000. Golongan darah A.",
            "Han Seungwoo daru Bukgu, Busan lahir pada 24 Desember 1994. Golongan darah B.",
            "Kim Woojin lahir di Daejeon pada 8 April 1997. Golongan darah B."
    };

    private static int[] idolsImages = {
            R.drawable.bangchan,
            R.drawable.changbin,
            R.drawable.dongpyoy,
            R.drawable.felix,
            R.drawable.han,
            R.drawable.hyunjin,
            R.drawable.in,
            R.drawable.leeknow,
            R.drawable.seungmin,
            R.drawable.seungwoo,
            R.drawable.woojin
    };

    static ArrayList<Idol> getListData(){
        ArrayList<Idol> list = new ArrayList<>();
        for (int position = 0; position < idolNames.length; position++){
            Idol idol = new Idol();
            idol.setName(idolNames[position]);
            idol.setDetail(idolDetails[position]);
            idol.setPhoto(idolsImages[position]);
            list.add(idol);
        }
        return list;
    }
}
