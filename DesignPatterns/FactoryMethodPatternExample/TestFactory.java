public class TestFactory {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}


/*OUTPUT:
    "c:\Users\monik\OneDrive\文件\Desktop\Placement-Preparation-2026\DesignPatterns\FactoryMethodPatternExample\" && javac TestFactory.java && java TestFactory
Opening Word Document
Opening PDF Document
Opening Excel Document


*/