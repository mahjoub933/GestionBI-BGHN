package tn.esprit.spring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tn.esprit.spring.uti.pdf.PDFGenerator;

@SpringBootApplication
public class SoftBghnApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SoftBghnApplication.class, args);
	}

}
