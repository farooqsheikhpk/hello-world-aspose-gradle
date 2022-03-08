package com.aspose.total.demo.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aspose.words.Document;
import com.aspose.words.ImportFormatMode;
import com.aspose.words.SaveFormat;


public class HelloWorld {

  public static void main(final String[] args) throws Exception {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
    final LocalDateTime now = LocalDateTime.now();

		System.out.println("Hello, World! The current time is " + dtf.format(now));
	
	 // The path to the documents directory.
		String dataDir = "D:\\Downloads\\";

        Document doc1 = new Document(dataDir + "compareTestDoc1.doc");
        Document doc2 = new Document(dataDir + "compareTestDoc2.doc");

        doc1.appendDocument(doc2, ImportFormatMode.KEEP_SOURCE_FORMATTING);

        doc1.save(dataDir + "AsposeMerged.doc", SaveFormat.DOC);
		
		
		
  }

}
