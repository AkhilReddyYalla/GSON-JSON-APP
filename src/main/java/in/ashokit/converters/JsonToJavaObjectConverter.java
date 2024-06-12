package in.ashokit.converters;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import in.ashokit.model.Product;

// This class is used to convert Json String to java object
public class JsonToJavaObjectConverter {

	public static void main(String[] args) throws Exception {

		// pointing to json file data using reader
		FileReader fr = new FileReader("Product.json");

		// creating gson class object
		Gson gson = new Gson();

		// Converting json file data to java object
		Product p = gson.fromJson(fr, Product.class);

		System.out.println(p);

	}
}