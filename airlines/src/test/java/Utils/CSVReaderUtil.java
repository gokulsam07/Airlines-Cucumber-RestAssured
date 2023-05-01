package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import airlines.payloads.AirlinePOJO;


public class CSVReaderUtil {
	public static ArrayList<AirlinePOJO> readAllData() throws FileNotFoundException, IOException, CsvException {

		String filePath = "./airlineTestData.csv";
		ArrayList<AirlinePOJO> userList;
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			List<String[]> csvData = reader.readAll();
			userList= new ArrayList<>();

			// Skip the first row (column names)
			for (int i = 1; i < csvData.size(); i++) {
				String[] rowData = csvData.get(i);

				if (rowData.length == 7) {
					int id = Integer.parseInt(rowData[0]);
					String name = rowData[1];
					String country = rowData[2];
					String logo = rowData[3];
					String head_quaters = rowData[4];
					String website = rowData[5];
					int established = Integer.parseInt(rowData[6]);

					AirlinePOJO user = new AirlinePOJO(id,  name,  country,  logo,  head_quaters,  website, established );
					userList.add(user);
				}
			}
		}
		return userList;
	}
}
