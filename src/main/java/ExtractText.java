package main.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class ExtractText {
    public static void main(String args[]) throws IOException {
        File file = new File("/home/adhandav/Documents/sample.pdf");
        PDDocument document = PDDocument.load(file);
//      s.addPage(new PDPage());
//      s.save("/home/adhandav/Downloads/test.pdf");
        System.out.println(document.getNumberOfPages());

        PDFTextStripper ps = new PDFTextStripper();
        String text = ps.getText(document);
        System.out.println(document);
        document.close();
    }
}
