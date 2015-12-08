package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. ������ ������ Solution ������ public static ������ Man � Woman.
2. � ������� ������ ���� ����: name(String), age(int), address(String).
3. ������ ������������, � ������� ���������� ��� ��������� ���������.
4. ������ �� ��� ������� ������� ������ �� ����� ������� ��������� �����������.
5. ������� ������ �� ����� � ����� ������� [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //������ �� ��� ������� ������� ������ ���
        Man man1 = new Man("Vasya1", 40, "Bon");
        Man man2 = new Man("Vasya2", 44, "Bot");
        Woman woman1 = new Woman("Vasya3", 40, "Bon");
        Woman woman2 = new Woman("Vasya4", 44, "Bot");
        //������ �� �� ����� ���
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //�������� ��� ���� ������
    public static class Man
    {
        private String name, address = null;
        private int age = 0;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        private String name, address = null;
        private int age = 0;

        public Woman (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}