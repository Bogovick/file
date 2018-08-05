package com.company;

import java.util.Scanner;

//Создайте класс DocumentWorker. В теле класса создайте три метода
//OpenDocument(), EditDocument(), SaveDocument(). В тело каждого из
//методов добавьте вывод на экран соответствующих строк: "Документ
//открыт", "Редактирование документа доступно в версии Про",
//"Сохранение документа доступно в версии Про". Создайте
//производный класс ProDocumentWorker. Переопределите
//соответствующие методы, при переопределении методов выводите
//следующие строки: "Документ отредактирован", "Документ сохранен в
//старом формате, сохранение в остальных форматах доступно в версии
//Эксперт". Создайте производный класс ExpertDocumentWorker от
//базового класса ProDocumentWorker. Переопределите соответствующий
//метод. При вызове данного метода необходимо выводить на экран
//"Документ сохранен в новом формате". В теле метода Main() реализуйте
//возможность приема от пользователя номера ключа доступа pro и exp.
//Если пользователь не вводит ключ, он может пользоваться только
//бесплатной версией (создается экземпляр базового класса), если
//пользователь ввел номера ключа доступа pro и exp, то должен
//создаться экземпляр соответствующей версии класса, приведенный к
//базовому - DocumentWorker.


class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a;
        System.out.println("У вас есть ключ доступа?");
        System.out.println("1 = Да, 2 = Нет");
        a = scanner.next();

        switch (a){
            case "1": {
                String key;
                System.out.println("Введите ключ = ");
                key = scanner.next();

                    if (key.equals("pro")) {

                        ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                        proDocumentWorker.OpenDocument();
                        proDocumentWorker.EditDocument();
                        proDocumentWorker.SaveDocument();
                        proDocumentWorker.Expert();
                        System.out.println();
                        break;

                    }
                if (key.equals("exp")) {

                    ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                    expertDocumentWorker.OpenDocument();
                    expertDocumentWorker.EditDocument();
                    expertDocumentWorker.SaveDocument();
                    System.out.println();
                    break;

                }
                else {
                    System.out.println("Введен не верный ключ");
                    System.out.println("Повторите попытку");
                    break;
                }

            }
            case "2": {

            }
        DocumentWorker documentWorker = new DocumentWorker();
        documentWorker.OpenDocument();
        documentWorker.EditDocument();
        documentWorker.SaveDocument();
        System.out.println();

        }






    }
}
