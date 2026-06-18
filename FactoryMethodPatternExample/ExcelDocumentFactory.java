public class ExcelDocumentFactory extends DocumentFactory {
   public ExcelDocumentFactory() {
   }

   public Document createDocument() {
      return new ExcelDocument();
   }
}
