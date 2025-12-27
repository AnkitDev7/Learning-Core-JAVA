package Basic;

import java.util.Date;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        System.out.println("------------------------Welcome to My Library------------------------");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your Class :- ");
        String userClass = Sc.nextLine();
        System.out.println("Class Name :- " + userClass );
        System.out.println("-----------------------------");

        if (userClass.equalsIgnoreCase("B.tech")){
            String[] btechBook = {
                    "[1].C Programing" ,
                    "[2].C++ Programing" ,
                    "[3].JAVA Programing" ,
                    "[4].Python Programing",
                    "[5].Data Base Management System",
            };

            System.out.println("All B.tech Book Details :- ");
            for (String a : btechBook){
                System.out.println("          " + a);
            }
            System.out.println("-------------------------------------------");

            System.out.println("Choose a Book (1,2,3,4,5) :- ");
            int bookDetails = Sc.nextInt();
            System.out.println("Book Number :- " + bookDetails);

            if (bookDetails <= 1){
                System.out.println("-------------------------------------------");
                System.out.println("C Programing Book Details :- ");
                String[] cProgramingBook = {
                        "[1].Let us C" ,
                        "[2].The C Programing Language",
                        "[3].Programing in ANSI C",
                        "[4].Head First C",
                        "[5].How to Program" ,
                        "[6].Problem Solving With C "
                };
                for (String b : cProgramingBook){
                    System.out.println("           " + b);
                };

                bookDetails(Sc, cProgramingBook , 5);

            } else if (bookDetails <= 2) {
                System.out.println("-------------------------------------------");
                System.out.println("Cpp Programing Book Details :- ");
                String[] cppProgramingBooks = {
                        "[1].The C++ Programming Language",
                        "[2].Effective C++",
                        "[3].More Effective C++",
                        "[4].C++ Primer",
                        "[5].Programming: Principles and Practice Using C++",
                        "[6].Object-Oriented Programming in C++",
                        "[7].C++ Complete Reference",
                        "[8].Effective Modern C++",
                        "[9].Accelerated C++",
                        "[10].Head First C++"
                };
                for (String c : cppProgramingBooks){
                    System.out.println("        " + c);
                }

                bookDetails(Sc, cppProgramingBooks , 9);

            } else if (bookDetails <= 3) {
                System.out.println("-------------------------------------------");
                System.out.println("JAVA Programing Book Details :- ");
                String[] JAVAProgramingBooks = {
                        "[1].The JAVA Programming Language",
                        "[2].Effective JAVA",
                        "[3].More Effective JAVA",
                        "[4].JAVA Primer",
                        "[5].Principles and Practice Using JAVA",
                        "[6].Object-Oriented Programming in JAVA",
                        "[7].JAVA Complete Reference",
                        "[8].Effective Modern JAVA",
                        "[9].Accelerated JAVA",
                        "[10].Head First JAVA"
                };
                for (String D : JAVAProgramingBooks){
                    System.out.println("        " + D);
                }

                bookDetails(Sc, JAVAProgramingBooks , 9);

            } else if (bookDetails <= 4) {
                System.out.println("-------------------------------------------");
                System.out.println("Python Programing Book Details :- ");
                String[] python_books = {
                        "[1].Python Crash Course",
                        "[2].Automate the Boring Stuff with Python",
                        "[3].Fluent Python",
                        "[4].Learn Python the Hard Way",
                        "[5].Effective Python",
                };
                for (String E : python_books){
                    System.out.println("          " + E);
                }

                bookDetails(Sc, python_books,4);

            } else if (bookDetails <= 5) {
                System.out.println("-------------------------------------------");
                System.out.println(" Data Base Management System Book Details :- ");
                String[] dbmsBooks = {
                        "[1].Database System Concepts",
                        "[2].Fundamentals of Database Systems",
                        "[3].Database Management Systems",
                        "[4].An Introduction to Database Systems",
                        "[5].Database Systems: The Complete Book"
                };
                for (String F : dbmsBooks){
                    System.out.println("       " + F);
                }

              bookDetails(Sc , dbmsBooks , 4);
            }
        }else {
            System.out.println("-------------------------------------------");
            System.out.println("Books Abhi " + userClass + " ka nahi hai bad me aaye Library me");
        }

    }

    // Method
    private static void bookDetails(Scanner Sc, String[] cProgramingBook,int bookNumber) {
           System.out.println("-------------------------------------------");
           System.out.println("Enter the Book number (1 to " + bookNumber + " ) access the Book :- ");
           int BookName = Sc.nextInt();
           System.out.println("Access the Book Number :- " + BookName);
           System.out.println("-------------------------------------------");

           System.out.println("Enter Your Name :- ");
           String studentName = Sc.nextLine();
           Sc.nextLine();
           System.out.println("Enter Your Student id :- ");
           String studentId = Sc.nextLine();


        if (BookName <= cProgramingBook.length){
            System.out.println("-------------------------------------------");
            System.out.println("            Student All Details :-   " );
            System.out.println("Student Name  :- " + studentName);
            System.out.println("Student IdNumber :- " + studentId);
            System.out.println("-------------------------------------------");
            System.out.println("           Book Access SucessFul :- ");
            System.out.println("-------------------------------------------");
            System.out.println("Your Book name is :- ");
            System.out.println("           " + cProgramingBook[BookName]);
            System.out.println("-------------------------------------------");
            System.out.println("Note:- Agar Tum Return Date tak book jama nahi karoge  to Per Day 20 Repess fine Dena Padega   ");
        }
    }
}
