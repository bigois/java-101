package br.com.bigois.autocloseable;

import br.com.bigois.optional.Person;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class AutoCloseableApp {
	public static void main(String[] args) throws IOException {
		// Get report data and settings
		ReportData reportData = new ReportData();
		List<Person> people = reportData.getPersonList();
		List<String> columns = reportData.getColumns();
		Path reportPath = reportData.getReportPath();

		// Generate report using try-with-resources to ensure proper resource management
		try (XSSFWorkbook workbook = new XSSFWorkbook();
		     FileOutputStream out = new FileOutputStream(reportPath.toFile())) {
			// Create sheet
			Sheet sheet = workbook.createSheet("People");

			// Create header style
			CellStyle headerStyle = workbook.createCellStyle();
			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerStyle.setFont(headerFont);

			// Write header
			Row header = sheet.createRow(0);
			for (int i = 0; i < columns.size(); i++) {
				Cell cell = header.createCell(i);
				cell.setCellValue(columns.get(i));
				cell.setCellStyle(headerStyle);
			}

			// Write rows
			int rowIndex = 1;
			for (Person person : people) {
				Row row = sheet.createRow(rowIndex++);
				row.createCell(0).setCellValue(person.getFirstName());
				row.createCell(1).setCellValue(person.getMiddleName().orElse(""));
				row.createCell(2).setCellValue(person.getLastName());
			}

			// Resize rows based on content
			for (int i = 0; i < columns.size(); i++) {
				sheet.autoSizeColumn(i);
			}

			// Write workbook to file
			workbook.write(out);
		}

		System.out.println("Report generated at: " + reportPath);
	}

}
