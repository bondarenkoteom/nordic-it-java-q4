package com.homework1;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        var sentence1 = new StringWords("Повторяю он оттуда не выйдет убежденно сказал прыщавый качая головой");
        var sentence2 = new StringWords(
                "Толстяк в желтой куртке переступил с ноги на ногу кашлянул снял с головы берет");
        var sentence3 = new StringWords("Упитанная кобыла да и вьюки плотно набиты.");
        var sentence4 = new StringWords("Молчите солтыс и не встревайте а то шишку заработаете");
        ArrayList<StringWords> sentMain = new ArrayList<StringWords>();
        sentMain.add(sentence1);
        sentMain.add(sentence2);
        sentMain.add(sentence3);
        sentMain.add(sentence4);

        StringWords sents = new StringWords();
    }

}
