package com.company;

import java.util.Scanner;

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
