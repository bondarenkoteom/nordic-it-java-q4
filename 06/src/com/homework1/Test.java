package com.homework1;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        var sentence1 = new StringWords("�������� �� ������ �� ������ ��������� ������ �������� ����� �������");
        var sentence2 = new StringWords(
                "������� � ������ ������ ���������� � ���� �� ���� �������� ���� � ������ �����");
        var sentence3 = new StringWords("��������� ������ �� � ����� ������ ������.");
        var sentence4 = new StringWords("������� ������ � �� ���������� � �� ����� �����������");
        ArrayList<StringWords> sentMain = new ArrayList<StringWords>();
        sentMain.add(sentence1);
        sentMain.add(sentence2);
        sentMain.add(sentence3);
        sentMain.add(sentence4);

        StringWords sents = new StringWords();
    }

}
