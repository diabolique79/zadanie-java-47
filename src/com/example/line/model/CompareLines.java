package com.example.line.model;

public  class CompareLines {

    private Line line1;
    private Line line2;

//    public CompareLines(Line line1, Line line2) {
//
//        this.line1 = line1;
//        this.line2 = line2;
//    }

    public Line compareLine(Line line1, Line line2){

        if (line1.getLength() > line2.getLength()){

            return line1;

        }
        else if (line2.getLength() > line1.getLength()){

            return line2;

        }

        else {

            return line1;
        }


//        {
//
//            System.out.printf("Odcinek AB o długości %.2f jest dłuższy od odcinka CD o długości %.2f", line1.getLength(), line2.getLength());
//        }
//
//        else if (line2.getLength() > line1.getLength()){
//            System.out.printf("Odcinek CD o długości %.2f jest dłuższy od odcinka AB o długości %.2f", line2.getLength(), line1.getLength());
//        }
//
//        else {
//
//            System.out.println("Oba odcinki są sobie równe.");
//        }




    }
}
